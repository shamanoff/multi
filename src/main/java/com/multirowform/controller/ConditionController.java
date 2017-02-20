package com.multirowform.controller;

import com.multirowform.model.WrapperConditions;
import com.multirowform.model.ExerciseCondition;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kudelin on 2/20/17.
 */

@Controller
public class ConditionController {

    private List<ExerciseCondition> myList = new ArrayList<>();

    @RequestMapping(value = "/conditionsInput", method = RequestMethod.POST)
    public String conditionsInput(@ModelAttribute WrapperConditions conditions) {
//        System.out.println("customers " + customers.getCustomers() + " " + customers);
//        System.out.println(conditions.getExerciseConditions());
        myList = conditions.getEx();

        myList.stream()
                .forEach(System.out::println);


        return "/index";
    }
}
