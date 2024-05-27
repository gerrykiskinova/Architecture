package org.gym.Training.Decorator;

import org.gym.Training.Programs.TrainingProgram;

public abstract class TrainingProgramDecorator implements TrainingProgram {
    protected TrainingProgram trainingProgram;

    public TrainingProgramDecorator(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
    }

    @Override
    public String execute() {
        return trainingProgram.execute();
    }
}
