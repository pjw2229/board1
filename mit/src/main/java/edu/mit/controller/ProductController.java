package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mit.domain.ProductVO;
import edu.mit.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/product/**")
@AllArgsConstructor
public class ProductController {
	ProductService service;
	
	@GetMapping("/mainMenu")
	public void mainMenu() {
		
	}
	
	@GetMapping("/input")
	public void input(Model m) {
		m.addAttribute("groupcode", service.readGroupCode());
	}
	
	@GetMapping("/rop")
	public void rop(Model m) {
		m.addAttribute("table", service.rop());
	}
	
	@GetMapping("/check")
	public void check() {
		
	}
	
	@GetMapping("/prior")
	public void prior(Model m) {
		m.addAttribute("table", service.prior());
	}
	
	@GetMapping("/groupBy")
	public void groupBy(Model m) {
		m.addAttribute("table", service.groupBy());
	}

	@GetMapping("/checked")
	public void checked(String code, Model m) {
		m.addAttribute("groupcode", service.readGroupCode());
		m.addAttribute("product", service.readOne(code));
	}
	
	@PostMapping("/create")
	public String create(ProductVO vo) {
		service.create(vo);
		return "redirect:/product/mainMenu";
	}
	
	@PostMapping("/update")
	public String update(ProductVO vo) {
		service.update(vo);
		return "redirect:/product/check";
	}
	
	@PostMapping("/delete")
	public String delete(String code) {
		service.delete(code);
		return "redirect:/product/check";
	}
}