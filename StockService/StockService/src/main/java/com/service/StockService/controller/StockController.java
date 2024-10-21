package com.service.StockService.controller;

import com.netflix.discovery.converters.Auto;
import com.service.StockService.service.StockPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("stock")
public class StockController {

    @Autowired
    private StockPriceService stockPriceService;

    @GetMapping("getPrice/{companyName}")
    public ResponseEntity<Double> fetchPriceByCompanyName(@PathVariable String companyName){
        Double price = stockPriceService.fetchPriceByCompanyName(companyName);
        return new ResponseEntity<Double>(price, HttpStatus.OK);
    }
}
