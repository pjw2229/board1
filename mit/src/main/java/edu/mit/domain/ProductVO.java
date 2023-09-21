package edu.mit.domain;

import lombok.Data;

@Data
public class ProductVO {
	private String code, pname;
	private Long cost, pnum, jnum, sale;
	private char gcode;
}