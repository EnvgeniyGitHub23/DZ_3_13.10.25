public class Cat extends Animal {

    private static final int MAX_RUN = 200;

    private static int countOfCats;

    // Конструктор
    public Cat(String name) {
        super(name);
        countOfCats++;
    }

    // Возврщаем количество созданных котов
    public static int getCountOfAnimals() {
        return countOfCats;
    }

    public void run(int distance) {
        if (distance < 0) {
            System.out.println(distance + " -> Некорректная команда, кот остался на месте.");
        } else if (distance == 0) {
            System.out.println(distance + " -> Кот остался на месте.");
        } else if (distance > MAX_RUN) {
            System.out.println(distance + " -> Кот пробежал только " + MAX_RUN + " метров и устал.");
        } else {
            System.out.println(distance + " -> Кот пробежал " + distance + " метров.");
        }
    }
}
