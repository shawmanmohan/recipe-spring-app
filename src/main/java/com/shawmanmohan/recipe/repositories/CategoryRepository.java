package com.shawmanmohan.recipe.repositories;

import com.shawmanmohan.recipe.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
