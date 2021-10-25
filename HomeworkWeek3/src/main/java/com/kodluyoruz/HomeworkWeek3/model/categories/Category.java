package com.kodluyoruz.HomeworkWeek3.model.categories;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class Category {
    private List<MainCategory> listOfMainCat = new ArrayList<>();

    public void addMainCategory(MainCategory mc){

        listOfMainCat.add(mc);

    }
}
