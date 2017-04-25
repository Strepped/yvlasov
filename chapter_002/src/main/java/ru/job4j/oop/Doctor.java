package ru.job4j.oop;

/**
 * Class ConsoleInput.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public class Doctor extends Profession {

    /**
     * Метод производит сложение.
     * @param name - первая переменная.
     * @param skill - первая переменная.
     * @param license - первая переменная.
     */
    public Doctor(String name, String skill, boolean license) {
        super(name, skill, license);
    }

    /**
     * Метод производит сложение.
     * @param patient - первая переменная.
     * @return Возвращает параметр.
     */
     public String heals(Patient patient) {
         return "Доктор " + getName() + " лечит пациента " + patient.getName();
    }
}