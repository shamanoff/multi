package com.multirowform;

import com.multirowform.model.ExerciseCondition;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Conditions {

    private List<ExerciseCondition> exerciseConditions;

    public Conditions() {
        this.exerciseConditions = new ArrayList<>(4);
    /*    this.exerciseConditions.add(new ExerciseCondition());
        this.exerciseConditions.add(new ExerciseCondition());
        this.exerciseConditions.add(new ExerciseCondition());
        this.exerciseConditions.add(new ExerciseCondition());*/
    }
}
