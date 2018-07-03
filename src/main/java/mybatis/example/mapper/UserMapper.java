package mybatis.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mybatis.example.dto.UserDTO;
import mybatis.example.model.User;

@Mapper
public interface UserMapper {
	public void insert(User user);
	public void delete(User user);
	public void update(User user);
	public User selectById(String userId);
	public List<User> selectByName(String userName);
	public List<UserDTO> selectByDpt(String dptId);
}
