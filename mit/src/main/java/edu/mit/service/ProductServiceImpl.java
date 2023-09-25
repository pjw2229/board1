package edu.mit.service;

import java.util.List;

import org.springframework.stereotype.Service;
import edu.mit.mapper.ProductMapper;
import edu.mit.service.ProductServiceImpl;

import edu.mit.domain.ProductVO;
import edu.mit.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Service	// spring에 service 객체로 인식시키기 위해 사용(현재는 @Component와 같다.)
public class ProductServiceImpl implements ProductService {
	private ProductMapper pm;

	@Override
	public long create(ProductVO vo) {
		return pm.create(vo);
	}

	@Override
	public ProductVO readOne(String code) {
		return pm.readOne(code);
	}

	@Override
	public List<ProductVO> readList() {
		return pm.readList();
	}

	@Override
	public long update(ProductVO vo) {
		return pm.update(vo);
	}

	@Override
	public long delete(String code) {
		return pm.delete(code);
	}
}