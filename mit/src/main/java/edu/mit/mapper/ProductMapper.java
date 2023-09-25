package edu.mit.mapper;

import java.util.List;

import edu.mit.domain.GroupCodeVO;
import edu.mit.domain.ProductVO;

public interface ProductMapper {
	List<GroupCodeVO> readGroupCode();
	long create(ProductVO vo);
	ProductVO readOne(String code);
	List<ProductVO> readList();
	long update(ProductVO vo);
	long delete(String code);
}