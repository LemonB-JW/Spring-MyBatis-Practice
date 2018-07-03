package mybatis.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mybatis.example.mapper.UserMapper;

@SpringBootApplication
@MapperScan("mybatis.example.mapper")
public class ExampleApplication {

//	@Autowired
//	private UserMapper userMapper;
	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}
	
//	public void run(String... args) throws Exception {
//		userMapper.selectById("001");
//	}
}
