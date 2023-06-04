package com.shubham.blog.services;

import java.util.List;


import com.shubham.blog.payloads.CategoryDto;

public interface CategoryService {

	CategoryDto createCategory(CategoryDto categoryDto);
	
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	void deleteCategory(Integer cateogryId);
	
	CategoryDto getCategory(Integer categoryId);
	
	List<CategoryDto> getCategories();
	
}
