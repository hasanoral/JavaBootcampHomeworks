package com.kodluyoruz.week4homework.model.mapper;

import com.kodluyoruz.week4homework.model.dto.ProductDto;
import com.kodluyoruz.week4homework.model.entity.Product;
import com.kodluyoruz.week4homework.model.request.ProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper PRODUCT_MAPPER = Mappers.getMapper(ProductMapper.class);

    ProductDto toProductDto(Product product);

    List<ProductDto> toProductDtoList(List<Product> products);

    Product createProduct(ProductRequest request);

    void updateProduct(@MappingTarget Product product, ProductRequest request);
}
