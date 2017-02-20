package com.multirowform.model;

import java.util.ArrayList;
import java.util.List;

public class WrapperConditions {

    private List<ExerciseCondition> exerciseConditions;

    public List<ExerciseCondition> getEx() {
        return this.exerciseConditions;
    }



    public WrapperConditions() {
        exerciseConditions = new ArrayList<>();
    }
}
