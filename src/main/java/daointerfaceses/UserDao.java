package daointerfaceses;

import pojo_classes.User;

public interface UserDao {

	public int createUser(User u);
	public int getUserValidate(User u);
}
