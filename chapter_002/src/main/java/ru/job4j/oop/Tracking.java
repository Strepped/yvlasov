package ru.job4j.oop;

/**
 * Class ConsoleInput.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public class Tracking {

    /**
     * Метод производит сложение.
     * @param args - первая переменная.
     */
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Иван", "лечить", true);
        Patient patient = new Patient("Коля");
        Engineer engineer = new Engineer("Гик", "проектировать", true);
        Project project = new Project("Окна");
        Teacher teacher = new Teacher("Матвей", "учить", true);
        Children children = new Children("Александра");
        doctor.heals(patient); // тестировал разные варианты.
        System.out.println("Доктор " + doctor.getName() + " лечит пациента " + patient.getName() + " //тест варианта"); // тестировал разные варианты.
        System.out.println(doctor.heals(patient));
        System.out.println(engineer.create(project));
        System.out.println(teacher.teach(children));
    }
}