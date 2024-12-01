package com.example.sprinbootcruddemo.Service;

import com.example.sprinbootcruddemo.Model.Categories;
import com.example.sprinbootcruddemo.Repository.CategoriesRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriesSrrvice {
    CategoriesRepo categoriesRepo;

    public void addCategory(Categories categories){
        categoriesRepo.save(categories);
    }

    public List<Categories> getAllCategories(){
        return categoriesRepo.findAll();
    }

    public void updateCategory(Categories categories){
        categoriesRepo.save(categories);
    }

    public Categories getCategoryById(int categoryId){
        return categoriesRepo.findById(categoryId).get();
    }

    public void deleteCategoryById(int categoryid){
        categoriesRepo.deleteById(categoryid);

    }

}
