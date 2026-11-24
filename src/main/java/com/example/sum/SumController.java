package com.example.sum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    SumService sumService;

    @Autowired
    public SumController(SumService sumService){
        this.sumService = sumService;
    }

    public String sum(int a, int b){
        int result = sumService.sum(a, b);
        return "The sum of " + a + " and" + b +"is:" + result;
    }
}
