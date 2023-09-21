package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)		// junit으로 test시 spring framework로 실행
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")	// spring framework 설정 파일 위치
@Log4j
public class BoardServiceTests {
	@Autowired
	private BoardService service;
	
	@Test
	public void TestGetList() {
		log.info(service.getList(new Criteria(1, 7)));
	}
	
	@Test
	public void TestGet() {
		log.info(service.get(2L));
	}
	
	@Test
	public void TestRegister() {
		BoardVO vo = new BoardVO();
		
		vo.setTitle("controller?");
		vo.setContent("이것은 컨트롤러입니까? 매퍼입니까?");
		vo.setWriter("박재웅");
		service.register(vo);
	}
	
	@Test
	public void TestModify() {
		BoardVO vo = new BoardVO();
		vo.setBno(1L);
		vo.setTitle("user과 writer");
		vo.setContent("user과 writer를 혼동해서서서ㅓㅅ서서ㅓㅓㅓㅓㅓ");
		vo.setWriter("PJW");
		
		if(service.modify(vo))
			log.info("수정 성공");
		else
			log.info("수정 실패");
	}
	
	@Test
	public void TestRemove() {
		if(service.remove(10L))
			log.info("삭제 성공");
		else
			log.info("삭제 실패");
	}
	
	@Test
	public void TestCNT() {
		//log.info("현재 글의 총 갯수 : " + service.cnt() + "개");
	}
	
	@Test
	public void TestRecom() {
		log.info("추천 + 1");
		service.recom(269L);
	}
}