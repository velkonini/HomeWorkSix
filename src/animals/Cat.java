package animals;

import java.util.Scanner;

public class Cat extends Animal {
    Scanner sc = new Scanner(System.in);

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run() {
        System.out.println("How far " + name + " must run?");
        int x = sc.nextInt();
        if (x <= 200) {
            System.out.println(name + " " + " run " + x + " meters");
        } else {
            System.out.println(name + " can't run more then 200 meters");
        }
    }
    @Override
    public void swim(){
        System.out.println(name + " can't swim");
    }


}
