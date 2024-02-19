package lesson15;

public class Cat {
    String name;
    String color;
    int age;
    int volume;
    int food;
    int hungry;
    int walk;
    int run;

    public Cat(String name, String color, int age, int volume, int hungry) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.volume = volume;
        this.walk = walk;
        this.run = run;
    }
    public Cat() {
    }
    public void hungry(int walk) {
        this.walk = walk;
    }
    public void not(int run) {
        this.run = run;
    }

    public void eat(int food) {
        this.food = food;
    }

    public double satiated() {
        return (double) food / volume * 100;
    }
    public double not () {
        return (double) run / volume * 100;
    }
    public double hungry () {
        return (double) walk / volume * 100;
    }


    public void voice() {
        System.out.println("Meow!");
    }
}
