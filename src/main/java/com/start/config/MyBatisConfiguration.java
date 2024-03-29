package com.start.config;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

    /**
     * 
     * @author Boyz
     *
     * @date 2017年10月26日
     */
    @Configuration
    public class MyBatisConfiguration {

        private static final Logger logger = LoggerFactory.getLogger(MyBatisConfiguration.class);

        @Bean
        public PageHelper pageHelper() {
            logger.info("注册MyBatis分页插件PageHelper");
            PageHelper pageHelper = new PageHelper();
            Properties p = new Properties();
            p.setProperty("offsetAsPageNum", "true");
            p.setProperty("rowBoundsWithCount", "true");
            p.setProperty("reasonable", "true");
            pageHelper.setProperties(p);
            return pageHelper;
        }
}
