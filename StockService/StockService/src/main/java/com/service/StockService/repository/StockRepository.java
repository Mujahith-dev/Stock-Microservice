package com.service.StockService.repository;

import com.service.StockService.entiry.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<StockPrice, Integer> {
    public StockPrice findStockPriceByCompanyName (String companyName);
}
