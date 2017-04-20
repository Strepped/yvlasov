package ru.job4j.oop;

/**
 * Created by Strepped on 19.04.2017.
 */
public class Tracking {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Иван", "лечить", true);
        Patient patient = new Patient("Коля");
        Engineer engineer = new Engineer("Гик", "проектировать", true);
        Project project = new Project("Окна");
        Teacher teacher = new Teacher("Матвей", "учить", true);
        Children children= new Children("Александра");
        doctor.heals(patient); // тестировал разные варианты.
        System.out.println("Доктор " + doctor.name + " лечит пациента " + patient.name + " //тест варианта"); // тестировал разные варианты.
        System.out.println(doctor.heals(patient));
        System.out.println(engineer.create(project));
        System.out.println(teacher.teach(children));
    }
}