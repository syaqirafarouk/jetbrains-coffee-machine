package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        
	// Stage 4
        Scanner scanner = new Scanner(System.in);
              
        System.out.println("The coffee machine has:\n400 of water\n540 of milk\n120 of coffee beans\n9 of disposable cups\n550 of money\n");
        System.out.println("Write action (buy, fill, take):");
        String input = scanner.next(); 
        
        switch (input) {
            case "buy" :
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int input2 = scanner.nextInt();
                
                switch (input2) {
                    case 1 :
                        System.out.println("\nThe coffee machine has:\n150 of water\n540 of milk\n104 of coffee beans\n8 of disposable cups\n554 of money");
                        break;
                        
                    case 2 :
                        System.out.println("\nThe coffee machine has:\n50 of water\n465 of milk\n100 of coffee beans\n8 of disposable cups\n557 of money");
                        break;
                        
                    case 3 :
                        System.out.println("\nThe coffee machine has:\n200 of water\n440 of milk\n108 of coffee beans\n8 of disposable cups\n556 of money");
                        break;
                        
                    default :
                        System.out.print("");
                        break;
                }
                break;
                
            case "fill" :
                System.out.println("Write how many ml of water do you want to add:");
                int input3 = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int input4 = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int input5 = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int input6 = scanner.nextInt();
                System.out.println("\nThe coffee machine has:\n" + (400 + input3) + " of water\n" + 
                (540 + input4) + " of milk\n" + (120 + input5) + " of coffee beans\n" + 
                (9 + input6) + " of disposable cups\n550 of money");
                break;
                
            case "take" :
                System.out.println("I gave you $550");
                System.out.println("\nThe coffee machine has:\n400 of water\n540 of milk\n120 of coffee beans\n9 of disposable cups\n0 of money\n");
                break;
                
            default :
                System.out.println("");
                break;
        }
    }
}