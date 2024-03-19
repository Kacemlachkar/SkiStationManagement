package tn.esprit.spring.services;

public interface itestCourse {
    int getLevel();

    tn.esprit.spring.entities.TypeCourse getTypeCourse();

    tn.esprit.spring.entities.Support getSupport();

    Float getPrice();

    int getTimeSlot();
}
