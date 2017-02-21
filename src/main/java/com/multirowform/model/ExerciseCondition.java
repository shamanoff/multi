package com.multirowform.model;

import lombok.Data;

import java.io.Serializable;


@Data
public class ExerciseCondition  implements Serializable {

    private static final long serialVersionUID = 1L;

    private  Long id;

    private  Long fromInt;

    private  Long toInt;

    private  MathAction mathCondition;

    private  Long exercisesCount;


}
