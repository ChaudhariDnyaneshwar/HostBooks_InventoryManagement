package service_classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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

	//This method is use to validate user information from database....
	public int getUserValidate(User u) {
		
		String query="select * from user where fname='"+u.getFname()+"' and mail='"+u.getMail()+"'";
		
		RowMapper<User> rowMapper=new RowMapper<User>() {

			public User mapRow(ResultSet req, int row) throws SQLException {
				User u=new User();
				u.setFname(req.getString("fname"));
				u.setMail(req.getString("mail"));
				return u;
			}
		};
		List<User> list=jdbctemplate.query(query,rowMapper);
		 int a=list.size()>0?1:0;
		return a;
	}

	// This method is use for get all users form database...
	
	public List<User> getAllUser() {
		
		String query="select * from user";
		
		RowMapper<User> rowMapper=new RowMapper<User>() {

			public User mapRow(ResultSet req, int row) throws SQLException {
				User u=new User();
				u.setUid(req.getInt("uid"));
				u.setSalutation(req.getString("salutation"));
				u.setFname(req.getString("fname"));
				u.setLname(req.getString("lname"));
				u.setGeneder(req.getString("geneder"));
				u.setMob(req.getString("mobile_no"));
				u.setMail(req.getString("mail"));
				u.setAddress(req.getString("address"));
				u.setRole(req.getString("roles"));
				u.setStatus(req.getString("user_status"));
				return u;
			}
		};
		List<User> list=jdbctemplate.query(query,rowMapper);
		return list;
	}

}
