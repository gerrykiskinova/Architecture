package org.gym.Training.Decorator;

import org.gym.Training.Programs.TrainingProgram;

public class RunningDecorator extends TrainingProgramDecorator {
    public RunningDecorator(TrainingProgram trainingProgram) {
        super(trainingProgram);
    }

    @Override
    public String execute() {
        return trainingProgram.execute() + " с Бягане";
    }
}