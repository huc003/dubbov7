package com.example.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by hucheng on 2017/11/18.
 */
@Configuration
@ServletComponentScan
@EnableAutoConfiguration//允许自动配置
@PropertySource("classpath:dubbo/dubbo.properties")
@ImportResource({ "classpath:dubbo/dubbo-service.xml" })
public class DubboConfig {

}
