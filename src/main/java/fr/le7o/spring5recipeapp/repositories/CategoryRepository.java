package fr.le7o.spring5recipeapp.repositories;

import fr.le7o.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
