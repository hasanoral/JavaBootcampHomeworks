package com.kodluyoruz.week4homework.model.mapper;

import com.kodluyoruz.week4homework.model.dto.CategoryDto;
import com.kodluyoruz.week4homework.model.entity.Category;
import com.kodluyoruz.week4homework.model.request.CategoryRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper CATEGORY_MAPPER = Mappers.getMapper(CategoryMapper.class);

    CategoryDto toCategoryDto(Category category);

    List<CategoryDto> toCategoryDtoList(List<Category> category);

    Category createCategory(CategoryRequest request);
}
