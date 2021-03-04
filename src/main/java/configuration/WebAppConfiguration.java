package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@EnableWebMvc
@Configuration
@ComponentScan({"configuration","controller","daointerfaceses","pojo_classes","service_classes"})
public class WebAppConfiguration extends WebMvcConfigurationSupport
{

	
	
}
