package edu.mit.mapper;

import java.util.List;
import edu.mit.domain.ProductVO;

public interface ProductMapper {
	long create(ProductVO vo);
	ProductVO readOne(String code);
	List<ProductVO> readList();
	long update(ProductVO vo);
	long delete(ProductVO vo);
}