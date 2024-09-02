package com.example.mscatalogo.services;

import com.example.mscatalogo.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<Category> list();
    public Category save(Category category);
    public Category update(Category category);
    public Optional<Category> findById(Integer id);
    public void deleteById(Integer id);
}
