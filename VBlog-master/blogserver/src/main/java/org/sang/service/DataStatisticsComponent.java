package org.sang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ Author: Fang
 * @ Date: 2022/10/16
 * @ Project: VBlog-master
 */
@Component
public class DataStatisticsComponent {
    @Autowired
    ArticleService articleService;

    //每天执行一次，统计PV
    @Scheduled(cron = "1 0 0 * * ?")
    public void pvStatisticsPerDay() {
        articleService.pvStatisticsPerDay();
    }
}
