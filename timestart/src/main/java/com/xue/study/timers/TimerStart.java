package com.xue.study.timers;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerStart {
    public static void main(String[] args) {

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("北京时间："+System.currentTimeMillis());
                try {
                    for (int i = 0; i < 30; i++) {
                        System.out.println(""+i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("end.");
            }
        };

        Timer timer = new Timer();

        //仅调度一次， deploy --延迟5000ms
        timer.schedule(task, 5000);

    }
}
