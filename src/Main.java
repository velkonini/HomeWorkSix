import animals.Animal;
import animals.Cat;
import animals.Dog;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


    	Animal[] animals = new Animal[4];
		animals[0] = new Cat("Bonya","grey", 1);
		animals[1] = new Dog("Marvin", "yellow", 1, 300);
		animals[2] = new Dog("Rex", "black", 10, 150);
		animals[3] = new Cat("Felix","black, white", 3);

		//попробовал сделать 4 задание через массив
		for (int i = 0; i < animals.length; i++){
			System.out.println("we created " + i + " animals");
		}

		animals[1].swim();
		animals[2].run(); //задание 5
		animals[0].run();
		animals[3].swim();
    }


}
