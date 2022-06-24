package com.example.myapp.controller

import com.example.myapp.domain.Stock
import com.example.myapp.repository.StockRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StockController(
    private val stockRepository: StockRepository
) {

    @GetMapping("/stocks")
    fun listStocks(): List<Stock> {
        return stockRepository.findAll()
    }
}