package com.vruddhi.vruddhihome.CPonBoard.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/cponboard")
public class CPonBoardController {
	
	@PostMapping(value="/getEmpDetail")
	public String getEmpDetail() {
		
		return "Fetched details";
	}

}
