package com.example.bootcamp.bootcamp.mapper;

import com.example.bootcamp.bootcamp.model.Stock;
import com.example.bootcamp.bootcamp.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {
    public Stock ToEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setDate(dto.getDate());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        return stock;
    }

    public StockDTO toDto(Stock stock) {
        StockDTO stockDTO = new StockDTO();
        stockDTO.setId(stock.getId());
        stockDTO.setName(stock.getName());
        stockDTO.setDate(stock.getDate());
        stockDTO.setPrice(stock.getPrice());
        stockDTO.setVariation(stock.getVariation());
        return stockDTO;
    }
    public List<StockDTO> toDto(List<Stock> list) {
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }
}
