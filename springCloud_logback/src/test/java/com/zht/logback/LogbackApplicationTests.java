package com.zht.logback;



//import com.zht.logback.common.ServerResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zht.logback.common.ServerResponse;
import com.zht.logback.common.util.JsonUtil;
import com.zht.logback.entity.User;
import com.zht.logback.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by 15072 on 2018/1/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogbackApplicationTests {

	@Autowired
	private UserService userService;

	Gson gson = new GsonBuilder().create();


	@Test
	public void testLogger() {
//		List<User> users =  userService.findByUsername();
//		String user = JsonUtil.obj2StringPretty(users);
//		log.info(user);

//		String json = gson.toJson(users);
//		log.info("new Json: >>>>>>"+json);

	}
}