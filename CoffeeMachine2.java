package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
	
	// Stage 2
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        String message1 = "Write how many cups of coffee you will need:";
        String message2 = "For " + input + " cups of coffee you will need:\n" +
                input * 200 + " ml of water\n" + input * 50 + " ml of milk\n" + input * 15 + " g of coffee beans";

        System.out.println(message1);
        System.out.println(input);
        System.out.print(message2);
      }
}