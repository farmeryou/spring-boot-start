package com.start.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyHttpSessionListener  implements HttpSessionListener  {

    

    @Override
    public void sessionCreated(HttpSessionEvent arg0) {
        
        System.out.println("session 被创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
    
        System.out.println("session 被销毁");
    }

}
