package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.pesistence.DataSourceTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)		// junit으로 test시 spring framework로 실행
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")	// spring framework 설정 파일 위치
@Log4j
public class BoardMapperTests {
	@Autowired
	private BoardMapper bm;
	
	@Test
	public void TestGetList() {
		bm.getList().forEach(x->log.info(x));
	}

	@Test
	public void TestGetListWithPaging() {
		Criteria cri = new Criteria();
		cri.setType("test");
		cri.setKeyword("test");
		bm.getListWithPaging(cri).forEach(x->log.info("결과확인 : " + x));
	}
	
	@Test
	public void TestRead() {
		log.info("2번글 : " + bm.read(2L));
	}
	
	@Test
	public void TestInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("mapper test2");
		vo.setContent("내용을 입력하시오.");
		vo.setWriter("박재웅");
		bm.insert(vo);
	}
	
	@Test
	public void TestInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("mapper test2");
		vo.setContent("내용을 입력 요망");
		vo.setWriter("박재웅");
		bm.insertSelectKey(vo);
	}

	@Test
	public void TestUpdate() {
		BoardVO vo = bm.read(5L);
		vo.setTitle("mapper test5");
		vo.setContent("입력한 내용은 이렇습니다.");
		bm.update(vo);
	}
	
	@Test
	public void TestDelete() {
		bm.delete(4L);
	}
	
	@Test		// 더미 데이터 넣기
	public void insertData() {
		BoardVO vo = new BoardVO();
		for(int i = 0; i < 5; i++) {
			vo.setTitle("mapper" + i);
			vo.setContent("내용 입력" + i);
			vo.setWriter("박재웅" + i);
			bm.insert(vo);
		}
	}
	
	@Test
	public void TestRank() {
		bm.rank().forEach(x->log.info(x));
	}
	
	@Test
	public void TestCount() {
		Criteria cri = new Criteria();
		cri.setType("test");
		cri.setKeyword("내용");
		log.info("검색 글 갯수 : " + bm.count(cri) + "개");
	}
	
	@Test
	public void TestLastBoard() {
		bm.lastBoard().forEach(x->log.info(x));
	}
	
	@Test
	public void TestHourGroup() {
		bm.hourGroup().forEach(x->log.info(x.getRegDate() + " : " + x.getCount()));
	}
	
	@Test
	public void testRecom() {
		bm.recom(269L);
	}
}