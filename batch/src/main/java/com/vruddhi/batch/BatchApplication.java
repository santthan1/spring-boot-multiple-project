package com.vruddhi.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.vruddhi.business.BusinessEntity;



@SpringBootApplication
@ComponentScan(basePackages = {"com.vruddhi.*"})
@EntityScan(basePackages = {"com.vruddhi.*"})
public class BatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchApplication.class, args);
		System.out.println(BusinessEntity.getBusinessData());
	}

}
