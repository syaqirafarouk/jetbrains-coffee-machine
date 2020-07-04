package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) { 

        // Stage3
	Scanner scanner = new Scanner(System.in);

        int inputWater = scanner.nextInt();
        int inputMilk = scanner.nextInt();
        int inputCoffee = scanner.nextInt();
        int inputCup = scanner.nextInt();

        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.println(inputWater);
        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.println(inputMilk);
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.println(inputCoffee);
        System.out.println("Write how many cups of coffee you will need:");
        System.out.println(inputCup);

        if (200 * inputCup <= inputWater) {
            if (50 * inputCup <= inputMilk) {
                if (15 * inputCup <= inputCoffee) {
                    if ((inputWater/200 <= inputCoffee/15) && (inputWater/200 >= inputMilk/50)) {
                        System.out.print("Yes, I can make that amount of coffee (and even " + (inputMilk/50 - inputCup) + " more than that");
                    } else if ((inputWater/200 >= inputCoffee/15) && (inputWater/200 <= inputMilk/50)) {
                        System.out.print("Yes, I can make that amount of coffee (and even " + (inputCoffee/15 - inputCup) + " more than that");
                    } else if ((inputCoffee/15 <= inputWater/200) && (inputCoffee/15 >= inputMilk/50)) {
                        System.out.print("Yes, I can make that amount of coffee (and even " + (inputMilk/50 - inputCup) + " more than that");
                    } else if ((inputCoffee/15 >= inputWater/200) && (inputCoffee/15 <= inputMilk/50)) {
                        System.out.print("Yes, I can make that amount of coffee (and even " + (inputWater/200 - inputCup) + " more than that");
                    } else if ((inputMilk/50 >= inputWater/200) && (inputMilk/50 <= inputCoffee/15)) {
                        System.out.print("Yes, I can make that amount of coffee (and even " + (inputWater/200 - inputCup) + " more than that");
                    } else if ((inputMilk/50 <= inputWater/200) && (inputMilk/50 >= inputCoffee/15)){
                        System.out.print("Yes, I can make that amount of coffee (and even " + (inputCoffee/15 - inputCup) + " more than that");
                    }  else {
                        System.out.print("Yes, I can make that amount of coffee");
                    }
                } else {
                    System.out.print("No, I can make only " + (inputCoffee / 15) + " cup(s) of coffee");
                }
            } else if (inputCoffee / 15 <= inputMilk / 50) {
                System.out.print("No, I can make only " + (inputCoffee / 15) + " cup(s) of coffee");
            } else {
                System.out.print("No, I can make only " + (inputMilk / 50) + " cup(s) of coffee");
            }
        } else if ((inputWater / 200 <= inputCoffee / 15) && (inputWater / 200 >= inputMilk / 50)) {
            System.out.print("No, I can make only " + (inputMilk / 50) + " cup(s) of coffee");
        } else if ((inputWater / 200 >= inputCoffee / 15) && (inputWater / 200 <= inputMilk / 50)) {
            System.out.print("No, I can make only " + (inputCoffee / 15) + " cup(s) of coffee");
        } else if ((inputCoffee / 15 <= inputWater / 200) && (inputCoffee / 15 >= inputMilk / 50)) {
            System.out.print("No, I can make only " + (inputMilk / 50) + " cup(s) of coffee");
        } else if ((inputCoffee / 15 >= inputWater / 200) && (inputCoffee / 15 <= inputMilk / 50)) {
            System.out.print("No, I can make only " + (inputWater / 200) + " cup(s) of coffee");
        } else if ((inputMilk / 50 >= inputWater / 200) && (inputMilk / 50 <= inputCoffee / 15)) {
            System.out.print("No, I can make only " + (inputWater / 200) + " cup(s) of coffee");
        } else if ((inputMilk / 50 <= inputWater / 200) && (inputMilk / 50 >= inputCoffee / 15)) {
            System.out.print("No, I can make only " + (inputCoffee / 15) + " cup(s) of coffee");
        }
    }
}