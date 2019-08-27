package com.shmy.dxs.common.config.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhanghj
 * @Date: 2019/8/27 13:46
 * @Version: 1.0
 */
@Configuration
@MapperScan("com.shmy.dxs.*.dao")
public class MyBatisConfig {
}
