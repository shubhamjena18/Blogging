package com.shubham.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubham.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
