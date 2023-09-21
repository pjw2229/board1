package edu.mit.service;

import java.util.List;

import edu.mit.domain.ProductVO;
import edu.mit.mapper.ProductMapper;

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
	public long delete(ProductVO vo) {
		return pm.delete(vo);
	}

}
