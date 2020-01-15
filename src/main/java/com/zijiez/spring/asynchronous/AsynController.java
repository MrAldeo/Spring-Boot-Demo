package com.zijiez.spring.asynchronous;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhangzijie
 * @Date: 2020/1/15 17:04
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@RestController
public class AsynController {
    @Autowired
    AsynService asynService;

    @RequestMapping(value="/asyn")
    public void assetsSummary() throws InterruptedException {
        for(int n=0;n<3;n++){
            asynService.test();
        }
    }
}
