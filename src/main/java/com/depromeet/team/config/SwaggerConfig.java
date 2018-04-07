package com.depromeet.team.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {

        ApiInfo info = new ApiInfo("디프만 미니 프로젝트 1팀", null, "1.0", "", null, "", "", Collections.emptyList());
        return new Docket(DocumentationType.SPRING_WEB)
                .select().apis(RequestHandlerSelectors.basePackage("com.depromeet.team"))
                .build().apiInfo(info);
    }
}
