package edu.mit.service;

import java.util.List;

import edu.mit.domain.GroupCodeVO;
import edu.mit.domain.ProductVO;

public interface ProductService {
	long create(ProductVO vo);
	ProductVO readOne(String code);
	List<ProductVO> readList();
	long update(ProductVO vo);
	long delete(String code);
	List<GroupCodeVO> readGroupCode();
}