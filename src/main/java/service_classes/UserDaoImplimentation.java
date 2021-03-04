package service_classes;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import daointerfaceses.UserDao;
import pojo_classes.User;

public class UserDaoImplimentation implements UserDao{

	JdbcTemplate jdbctemplate;
	
	public UserDaoImplimentation(DataSource ds) {
		jdbctemplate=new JdbcTemplate(ds);
	}
	
	//This method is user for insert user data into database...
	public int createUser(User u) {
		
		String query="insert into user values(?,?,?,?,?,?,?,?,?,?)";
		int a=jdbctemplate.update(query,null,u.getSalutation(),u.getFname(),u.getLname(),u.getGeneder(),u.getMob(),u.getMail(),u.getAddress(),u.getRole(),u.getStatus());
		return a;
	}

}
