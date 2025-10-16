public class Cat {

    private static final int MAX_RUN = 200;

    private static int countOfCats = 0;

    // Конструктор
    public Cat() {
        countOfCats++;
    }

    // Возврщаем количество созданных котов
    public static int getCountOfAnimals() {
        return countOfCats;
    }

    public void run(int distance) {
        if(distance < 0) {
            System.out.println("Некорректный ввод, кот остался на месте.");
        } else if (distance == 0) {
            System.out.println("Кот остался на месте.");
        } else if (distance > MAX_RUN) {
            System.out.println("Кот пробежал только " + MAX_RUN + " метров и устал.");
        } else {
            System.out.println("Кот пробежал " + distance + " метров.");
        }
    }

    public void swim(int distance) {
        System.out.println("Коты не плавают, просите собаку.");
    }
}
