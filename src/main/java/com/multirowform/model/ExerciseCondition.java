package com.multirowform.model;

import lombok.Data;


@Data
public class ExerciseCondition {

    private  Long id;

    private  Long fromInt;

    private  Long toInt;

    private  MathAction mathCondition;

    private  Byte exercisesCount;

}
