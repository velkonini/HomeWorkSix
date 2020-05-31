package animals;

public class Animal {
    String name;
    String color;
    int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void run() {
        System.out.println(name + "run");
    }

    public void swim() {
        System.out.println(name + "swim");
    }


}
