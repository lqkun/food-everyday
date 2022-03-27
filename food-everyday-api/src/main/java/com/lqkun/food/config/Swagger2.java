package com.lqkun.food.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @className: com.lqkun.food.config-> Swagger2
 * @description:
 * @author: LQKun
 * @date: 2022-03-27 1:17
 * @version: 1.0
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    /**
     * @description 配置swagger2核心配置 docket
     *     http://localhost:8088/swagger-ui/index.html     原路径
     *     http://localhost:8088/doc.html     原路径
     * @param
     * @return
     **/
    @Bean
    public Docket createRestApi() {
        // 指定api类型为swagger2
        return new Docket(DocumentationType.SWAGGER_2)
                // 用于定义api文档汇总信息
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                        // 指定controller包
                        .basePackage("com.lqkun.food.controller"))
                // 所有controller
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 文档页标题
                .title("天天吃货 电商平台接口api")
                // 联系人信息
                .contact(new Contact("lqkun",
                        "https://www.imooc.com",
                        "653591018@qq.com"))
                // 详细信息
                .description("为天天吃货提供的api文档")
                // 文档版本号
                .version("1.0.1")
                // 网站地址
                .termsOfServiceUrl("http://localhost:8088")
                .build();
    }

}
