package com.example.demo.config;

import org.quartz.Scheduler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * 任务调度配置
 *
 * @author lanjerry
 * @date 2019/1/18 17:59
 */
@Configuration
public class QuartzConfig {

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(){
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setOverwriteExistingJobs(true);//覆盖已存在的任务
        //schedulerFactoryBean.setStartupDelay(60);//延时60秒启动定时任务，避免系统未完全启动却开始执行定时任务的情况
        return schedulerFactoryBean;
    }

    // 创建schedule
    @Bean(name = "scheduler")
    public Scheduler scheduler() {
        return schedulerFactoryBean().getScheduler();
    }
}
