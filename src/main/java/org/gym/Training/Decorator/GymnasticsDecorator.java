package org.gym.Training.Decorator;

import org.gym.Training.Programs.TrainingProgram;

public class GymnasticsDecorator extends TrainingProgramDecorator {
    public GymnasticsDecorator(TrainingProgram trainingProgram) {
        super(trainingProgram);
    }

    @Override
    public String execute() {
        return trainingProgram.execute() + " с Гимнастика";
    }
}