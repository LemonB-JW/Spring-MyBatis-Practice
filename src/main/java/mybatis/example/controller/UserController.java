package mybatis.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mybatis.example.dto.UserDTO;
import mybatis.example.mapper.UserMapper;
import mybatis.example.model.User;

@RestController
public class UserController {
	@Autowired
	private UserMapper userMapper;
	
	@GetMapping("users/search/{id}")
	User getUserById(@PathVariable("id") String id) {
		return userMapper.getUserById(id);
	}
	
	@GetMapping("users/search/{name}")
	List<User> getUserByName(@PathVariable("name") String name) {
		return userMapper.getUserByName(name);
	}
	
	@GetMapping("users/search/{Dpt}")
	List<UserDTO> getUserByDpt(@PathVariable("DptId") String dptId) {
		return userMapper.getUserByDpt(dptId);
	}
	
	@DeleteMapping("users/delete/{id}")
	void deleteUser(@PathVariable("id") String id) {
		
	}
	
	@GetMapping("/saveUser")
	public void saveUser(@RequestParam Map<String, Object> paramMap) {
		String id = paramMap.get("userId").toString();
		userMapper.saveUser(paramMap.get);
		
	}
	
	
	
	
}
