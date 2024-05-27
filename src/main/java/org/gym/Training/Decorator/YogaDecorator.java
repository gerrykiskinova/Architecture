package org.gym.Training.Decorator;

import org.gym.Training.Programs.TrainingProgram;

public class YogaDecorator extends TrainingProgramDecorator {
    public YogaDecorator(TrainingProgram trainingProgram) {
        super(trainingProgram);
    }

    @Override
    public String execute() {
        return trainingProgram.execute() + " с Йога";
    }
}