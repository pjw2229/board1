package edu.mit.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import edu.mit.controller.ProductControllerTests;

import lombok.extern.log4j.Log4j;

@WebAppConfiguration	// controller의 test
@RunWith(SpringJUnit4ClassRunner.class)		// junit으로 test시 spring framework로 실행
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class ProductControllerTests {
	@Autowired
	private WebApplicationContext ctx;	// mockMvc 객체 생성에 필요
	private MockMvc mm;		// 해당 객체로 컨트롤러는 테스트한다.
	
	@Before		// junit으로 테스트 시 먼저 수행하는 메소드
	public void setup() {
		mm = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testMainMenu() throws Exception {
		log.info("url리스트 요청결과 모델데이터 : "
		+ mm.perform(MockMvcRequestBuilders.get("/product/mainMenu")).andReturn().getModelAndView().getModelMap());
	}
}