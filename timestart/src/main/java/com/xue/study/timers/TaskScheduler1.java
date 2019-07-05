package com.xue.study.timers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * springboot 使用的定时任务
 * 使用@Scheduled定时器
 *  -- @EnableScheduling 开启支持定时任务
 *  -- 执行方法加@Scheduled(cron = "0 37 12 * * ?")
 *  -- @Component 可以被发现
 */

@Component
public class TaskScheduler1 {

    @Scheduled(cron = "0 37 12 * * ?")
    public void testSchedule(){
        System.out.println("现在时间："+ System.currentTimeMillis()/1000);
    }
}
