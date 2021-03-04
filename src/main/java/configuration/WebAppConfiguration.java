package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import daointerfaceses.ItemDao;
import daointerfaceses.UserDao;
import service_classes.ItemDaoImplimentation;
import service_classes.UserDaoImplimentation;

@EnableWebMvc
@Configuration
@ComponentScan({"configuration","controller","daointerfaceses","pojo_classes","service_classes"})
public class WebAppConfiguration extends WebMvcConfigurationSupport
{

	// this beans is use for get view resolver
	@Bean
	public InternalResourceViewResolver getView()
	{
		InternalResourceViewResolver iv=new InternalResourceViewResolver();
		
		iv.setPrefix("/");
		iv.setSuffix(".jsp");
		return iv;	
	}
	
	//this bean is use for get data source...
	@Bean
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		 ds.setUrl("jdbc:mysql://localhost:3306/hostbooks");
		 ds.setUsername("root");
		 ds.setPassword("Mauli@1997");
		 
		 return ds;
	}
	
	//this bean is use for get data source for userdao implementation class...
	@Bean
	public UserDao getUserDataSource()
	{
		UserDao ud=new UserDaoImplimentation(getDataSource());
		return ud;
	}
	
	//====this bean is use for get data source for item dao implimentation class
	@Bean
	public ItemDao getItemDataSource()
	{
		ItemDao id=new ItemDaoImplimentation(getDataSource());
		return id;
	}
	
	//============Multipart resolver bean for using multipart files or photo==========================
	
		@Bean
		public MultipartResolver multipartResolver() {
			return new CommonsMultipartResolver();
		
		}

}
