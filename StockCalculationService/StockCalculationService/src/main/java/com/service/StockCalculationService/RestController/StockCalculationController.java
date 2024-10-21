package com.service.StockCalculationService.RestController;

import com.service.StockCalculationService.clientController.StockClient;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class StockCalculationController {

    @Autowired
    private StockClient service;

    @GetMapping("/getPrice/{companyName}/{quantity}")
    public ResponseEntity<?> calculatePrice(@PathVariable String companyName, @PathVariable Integer quantity){
        ResponseEntity<?> responseEntity = null;
        Double price=null;
        Double totalPrice=null;

        try{
            responseEntity = service.fetchPriceByCompanyName(companyName);
            int status = responseEntity.getStatusCode().value();
            if(status==200){
                price = (Double) responseEntity.getBody();
                totalPrice = price * quantity;
                String response = "The total price is "+totalPrice;
                responseEntity = new ResponseEntity<String>(response, HttpStatus.OK);
            }

        }
        catch (Exception e){
            responseEntity = new ResponseEntity<String>("Company not found", HttpStatus.OK);
        }
        return responseEntity;
    }

}
