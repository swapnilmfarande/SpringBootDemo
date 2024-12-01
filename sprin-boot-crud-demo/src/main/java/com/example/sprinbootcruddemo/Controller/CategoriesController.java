package com.example.sprinbootcruddemo.Controller;

import com.example.sprinbootcruddemo.Model.Categories;
import com.example.sprinbootcruddemo.Service.CategoriesSrrvice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/categories")
public class CategoriesController {
    CategoriesSrrvice categoriesSrrvice;

    @PostMapping
    public void addCategory(@RequestBody Categories categories){
        categoriesSrrvice.addCategory(categories);
    }

    @GetMapping
    public List<Categories> getAllCategories(){
        return categoriesSrrvice.getAllCategories();
    }

    @PutMapping
    public void updateCategory(@RequestBody Categories categories){
        categoriesSrrvice.updateCategory(categories);
    }

    @GetMapping("/{id}")
    public Categories getCategoryById(@PathVariable("id") int categoryId){
        return categoriesSrrvice.getCategoryById(categoryId);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoryById(@PathVariable("id") int categoryid){
        categoriesSrrvice.deleteCategoryById(categoryid);
    }
}
