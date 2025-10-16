public class Dog {
    private static final int MAX_RUN = 500;
    private static final int MAX_SWIM = 10;

    private static int countOfDogs = 0;

    // Конструктор
    public Dog() {
        countOfDogs++;
    }

    // Возврщаем количество созданных собак
    public static int getCountOfAnimals() {
        return countOfDogs;
    }

    public void run(int distance) {
        if(distance < 0) {
            System.out.println("Некорректный ввод, собака осталась на месте.");
        } else if (distance == 0) {
            System.out.println("Cобака осталась на месте.");
        } else if (distance > MAX_RUN) {
            System.out.println("Cобака пробежала только " + MAX_RUN + " метров и устала.");
        } else {
            System.out.println("Cобака пробежала " + distance + " метров.");
        }
    }

    public void swim(int distance) {
        if(distance < 0) {
            System.out.println("Некорректный ввод, собака осталась на месте.");
        } else if (distance == 0) {
            System.out.println("Cобака не поплыла.");
        } else if (distance > MAX_RUN) {
            System.out.println("Cобака проплыла только " + MAX_SWIM + " метров и устала.");
        } else {
            System.out.println("Cобака проплыла " + distance + " метров.");
        }
    }
}
