package com.nrapendra.stock;

import org.springframework.boot.SpringApplication;
import pl.piomin.stock.StockApp;

public class StockAppTest {

    public static void main(String[] args) {
        SpringApplication.from(StockApp::main)
                .with(KafkaContainerDevMode.class)
                .run(args);
    }

}
