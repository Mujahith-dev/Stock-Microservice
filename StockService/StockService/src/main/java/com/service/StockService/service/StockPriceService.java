package com.service.StockService.service;

import com.service.StockService.entiry.StockPrice;
import org.springframework.stereotype.Service;

@Service
public interface StockPriceService {

    public Double fetchPriceByCompanyName(String companyName);
}
