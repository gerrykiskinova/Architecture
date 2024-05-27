package org.gym;

import org.gym.Training.Decorator.RunningDecorator;
import org.gym.Training.Decorator.GymnasticsDecorator;
import org.gym.Training.Decorator.YogaDecorator;
import org.gym.Training.FitnessCenter;
import org.gym.Training.Programs.BasicProgram;
import org.gym.Training.Programs.CardioProgram;
import org.gym.Training.Programs.StrengthProgram;
import org.gym.Training.Programs.TrainingProgram;
import org.gym.Training.Trainee;

public class Main {
    public static void main(String[] args) {
        FitnessCenter fitnessCenter = FitnessCenter.getInstance();

        TrainingProgram basicProgram = new BasicProgram();

        Trainee trainee1 = new Trainee("Petar");
        TrainingProgram personalizedProgram = new YogaDecorator(basicProgram);
        fitnessCenter.attach(trainee1, personalizedProgram);

        TrainingProgram strengthProgram = new StrengthProgram();
        Trainee trainee2 = new Trainee("Ivayla");
        TrainingProgram personalizedProgram2 = new GymnasticsDecorator(strengthProgram);
        fitnessCenter.attach(trainee2, personalizedProgram2);


        TrainingProgram cardioProgram = new CardioProgram();
        Trainee trainee3 = new Trainee("Stoyan");
        TrainingProgram personalizedProgram3 = new RunningDecorator(cardioProgram);
        fitnessCenter.attach(trainee3, personalizedProgram3);

        fitnessCenter.notifyObservers();

        fitnessCenter.setTrainingProgram(trainee1,personalizedProgram3);
    }
}