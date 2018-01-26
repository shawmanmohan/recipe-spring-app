package com.shawmanmohan.recipe.repositories;

import com.shawmanmohan.recipe.models.UnitofMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitofMeasureRepository extends CrudRepository<UnitofMeasure, Long>{
}
