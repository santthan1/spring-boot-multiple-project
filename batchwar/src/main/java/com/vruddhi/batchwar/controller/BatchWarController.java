package com.vruddhi.batchwar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vruddhi.business.BusinessEntity;

@RestController
public class BatchWarController {


    @GetMapping("/batch")
    public String getDoctors(){
        return BusinessEntity.getBusinessData()+"In Batch War";
    }


}
