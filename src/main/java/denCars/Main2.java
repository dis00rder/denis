package denCars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {



        Car ford = new Car(2008, 2002, Color.RED, "Ford");
        Car seat = new Car(2013, 2010, Color.RED, "Seat");


        System.out.println(ford.carColor);
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter new color. Available Colors are: ");
        System.out.println(java.util.Arrays.asList(Color.values()));

        String colorName = scanner.nextLine();  // Read user input

        PaintUtil.paint(ford, Color.valueOf(colorName.toUpperCase()));
        System.out.println("New color is " +ford.carColor);




    }
}
