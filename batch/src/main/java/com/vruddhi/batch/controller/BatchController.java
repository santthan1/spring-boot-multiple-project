package com.vruddhi.batch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vruddhi.business.BusinessEntity;

@RestController
public class BatchController {


    @GetMapping("/batch")
    public String getDoctors(){
        return BusinessEntity.getBusinessData();
    }


}
