package com.org.config;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.ApiKey;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableWebMvc
public class SwaggerConfig
{

//	public static final String AUTHORIZATION_HEADER = "Authorization";
//
//	private ApiKey apiKey(){
//		return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
//	}
//
//	@Bean
//	public Docket api()
//	{
//		return new Docket(DocumentationType.SWAGGER_2).groupName("jwt-token").apiInfo(apiInfo()).select()
//				.paths(PathSelectors.ant("/*/**")).apis(RequestHandlerSelectors.basePackage("com.org")).build();
//	}
//
//	private ApiInfo apiInfo()
//	{
//		return new ApiInfoBuilder ().title("JWT Token registration validation API")
//				.description("App deals with JWT token").licenseUrl("taurus.vamsi@gmail.com").version("1.0")
//				.build();
//	}
}
