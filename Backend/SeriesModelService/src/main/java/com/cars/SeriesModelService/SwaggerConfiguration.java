package com.cars.SeriesModelService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@Configuration
public class SwaggerConfiguration {
    
    @Configuration
    @EnableSwagger2
    public class SpringFoxConfig {                                    
        @Bean
        public Docket api() { 
            return new Docket(DocumentationType.SWAGGER_2)  
              .select()                                  
              .apis(RequestHandlerSelectors.basePackage("com.cars.SeriesModelService.controller"))              
              .paths(PathSelectors.any())                          
              .build().apiInfo(metaInfo());                                           
        }

 

        private ApiInfo metaInfo() {
            
            ApiInfo apiInfo = new ApiInfo("SeriesModelService SWAGGER SERVICE"," "," " ," "," "," ","SeriesModelService SERVICE");
            return apiInfo;
        }
    }
    

 

}