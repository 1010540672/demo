package com.example.demo.controller;



import com.example.demo.exception.CommonException;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

//@RestController = @Controller + @ResponseBody 默认直接返回json
@RestController
//用来做日志打印
@Slf4j
@RequestMapping("yqq")
public class DemoController {

	@Autowired
	Config config;
	@RequestMapping(value="test",method=RequestMethod.GET)
public String demoTest() {
	log.error("====================================================");
		 User user=new User("李华",18);
	return "第一个helloworld"+System.currentTimeMillis()+"\n"+user.toString()+config.toString();

}

	@RequestMapping(value="test2",method=RequestMethod.GET)
	public Map demoTest2() {
		log.error("===============2=====================================");
		User user=new User("李华",18);
		Map<String,Object> map=new HashMap<>();
		map.put("user",user);
		map.put("config",config);
		return map;

	}

	@RequestMapping(value="testpost",method=RequestMethod.POST)
	public Map demoTest2(@RequestBody RootData request) {
		log.error("===============testpost====================================="+request.toString());
		User user=new User("李华",18);
		Map<String,Object> map=new HashMap<>();
		map.put("user",user);
		map.put("config","收到请求了....");
		return map;

	}



	@RequestMapping(value="testPathVariable/{id}",method=RequestMethod.POST)
	public Map demoTest3(@PathVariable("id") String id,@RequestBody RootData request) {
		log.error("===============testPathVariable==================================id==="+id);
		log.error("===============testPathVariable==================================request==="+request.toString());
		User user=new User("李华",18);
		Map<String,Object> map=new HashMap<>();
		map.put("user",user);
		map.put("config","收到请求了....");
		return map;

	}





	@RequestMapping(value="param",method=RequestMethod.POST)
	public Map demoTest4(@RequestParam("id") String id,@RequestBody RootData request) {
		log.error("===============testPathVariable==================================id==="+id);
		log.error("===============testPathVariable==================================request==="+request.toString());
		User user=new User("李华",18);
		Map<String,Object> map=new HashMap<>();
		map.put("user",user);
		map.put("config","收到请求了....");
		return map;

	}


	@RequestMapping(value="RequestAttributeTest",method=RequestMethod.POST)
	public Map demoTest5(@RequestAttribute String id,@RequestBody RootData request) {
		log.error("===============RequestAttributeTest==================================id==="+id);
		log.error("===============RequestAttributeTest==================================request==="+request.toString());
		User user=new User("李华",28);
		Map<String,Object> map=new HashMap<>();
		map.put("user",user);
		map.put("config","收到请求了....");
		return map;
	}


	@RequestMapping(value="Test123456",method=RequestMethod.POST)
	public Map demoTest6(@RequestBody RootData request) {
		log.error("===============RequestAttributeTest==================================request==="+request.toString());
		throw new RuntimeException("测试异常");

//		User user=new User("李华",28);
//		Map<String,Object> map=new HashMap<>();
//		map.put("user",user);
//		map.put("config","收到请求了....");
//		return map;
	}

	@RequestMapping(value="Test1234567",method=RequestMethod.POST)
	public Map demoTest7(@RequestBody RootData request) {
		log.error("===============RequestAttributeTest==================================request==="+request.toString());
		throw new CommonException("100","哈哈");

//		User user=new User("李华",28);
//		Map<String,Object> map=new HashMap<>();
//		map.put("user",user);
//		map.put("config","收到请求了....");
//		return map;
	}
}
