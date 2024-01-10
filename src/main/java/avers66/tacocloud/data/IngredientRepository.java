package avers66.tacocloud.data;

import avers66.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

/**
 * IngredientRepository
 *
 * @Author Tretyakov Alexandr
 */


public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
