package Lesson2;

// Это класс Person
public class Person {

    public static void main(String[] args) {

        // Создаём массив, на 5 сотрудников
        Employee[] personArray = new Employee[5];

        // Добавляем сотрудников в массив
        personArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivan@mailbox.ru", "89008006070", 30000, 25);
        personArray[1] = new Employee("Petrov Anton", "Manager", "petrov@mailbox.ru", "89008006071", 35000, 30);
        personArray[2] = new Employee("Popov Andrei", "Developer", "popov@mailbox.ru", "89008006072", 48000, 32);
        personArray[3] = new Employee("Sokolova Angelina", "Analyst", "sokolova@mailbox.ru", "89008006073", 38000, 33);
        personArray[4] = new Employee("Smirnova Anna", "Project Manager", "smirnova@mailbox.ru", "89008006074", 50000, 35);

        for (Employee employee : personArray) {
            employee.info(); // Вызываем метод для вывода информации
        }
    }

    // Это внутренний класс, который называется Employee
    static class Employee {
        // Эти переменные хранят информацию о сотрудниках
        String name;
        String jobTitle;
        String email;
        String phoneNumber;
        double salary;
        int age;

        // Создаем конструктор, новый объект Employee
        public Employee(String name, String jobTitle, String email, String phoneNumber, double salary, int age) {
            this.name = name;
            this.jobTitle = jobTitle;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        // Выводит информации о сотруднике
        public void info() {
            System.out.println("Имя: " + name);
            System.out.println("Должность: " + jobTitle);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + phoneNumber);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст: " + age);
            System.out.println();
        }
    }
}

