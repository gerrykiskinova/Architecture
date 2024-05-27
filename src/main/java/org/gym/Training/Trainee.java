package org.gym.Training;

import org.gym.Training.Programs.TrainingProgram;

public class Trainee implements Observer {
    private String name;

    public Trainee(String name) {
        this.name = name;
    }

    public void update(TrainingProgram trainingProgram) {
        System.out.println(name + " е уведомен за новата програма за тренировка:" + trainingProgram.execute());
    }
}
