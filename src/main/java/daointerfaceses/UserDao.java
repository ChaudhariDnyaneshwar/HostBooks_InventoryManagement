package daointerfaceses;

import java.util.List;

import pojo_classes.User;

public interface UserDao {

	public int createUser(User u);
	public int getUserValidate(User u);
	public List<User> getAllUser();
	public int updateUser(User U);
	public int deleteUser(int id);
}
