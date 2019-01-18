package com.lw.services;

import com.lw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * &lt;一句话功能简述&gt;
 * &lt;功能详细描述&gt;
 *
 * @author 刘伟
 * @version [版本号, 2019年 01月 18 日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 **/
public interface UserService extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}
