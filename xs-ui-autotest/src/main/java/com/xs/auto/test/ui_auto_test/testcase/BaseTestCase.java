package com.xs.auto.test.ui_auto_test.testcase;

import com.microsoft.playwright.Page;
import com.xs.auto.test.ui_auto_test.entity.TestCase;
import com.xs.auto.test.ui_auto_test.entity.TestCaseConfig;
import com.xs.auto.test.ui_auto_test.log.WebsocketLogFactory;
import com.xs.auto.test.ui_auto_test.mapper.TestCaseRunInfoMapper;
import com.xs.auto.test.ui_auto_test.utils.ScreensUtil;
import com.xs.auto.test.web.api.FtpServerApi;
import com.xs.auto.test.web.websocket.WebSocketController;
import org.springframework.stereotype.Component;
import java.io.File;
import java.nio.file.Files;
import java.util.Map;

/**
 * 基础测试类
 */

@Component
public class BaseTestCase<T>{
   public Page page;
   public ScreensUtil screensUtil;
   public TestCaseRunInfoMapper testCaseRunInfoMapper;
   public FtpServerApi ftpServerApi;
   public TestCase testCase;
   public TestCaseConfig testCaseConfig;
   public WebSocketController webSocketController;
   public WebsocketLogFactory websocketLogFactory;
   public String userName;
   private boolean initialized = false;

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public Page getPage() {
      return page;
   }

   public void setPage(Page page) {
      this.page = page;
      this.screensUtil = new ScreensUtil(page);
   }

   public void setTestCase(TestCase testCase){
      this.testCase = testCase;
   }

   public void setTestCaseConfig(TestCaseConfig testCaseConfig) {
      this.testCaseConfig = testCaseConfig;
   }

   public void setTestCaseRunInfoMapper(TestCaseRunInfoMapper testCaseRunInfoMapper) {
      this.testCaseRunInfoMapper = testCaseRunInfoMapper;
   }

   public void setFtpServerApi(FtpServerApi ftpServerApi) {
      this.ftpServerApi = ftpServerApi;
   }

   public void init(Class<T> tClass){
      if (!initialized) {
         System.out.println("=== 延迟初始化 ===");
         System.out.println("初始化时的 userName: " + this.userName);
         websocketLogFactory = new WebsocketLogFactory(tClass, webSocketController, this.userName);
         websocketLogFactory.info("正在初始化baseTestCase......");
         websocketLogFactory.info("websocket链接用户：" + this.userName);
         websocketLogFactory.info("装载的测试用例类为：" + tClass.getName());
         websocketLogFactory.info("websocketLogFactory已创建......");
         initialized = true;
      }
      // 清空日志
      websocketLogFactory.clearLogs();
      System.out.println("当前日志的内容为：" + websocketLogFactory.stringBuilder.toString());
   }

   // 添加一个检查方法，确保在使用前已初始化
   protected void ensureInitialized(Class<T> tClass) {
      if (!initialized) {
         init(tClass);
      }
   }


   /**
    * 后置操作
    */
   public void after(){
      websocketLogFactory.info("baseTestCase after已执行......");
   }

   /**
    * 上传结果到minio，同时返回结果map
    */
   public Map<String,Object> resultUpload(String methodName) {
      Map<String,Object> resultMap = null;
      try {
         websocketLogFactory.info("开始执行截图上传流程...");

         // 检查必要的依赖
         if (screensUtil == null) {
            websocketLogFactory.error("screensUtil 为 null，无法截图");
            return null;
         }
         if (ftpServerApi == null) {
            websocketLogFactory.error("ftpServerApi 为 null，无法上传文件");
            return null;
         }

         websocketLogFactory.info("开始截图...");
         String localFilePath = this.screensUtil.screen(methodName, System.currentTimeMillis()+".png");
         websocketLogFactory.info("本地图片路径：" + localFilePath);

         // 检查文件是否存在
         File file = new File(localFilePath);
         if (!file.exists()) {
            websocketLogFactory.error("截图文件不存在：" + localFilePath);
            return null;
         }

         websocketLogFactory.info("截图文件存在，大小：" + file.length() + " bytes");

         // 读取文件为字节数组
         byte[] fileBytes = Files.readAllBytes(file.toPath());
         websocketLogFactory.info("文件读取完成，字节数组长度：" + fileBytes.length);

         // 检查文件大小
         if (fileBytes.length == 0) {
            websocketLogFactory.error("截图文件为空：" + localFilePath);
            return null;
         }

         // 获取文件类型
         String contentType = Files.probeContentType(file.toPath());
         websocketLogFactory.info("文件类型：" + contentType);

         // 调用字节数组版本的上传方法
         websocketLogFactory.info("开始调用FTP上传接口...");
         resultMap = ftpServerApi.uploadFileBytes(
                 fileBytes,
                 file.getName(),
                 contentType,
                 methodName
         );

         if (resultMap != null) {
            websocketLogFactory.info("上传成功的图片数据:" + resultMap);
         } else {
            websocketLogFactory.error("图片上传返回结果为null");
         }

      } catch (Exception e) {
         websocketLogFactory.error("截图上传失败: " + e.getMessage());
         e.printStackTrace();
      }

      return resultMap;
   }
}