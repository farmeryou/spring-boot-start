package com.start.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController implements  EnvironmentAware {
    private static final Logger logger = LoggerFactory.getLogger(PageController.class);
       
    @RequestMapping("/page")
    public ModelAndView topage(){
        logger.debug("日志输出测试 Debug");
        logger.trace("日志输出测试 Trace");
        logger.info("日志输出测试 Info");
        ModelAndView mv =new ModelAndView("page1");
        mv.addObject("content", "java");
        return mv;
    }

    @Override
    public void setEnvironment(Environment env) {   
        String s = env.getProperty("JAVA_HOME");
        System.out.println("+++++++++++++++++++++++++=============="+s);
    }
}
