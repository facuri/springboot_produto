package com.springboot.springbootproduto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EntityScan(basePackages = "com.springboot.springbootproduto.model")
//@ComponentScan(basePackages = {"com.*"})
//@EnableJpaRepositories(basePackages = {"com.springboot.springbootproduto.repository"} )
//@EnableTransactionManagement
public class SpringbootprodutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootprodutoApplication.class, args);
	}

}
