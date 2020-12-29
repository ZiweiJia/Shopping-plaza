package com.shopping.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.shopping.demo.mbg.mapper","com.shopping.demo.dao"})
public class MyBatisConfig {
}
