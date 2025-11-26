package com.xs.auto.test.data.admin.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.xs.auto.test.commom.R;
import com.xs.auto.test.data.admin.common.PageUtils;
import com.xs.auto.test.data.admin.dao.ActivityUserPrizeDao;
import com.xs.auto.test.data.admin.dao.UserMemberFriendDao;
import com.xs.auto.test.data.admin.entity.*;
import com.xs.auto.test.data.admin.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
@DS("jogosmaster")
public class AdminController {

    @Autowired
    private UserMemberFriendRequestService userMemberFriendRequestService;

    @Autowired
    private UserMemberFriendService userMemberFriendService;

    @Autowired
    private UserMemberFriendDao userMemberFriendDao;

    @Autowired
    private UserMemberService userMemberService;

    @Autowired
    private ActivityUserPrizeDao activityUserPrizeDao;

    @Value("${script.path}")
    private String scriptPath;

    @Value("${data.number}")
    private Integer number;

    /**
     * 列表
     */
    @GetMapping("/list/users")
    public R users(){
        List<UserMemberFriendEntity> userMemberFriendEntities = userMemberFriendDao.friendList();
        for (UserMemberFriendEntity userMemberFriendEntity : userMemberFriendEntities) {
            System.out.println(userMemberFriendEntity);
        }
        return R.ok().data("page",userMemberFriendEntities);
    }

    /**
     * 添加好友请求列表
     * @return
     * @throws IOException
     */
    @GetMapping("/saveFriendRequest")
    public R saveFriendRequest() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(scriptPath)));
        String line = null;
        while ((line = bufferedReader.readLine())!=null){
            String[] account = line.split(",");
            List<UserMemberEntity> userList = userMemberService.list();
            for (int i = 0; i < number; i++) {
                UserMemberFriendRequestEntity userMemberFriendRequestEntity = new UserMemberFriendRequestEntity();
                userMemberFriendRequestEntity.setUserId(Long.valueOf(account[1]));
                userMemberFriendRequestEntity.setRequestUserId(userList.get(i).getUserId());
                userMemberFriendRequestEntity.setStatus(0);
                userMemberFriendRequestEntity.setHadReadStatus(0);
                userMemberFriendRequestEntity.setRequestTime(new Date());
                userMemberFriendRequestService.save(userMemberFriendRequestEntity);
            }
        }
        return R.ok();
    }


    /**
     * 添加好友列表
     * @return
     * @throws IOException
     */
    @GetMapping("/saveFriend")
    public R saveFriend() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(scriptPath)));
        String line = null;
        while ((line = bufferedReader.readLine())!=null){
            String[] account = line.split(",");
            List<UserMemberEntity> userList = userMemberService.list();
            for (int i = 0; i < number; i++) {
                UserMemberFriendEntity userMemberFriend = new UserMemberFriendEntity();
                userMemberFriend.setUserId(Long.valueOf(account[1]));
                userMemberFriend.setFriendId(userList.get(i).getUserId());
                userMemberFriend.setStatus(0);
                userMemberFriend.setFriendGroupId(null);
                userMemberFriend.setBlockStatus(0);
                userMemberFriend.setCreateTime(new Date());
                userMemberFriend.setLastSendTime(new Date());
                userMemberFriendService.save(userMemberFriend);
            }
        }
        return R.ok();
    }
    //TODO 我的热力币明细
    //TODO 好友申请列表
    @GetMapping("/saveActivityUserPrize")
    public R saveActivityPrize() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(scriptPath));
        String line = null;
        while ((line = bufferedReader.readLine())!=null){
            String[] account = line.split(",");
            for (int i = 0; i < 1; i++) {
                activityUserPrizeDao.saveActivityUserPrize(Integer.valueOf(account[1]),account[0]);
            }
        }
        return R.ok();
    }
    //TODO 我的实物

    //TODO 我的热力币明细
    //TODO 好友申请列表
    @GetMapping("/saveUserMessage")
    public R saveUserMessage() throws IOException {

        return R.ok();
    }

    
}
