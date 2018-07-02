package mybatis.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mybatis.example.dto.UserDTO;
import mybatis.example.model.User;

@Mapper
public interface UserMapper {
	/* 
	 * ADD USERS
	 */
	public void saveUser(User user);
	
	/*
	 * DELETE USERS
	 */
	public void deleteUser(User user);
	
	/*
	 * UPDATE USERS
	 */
	public void updateUser(User user);
	
	/*
	 * SEARCH USER by ID
	 */
	public User getUserById(String userId); 
	
	/*
	 * SEARCH USER by NAME
	 */
	public List<User> getUserByName(String name);
	
	/*
	 * Search Users by Department Id
	 * Return a List of User Objects
	 */
	public List<UserDTO> getUserByDpt(String dptId);
	
	

}
