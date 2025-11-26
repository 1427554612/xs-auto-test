package com.xs.auto.test.data.pay.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.xs.auto.test.commom.R;
import com.xs.auto.test.data.pay.dao.CalorcoinDetailDao;
import com.xs.auto.test.data.pay.dao.PaymentOrderDao;
import com.xs.auto.test.data.pay.entity.PaymentOrderEntity;
import com.xs.auto.test.data.pay.service.PaymentOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/pay")
@RestController
@DS("jogospay")
public class PayController {

    @Autowired
    private PaymentOrderService paymentOrderService;

    @Autowired
    private CalorcoinDetailDao calorcoinDetailDao;

    @Autowired
    PaymentOrderDao paymentOrderDao;

    @Value("${script.path}")
    private String scriptPath;

    @Value("${data.number}")
    private Integer number;
    /**
     * 列表
     */
    @GetMapping("/list/order")
    //@RequiresPermissions("admin:adchannel:list")
    public R users(){
        List<PaymentOrderEntity> list = paymentOrderService.list();
        return R.ok().data("page",list);
    }

    /**
     * 保存订单列表
     * @return
     * @throws IOException
     */
    @GetMapping("/saveOrder")
    //@RequiresPermissions("admin:adchannel:list")
    public R saveOrder() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(scriptPath));
        String line = null;
        while ((line = bufferedReader.readLine())!=null){
            String[] account = line.split(",");
            for (int i = 0; i < number; i++) {
                System.out.println(""+account[0]+","+account[1]);
                paymentOrderDao.saveOrder(UUID.randomUUID().toString().replace("-",""),Integer.valueOf(account[1]));
            }
        }
        return R.ok();
    }

    /**
     * 保存热力币C端记录
     * @return
     * @throws IOException
     */
    @GetMapping("/saveCoin")
    //@RequiresPermissions("admin:adchannel:list")
    public R saveCoin() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(scriptPath));
        String line = null;
        while ((line = bufferedReader.readLine())!=null){
            String[] account = line.split(",");
            for (int i = 0; i < number; i++) {
                System.out.println(""+account[0]+","+account[1]);
                calorcoinDetailDao.saveCoin(account[0],0);
                calorcoinDetailDao.saveCoin(account[0],1);
            }
        }
        return R.ok();
    }
}
