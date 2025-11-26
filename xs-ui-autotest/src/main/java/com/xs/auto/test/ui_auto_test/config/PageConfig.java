package com.xs.auto.test.ui_auto_test.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

        // 分页插件
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        paginationInnerInterceptor.setDbType(DbType.MYSQL); // 根据你的数据库类型设置
        paginationInnerInterceptor.setOverflow(true); // 超过最大页数后是否回到第一页
        paginationInnerInterceptor.setMaxLimit(1000L); // 单页分页条数限制
        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        return interceptor;
    }
}
