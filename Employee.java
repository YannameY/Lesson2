package Lesson2;

public class Employee { // Класс сотрудников

    public static void main(String[] args) {
        Employee employee = new Employee("Иванов", "Иван", "Иванович", "Инженер", "ivan@.ru", "88009006072", 100000, 25); // Создаем объект сотрудника
        employee.info(); // Вызываем метод, чтобы показать информацию о сотруднике
    }

    // Объявление переменных для хранения информации о сотруднике
    private String surname;
    private String name;
    private String otchestvo;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    // Конструктор для создания объектов класса Employee
    public Employee(String surname, String name, String otchestvo, String jobTitle, String email, String phoneNumber, double salary, int age) {
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации о сотруднике
    public void info() {
        System.out.println("Фамилия: " + surname); // Печатаем фамилию
        System.out.println("Имя: " + name); // Печатаем имя
        System.out.println("Отчество: " + otchestvo); // Печатаем отчество
        System.out.println("Должность: " + jobTitle); // Печатаем должность
        System.out.println("Email: " + email); // Печатаем email
        System.out.println("Телефон: " + phoneNumber); // Печатаем телефон
        System.out.println("Зарплата: " + salary); // Печатаем зарплату
        System.out.println("Возраст: " + age); // Печатаем возраст
    }
}