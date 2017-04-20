package ru.job4j.oop;

public class Doctor extends Profession{

    public Doctor(String name, String skill, boolean license) {
        super(name, skill, license);
    }

     public String heals (Patient patient) {
         return "Доктор " + getName() + " лечит пациента " + patient.getName();
    }
}