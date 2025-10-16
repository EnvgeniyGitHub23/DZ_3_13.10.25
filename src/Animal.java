public abstract class Animal {

    private String name;
    abstract void run(int distance);

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
