public class Dog {
    private static final int MAX_RUN = 500;
    private static final int MAX_SWIM = 10;

    private static int countOfDogs = 0;

    public String name;

    // Конструктор
    public Dog(String name) {
        countOfDogs++;
        this.name = name;
    }

    // Возврщаем количество созданных собак
    public static int getCountOfAnimals() {
        return countOfDogs;
    }

    public void run(int distance) {
        if(distance < 0) {
            System.out.println("Некорректный ввод, собака " + name + " осталась на месте.");
        } else if (distance == 0) {
            System.out.println("Cобака " + name + " осталась на месте.");
        } else if (distance > MAX_RUN) {
            System.out.println("Cобака " + name + " пробежала только " + MAX_RUN + " метров и устала.");
        } else {
            System.out.println("Cобака " + name + " пробежала " + distance + " метров.");
        }
    }

    public void swim(int distance) {
        if(distance < 0) {
            System.out.println("Некорректный ввод, собака " + name + " осталась на месте.");
        } else if (distance == 0) {
            System.out.println("Cобака " + name + " не поплыла.");
        } else if (distance > MAX_RUN) {
            System.out.println("Cобака " + name + " проплыла только " + MAX_SWIM + " метров и устала.");
        } else {
            System.out.println("Cобака " + name + " проплыла " + distance + " метров.");
        }
    }
}
