public class Dog extends Animal implements Swimable{
    private static final int MAX_RUN = 500;
    private static final int MAX_SWIM = 10;

    private static int countOfDogs;


    // Конструктор
    public Dog(String name) {
        super(name);
        countOfDogs++;
    }

    // Возврщаем количество созданных собак
    public static int getCountOfAnimals() {
        return countOfDogs;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println(distance + " -> Некорректная команда, собака " + getName() + " осталась на месте.");
        } else if (distance == 0) {
            System.out.println(distance + " -> Cобака " + getName() + " осталась на месте.");
        } else if (distance > MAX_RUN) {
            System.out.println(distance + " -> Cобака " + getName() + " пробежала только " + MAX_RUN + " метров и устала.");
        } else {
            System.out.println(distance + " -> Cобака " + getName() + " пробежала " + distance + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 0) {
            System.out.println(distance + " -> Некорректная команда, собака " + getName() + " осталась на месте.");
        } else if (distance == 0) {
            System.out.println(distance + " -> Cобака " + getName() + " не поплыла.");
        } else if (distance > MAX_RUN) {
            System.out.println(distance + " -> Cобака " + getName() + " проплыла только " + MAX_SWIM + " метров и устала.");
        } else {
            System.out.println(distance + " -> Cобака " + getName() + " проплыла " + distance + " метров.");
        }
    }
}
