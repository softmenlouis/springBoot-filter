package test.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.model.TestBean;

@RestController
public class TestController {
	@RequestMapping("/testRest")
	public TestBean testRest(@RequestBody TestBean testBean){
		System.out.println("in controller");
//		System.out.println(testBean.getDesction());
		return testBean;
	}
}