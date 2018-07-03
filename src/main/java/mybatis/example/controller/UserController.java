package mybatis.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import mybatis.example.dto.UserDTO;
import mybatis.example.model.User;
import mybatis.example.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("users/searchId/{id}")
	public void getUserById(@PathVariable("id") String id) {
		User user = userService.getUserById(id);
		System.out.println("success" + user.getUserName());
		//return user;
		
	}
	
	@GetMapping("users/searchName/{name}")
	List<User> getUserByName(@PathVariable("name") String name) {
		List<User> user = userService.getUserByName(name);
		System.out.println("success" + user.get(0).getUserId());
		return user;
	}
	
	@GetMapping("users/searchDpt/{Dpt}")
	List<UserDTO> getUserByDpt(@PathVariable("DptId") String dptId) {
		return userService.getUserByDpt(dptId);
	}
	
	@DeleteMapping("users/delete")
	void deleteUser(User user) {
		userService.deleteUser(user);
	}
	
	@GetMapping("users/saveUser")
	public void saveUser(User user) {
		userService.saveUser(user);
	}
	
	@PostMapping("users/update")
	public void updateUser(User user) {
		userService.updateUser(user);
	}
}
