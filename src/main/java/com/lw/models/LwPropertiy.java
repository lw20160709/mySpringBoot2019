package com.lw.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * &lt;一句话功能简述&gt;
 * &lt;功能详细描述&gt;
 *
 * @author 刘伟
 * @version [版本号, 2019年 01月 18 日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 **/
@Component
@Data
public class LwPropertiy {
    @Value("${com.lw.title}")
    private String title;

    @Value("${com.lw.description}")
    private String description;
}
