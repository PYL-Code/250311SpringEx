package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc //Spring MVC 설정을 활성화
public class MvcConfig implements WebMvcConfigurer { //spring boot에서는 만들지 않을 때가 더 많음

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable(); //기본 서블릿 처리를 활성화
	}

	//view resolver 설정
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		//뷰 파일 위치와 확장자 지정
		registry.jsp("/WEB-INF/view/", ".jsp");
	}

}
