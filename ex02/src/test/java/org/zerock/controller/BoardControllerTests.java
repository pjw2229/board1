package org.zerock.controller;

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
import lombok.extern.log4j.Log4j;
@WebAppConfiguration	// controller의 test
@RunWith(SpringJUnit4ClassRunner.class)		// junit으로 test시 spring framework로 실행
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class BoardControllerTests {
	@Autowired
	private WebApplicationContext ctx;	// mockMvc 객체 생성에 필요
	private MockMvc mm;		// 해당 객체로 컨트롤러는 테스트한다.
	
	@Before		// junit으로 테스트 시 먼저 수행하는 메소드
	public void setup() {
		mm = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testList() throws Exception {
		log.info("url리스트 요청결과 모델데이터 : "
		+ mm.perform(MockMvcRequestBuilders.get("/board/list")).andReturn().getModelAndView().getModelMap());
	}
	
	@Test
	public void testGetRegister() throws Exception {
		log.info("url리스트 요청결과 모델데이터 : "
		+ mm.perform(MockMvcRequestBuilders.get("/board/register")).andReturn().getModelAndView().getViewName());
	}
	
	@Test
	public void testRegister() throws Exception {
		log.info("등록 처리 요청 결과 : "
		+ mm.perform(MockMvcRequestBuilders.post("/board/register")
		.param("title", "junit으로").param("content", "MockMVC으로").param("writer", "tester"))
		.andReturn().getModelAndView().getViewName());
	}
	
	@Test
	public void testGet() throws Exception {
		log.info("url 상세보기 모델데이터 : "
		+ mm.perform(MockMvcRequestBuilders.get("/board/get").param("bno", "11")).andReturn().getModelAndView().getModelMap());
	}
	
	@Test
	public void testGetRemove() throws Exception {
		log.info("url리스트 요청결과 모델데이터 : "
		+ mm.perform(MockMvcRequestBuilders.get("/board/remove")).andReturn().getModelAndView().getViewName());
	}
	
	@Test
	public void testRemove() throws Exception {
		log.info("url 삭제처리 모델데이터 : "
		+ mm.perform(MockMvcRequestBuilders.post("/board/remove").param("bno", "11")).andReturn().getModelAndView().getViewName());
	}
	
	@Test
	public void testModify() throws Exception {
		log.info("url 삭제처리 모델데이터 : "
		+ mm.perform(MockMvcRequestBuilders.post("/board/modify")
		.param("bno", "13").param("title", "junit인가?").param("content", "MockMVC인가?"))
		.andReturn().getModelAndView().getViewName());
	}
}