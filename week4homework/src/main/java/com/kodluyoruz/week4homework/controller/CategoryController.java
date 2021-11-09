package com.kodluyoruz.week4homework.controller;


import com.kodluyoruz.week4homework.model.dto.CategoryDto;
import com.kodluyoruz.week4homework.model.dto.ProductDto;
import com.kodluyoruz.week4homework.model.request.CategoryRequest;
import com.kodluyoruz.week4homework.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService service;

    @PostMapping
    public CategoryDto createCategory(@RequestBody CategoryRequest request){
        return service.createCategory(request);
    }

    @GetMapping
    public List<CategoryDto> getCategories(){
        return service.getCategories();
    }

    @GetMapping("{id}/parent")
    public CategoryDto getParentCategory(@PathVariable int id){
        return service.getParentCategory(id);
    }

    @GetMapping("{id}/sub")
    public List<CategoryDto> getSubCategory(@PathVariable int id){
        return service.getSubCategory(id);
    }

    @GetMapping("{id}/products")
    public List<ProductDto> getCategoryProducts(@PathVariable int id) {
        return service.getCategoryProducts(id);
    }
}
