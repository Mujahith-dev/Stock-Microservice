package com.service.StockService.entiry;

import ch.qos.logback.core.model.INamedModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "STOCK_PRICE")
public class StockPrice {
    @Id
    @Column(name = "STOCK_ID")
    private Integer stockId;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "STOCK_PRICE")
    private Double stockPrice;

}
