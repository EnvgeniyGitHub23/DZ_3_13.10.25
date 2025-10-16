/*
1 Создать классы Кот и Собака. Все животные могут бежать и плыть.
 В качестве параметра каждому методы передается длина препятствия.
 Результатом выполнения действия будет вывод в консоль(Например, dogBobik.run(150); -> “Бобик пробежал 150 м.”.
 Учесть, что у каждого животного есть ограничения на действие( бег: кот 200 м, собака 500 м;
 плавание: кот не умеет плавать, собака 10 м). Добавить подсчет созданных котов, собак и животных


2 Создать класс Сотрудник с полями: ФИО, должность, email, телефон, зарплата и возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Написать метод в этом классе, который выводит информацию об объекте в консоль в виде красиво оформленной строки.
Создать массив из 5 сотрудников и с помощью цикла foreach вывести информацию только о сотрудниках старше 40 лет
 */


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // 1-------------------------------------------------------------
        Dog dogBobik = new Dog("Бобик");
        System.out.println("Создано собак: " + Dog.getCountOfAnimals());

        Dog dogSharik = new Dog("Шарик");
        System.out.println("Создано собак: " + Dog.getCountOfAnimals());

        System.out.println("\nДаем собаке команды бежать:");
        dogBobik.run(-1);
        dogBobik.run(0);
        dogBobik.run(1000);
        dogBobik.run(5);

        System.out.println("\nДаем собаке команды плыть:");
        dogBobik.swim(-1);
        dogBobik.swim(0);
        dogBobik.swim(1000);
        dogBobik.swim(5);


        Cat catMurzik = new Cat("Мурзик");
        System.out.println("Создано котов: " + Dog.getCountOfAnimals());

        System.out.println("\nДаем коту команды бежать:");
        catMurzik.run(-1);
        catMurzik.run(0);
        catMurzik.run(1000);
        catMurzik.run(5);

        // У Cat нет метода swim
//        System.out.println("\nДаем коту команды плыть:");
//        cat1.swim(-1);
//        cat1.swim(0);
//        cat1.swim(1000);
//        cat1.swim(5);


        // 2 ---------------------------------------------------------------
        System.out.println("\n----------------------\n");
        System.out.println("Создаем сотрудников:");
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов И.И.", "программист", "ivanov@mail.ru", "812123456", 100000.0f, 18);
        employees[1] = new Employee("петров П.П.", "дизайнер", "petrov@mail.ru", "812987654", 150000.0f, 35);
        employees[2] = new Employee("Сидоров С.С.", "программист", "sidorov@mail.ru", "81255555", 200000.0f, 45);
        employees[3] = new Employee("Держиморда Д.Д.", "охранник", "security@mail.ru", "812123789", 90000.0f, 50);
        employees[4] = new Employee("Иванова П.С.", "бухгалтер", "buh@mail.ru", "81212789123", 250000, 55);

        System.out.println("\nВыводим информацию о сотрудниках старше 40 лет:");
        for (Employee emp : employees) {
            if(emp.getAge() > 40){
                System.out.print("- ");
                emp.printInfo();
            }
        }
    }
}