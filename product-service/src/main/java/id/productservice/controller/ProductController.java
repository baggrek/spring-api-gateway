package id.productservice.controller;

import id.productservice.domain.dto.ProductDto;
import id.productservice.domain.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/product")
public class ProductController {

    public ProductController() {
        initData();
    }

    List<ProductDto> productList = new ArrayList<>();

    private void initData() {
        productList.add(ProductDto.builder()
                .id(1L)
                .name("Macbook Air M1")
                .price(new BigDecimal(18000000))
                .build());

        productList.add(ProductDto.builder()
                .id(2L)
                .name("iPhone 14 pro max")
                .price(new BigDecimal(20000000))
                .build());

        productList.add(ProductDto.builder()
                .id(3L)
                .name("iPad pro 2021")
                .price(new BigDecimal(10000000))
                .build());
    }

    @GetMapping(value = "")
    public ResponseEntity<Object> getProducts() {
        ResponseDto response = new ResponseDto("SUCCESS", productList);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
