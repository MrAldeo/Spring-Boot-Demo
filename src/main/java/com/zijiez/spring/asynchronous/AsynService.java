package com.zijiez.spring.asynchronous;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhangzijie
 * @Date: 2020/1/15 18:08
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@Service
@Slf4j
public class AsynService {
    @Async("MyThreadLocal2")
    public void test() throws InterruptedException {
        int k = 5;
        for(int i=0;i<5;i++){
            Thread.sleep(500);
            log.info("结果"+k--);
        }
    }
}
