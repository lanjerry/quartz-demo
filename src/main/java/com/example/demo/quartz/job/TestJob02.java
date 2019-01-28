package com.example.demo.quartz.job;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Component("testJob02")
@Transactional
public class TestJob02 {

    public void execute() {
        System.out.println("-------------------TestJob02任务执行开始-------------------");
        System.out.println(new Date());
        System.out.println("-------------------TestJob02任务执行结束-------------------");
    }
}