package com.service.StockCalculationService.clientController;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "StockService")    //name of the another microservice that we need access to
public interface StockClient {

    @GetMapping("stock/getPrice/{companyName}")
    public ResponseEntity<Double> fetchPriceByCompanyName(@PathVariable String companyName);
}
