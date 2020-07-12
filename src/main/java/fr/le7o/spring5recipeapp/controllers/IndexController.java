package fr.le7o.spring5recipeapp.controllers;

import fr.le7o.spring5recipeapp.domain.Category;
import fr.le7o.spring5recipeapp.domain.UnitOfMeasure;
import fr.le7o.spring5recipeapp.repositories.CategoryRepository;
import fr.le7o.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    //Maj (114)
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println("testeaaze");
        //Maj (114)
        Optional<Category> categoryOptional = categoryRepository.findByDescription("French");
        Optional<UnitOfMeasure> unitOfMeasureOptional =  unitOfMeasureRepository.findByDescription("Pinch");
        System.out.println("Cat Id is " + categoryOptional.get().getId());
        System.out.println("Unit Measure Id is " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
