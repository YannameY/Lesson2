package Lesson2;

public class Park { // объявление класса Park

    public static void main(String[] args) {
        Park park = new Park(); // Создаем новый объект парка
        Attraction[] attractions = new Attraction[3]; // Создаем массив для хранения аттракционов

        // Заполняем массив аттракционами
        attractions[0] = park.new Attraction("Американские горки", "09:00 - 21:00", 650);
        attractions[1] = park.new Attraction("Колеса обозрение", "09:00 - 22:30", 400);
        attractions[2] = park.new Attraction("Катапульта", "10:00 - 20:00", 700);

        // Цикл для вывода информации о каждом аттракционе
        for (int i = 0; i < attractions.length; i++) {
            attractions[i].infoAttaraction();  // Вызываем метод, который печатает информацию об аттракционе
        }
    }

    class Attraction { // Внутренний класс Attraction, описывает аттракционы в парке
        String name;
        String workingHours;
        double ticketPrice;

        // Конструктор для создания объектов класса Attraction
        public Attraction(String name, String workingHours, double ticketPrice) {
            this.name = name;
            this.workingHours = workingHours;
            this.ticketPrice = ticketPrice;
        }

        // Вывода информации об аттракционе
        public void infoAttaraction() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость билета: " + ticketPrice);
        }
    }
}