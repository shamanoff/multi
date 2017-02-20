package com.multirowform.model;

import java.io.Serializable;



public class ExerciseCondition  implements Serializable {



    private static final long serialVersionUID = 1L;

    private  Long id;

    private  Long fromInt;

    private  Long toInt;

    private  MathAction mathCondition;

    private  Long exercisesCount;

    public Long getFromInt() {
        return fromInt;
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ExerciseCondition setFromInt(Long fromInt) {
        this.fromInt = fromInt;
        return this;
    }

    public Long getToInt() {
        return toInt;
    }

    public ExerciseCondition setToInt(Long toInt) {
        this.toInt = toInt;
        return this;
    }

    public MathAction getMathCondition() {
        return mathCondition;
    }

    public ExerciseCondition setMathCondition(MathAction mathCondition) {
        this.mathCondition = mathCondition;
        return this;
    }

    public Long getExercisesCount() {
        return exercisesCount;
    }

    public ExerciseCondition setExercisesCount(Long exercisesCount) {
        this.exercisesCount = exercisesCount;
        return this;
    }

    @Override
    public String toString() {
        return "ExerciseCondition{" +
                "fromInt=" + fromInt +
                ", toInt=" + toInt +
                ", mathCondition=" + mathCondition +
                ", exercisesCount=" + exercisesCount +
                '}';
    }

    public ExerciseCondition() {
    }

    public ExerciseCondition(Long id, Long fromInt, Long toInt, MathAction mathCondition, Long exercisesCount) {
        this.id = id;
        this.fromInt = fromInt;
        this.toInt = toInt;
        this.mathCondition = mathCondition;
        this.exercisesCount = exercisesCount;
    }
}
