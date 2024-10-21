package com.service.StockService.service;

import com.service.StockService.entiry.StockPrice;
import com.service.StockService.exception.StockNotFoundException;
import com.service.StockService.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockPriceServiceImpl implements StockPriceService{

    @Autowired
    private StockRepository stockRepository;

    @Override
    public Double fetchPriceByCompanyName(String companyName) {
        StockPrice price = stockRepository.findStockPriceByCompanyName(companyName);
        if(price==null){
            throw new StockNotFoundException("Stock price not available for given company");
        }
        return price.getStockPrice();
    }
}
