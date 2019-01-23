package com.lw.controllers;

import com.lw.commons.RedisUtils;
import com.lw.models.LwPropertiy;
import com.lw.models.User;
import com.lw.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * &lt;一句话功能简述&gt; &lt;功能详细描述&gt;
 *
 * @author 刘伟
 * @version [版本号, 2019年 01月 18 日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 **/
@RestController
public class FirstController
{
    protected static final Logger logger = LoggerFactory.getLogger(FirstController.class);
    
    @Autowired
    private LwPropertiy lwPropertiy;
    
    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtils redisUtils;
    
    @RequestMapping("/getUser")
    public String hello()
    {

        if(redisUtils.hasKey("liuwei1")){
            return  redisUtils.get("liuwei1").toString();
        }
        User user= userService.findByUserNameOrEmail("liuwei1", "cc@126.com");
        redisUtils.set("liuwei1",user.getPassWord(),5);

        return  user.getPassWord();
    }
    
    @RequestMapping("/getProperty")
    public String property()
    {
        logger.error("@@@@@@@@@@@");
        return lwPropertiy.getDescription();
    }
}
