package com.vruddhi.vruddhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vruddhi.business.BusinessEntity;

@RestController
public class BatchController {


    @GetMapping("/vruddhi")
    public String getDoctors(){
        return BusinessEntity.getBusinessData()+" In Vruddhi application";
    }


}
