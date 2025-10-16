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


        Cat cat1 = new Cat();
        System.out.println("Создано котов: " + Dog.getCountOfAnimals());

        System.out.println("\nДаем коту команды бежать:");
        cat1.run(-1);
        cat1.run(0);
        cat1.run(1000);
        cat1.run(5);

        System.out.println("\nДаем коту команды плыть:");
        cat1.swim(-1);
        cat1.swim(0);
        cat1.swim(1000);
        cat1.swim(5);
    }
}