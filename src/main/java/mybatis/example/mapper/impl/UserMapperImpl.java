package mybatis.example.mapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mybatis.example.dto.UserDTO;
import mybatis.example.mapper.UserMapper;
import mybatis.example.model.User;

@Service
public class UserMapperImpl implements UserMapper{
	@Autowired
	private UserMapper userMapper;

	/* (non-Javadoc)
	 * @see mybatis.example.mapper.UserMapper#saveUser(mybatis.example.model.User)
	 */
	@Override
	public void saveUser(User user) {
		userMapper.saveUser(user);
	}

	/* (non-Javadoc)
	 * @see mybatis.example.mapper.UserMapper#deleteUser(mybatis.example.model.User)
	 */
	@Override
	public void deleteUser(User user) {
		userMapper.deleteUser(user);
	}

	/* (non-Javadoc)
	 * @see mybatis.example.mapper.UserMapper#updateUser(mybatis.example.model.User)
	 */
	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	/* (non-Javadoc)
	 * @see mybatis.example.mapper.UserMapper#getUserByName(java.lang.String)
	 */
	@Override
	public List<User> getUserByName(String name) {
		// TODO Auto-generated method stub
		return userMapper.getUserByName(name);
	}

	/* (non-Javadoc)
	 * @see mybatis.example.mapper.UserMapper#getUserById(java.lang.String)
	 */
	@Override
	public User getUserById(String userId) {
		return userMapper.getUserById(userId);
	}

	/* (non-Javadoc)
	 * @see mybatis.example.mapper.UserMapper#getUserByDpt(java.lang.String)
	 */
	@Override
	public List<UserDTO> getUserByDpt(String dptId) {
		return userMapper.getUserByDpt(dptId);
	}
	

}
