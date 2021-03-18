package com.springboot.springbootproduto.controller;

import java.lang.reflect.Method;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import com.springboot.springbootproduto.model.Produto;
import com.springboot.springbootproduto.repository.ProdutoRepository;

 @Controller
public class ProdutoController {
	 
	 @Autowired
	 private ProdutoRepository produtoRepository;
	 
	 @RequestMapping(method = RequestMethod.GET, value = "/cadastroproduto")
	 public String inicio() {
		 
		 return "cadastro/cadastroproduto";
		 
	 }
	 @RequestMapping(method = RequestMethod.POST, value = "/salvarproduto" )
	 public String salvar(Produto produto) {
		 
		 produtoRepository.save(produto);
		 
		 return "cadastro/cadastroproduto";
		 
		 
	 }
	 @RequestMapping(method = RequestMethod.GET, value = "/listaprodutos")
	 public ModelAndView produtos() {
		 ModelAndView andView = new  ModelAndView("cadastro/cadastroproduto");
		 Iterable<Produto> produtoIT = produtoRepository.findAll();
		 andView.addObject("produtos", produtoIT);
		 return andView;
	 }
	  
	
	 
}
