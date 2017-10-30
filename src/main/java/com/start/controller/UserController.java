package com.start.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.start.domain.ScencData;
import com.start.service.ScencDataService;

@RestController
public class UserController {
    
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    
    @Autowired
    private ScencDataService  scencDataService;
    
    
    @RequestMapping("/hello")
    public  String  index(HttpServletRequest request){
        String name=request.getParameter("name");
        return name;
    }
    @RequestMapping("/list")
    public  List<ScencData>  list(){
        logger.info("读取mysql 数据");
        return scencDataService.getScencData();
    }
    
    /**
     * 分页
     * @param req
     * @return
     */
    @RequestMapping("/list1")
    public  List<ScencData>  list(HttpServletRequest req){
        logger.info("读取mysql 数据");
        PageHelper.startPage(1, 2);
        return scencDataService.getList();
    }
}
