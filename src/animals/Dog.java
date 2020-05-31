package animals;

import java.util.Scanner;

public class Dog extends Animal {
    Scanner sc = new Scanner(System.in);
    int runDog;
    int j;
    public Dog(String name, String color, int age, int runDog) {
        super(name, color, age);
        this.runDog = runDog;
    }

    @Override
    public void run() {
        System.out.println("How far " + name + " must run?");
        int x = sc.nextInt();
        if (x <= runDog) {
            System.out.println(name + " " + " run " + x + " meters");
        } else {
            System.out.println(name + " can't run more then " + runDog + " meters");
        }
    }

    @Override
    public void swim(){
        System.out.println("How far " + name + " must swim?");
        int x = sc.nextInt();
        if (x <= 10) {
            System.out.println(name + " " + " swim " + x + " meters");
        } else {
            System.out.println(name + " can't swim more then 10 meters");
        }
    }
}
