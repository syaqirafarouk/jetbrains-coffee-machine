package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        
	// Stage 5
        Scanner scanner = new Scanner(System.in);
        
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money = 550;
        boolean proceed = true;
        
        while (proceed) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String input = scanner.next(); 
        
        switch (input) {
            case "remaining" :
                System.out.println("The coffee machine has:\n" + water + " of water\n" + 
                milk + " of milk\n" + coffee + " of coffee beans\n" + 
                cups + " of disposable cups\n" + money + " of money\n");
                break; 
                
            case "buy" :
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                
                if (scanner.hasNextInt()) {
                int input2 = scanner.nextInt();                    
                
                switch (input2) {
                    case 1 :
                        if ( water >= 250) {
                            if (coffee >= 16) {
                                water = water - 250;
                                coffee = coffee - 16;
                                cups = cups - 1;
                                money = money + 4;
                                
                                System.out.println("I have enough resources, making you a coffee!");
                                
                            } else {
                                System.out.println("Sorry, not enough coffee!");
                            }
                        } else {
                            System.out.println ("Sorry, not enough water!");
                        }
                        break;
                        
                    case 2 :
                        if ( water >= 350) {
                            if (milk >= 75) {
                                if (coffee >= 20){
                                    System.out.println("I have enough resources, making you a coffee!");
                                    water = water - 350;
                                    milk = milk - 75;
                                    coffee = coffee - 20;
                                    cups = cups - 1;
                                    money = money + 7;
                                } else {
                                    System.out.println("Sorry, not enough coffee!");
                                } 
                            } else {
                                System.out.println("Sorry, not enough milk!");
                            }
                        } else {
                            System.out.println ("Sorry, not enough water!");
                        }
                        break;
                        
                    case 3 :
                       if ( water >= 200) {
                            if (milk >= 100) {
                                if (coffee >= 12){
                                    System.out.println("I have enough resources, making you a coffee!");
                                    water = water - 200;
                                    milk = milk - 100;
                                    coffee = coffee - 12;
                                    cups = cups - 1;
                                    money = money + 6;
                                } else {
                                    System.out.println("Sorry, not enough coffee!");
                                } 
                            } else {
                                System.out.println("Sorry, not enough milk!");
                            }
                        } else {
                            System.out.println ("Sorry, not enough water!");
                        }
                        break;    
                        
                    default :
                        System.out.print("");
                        break;
                }
                } else {
                   String input2 = scanner.next();
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
                
                water = water + input3;
                milk = milk + input4;
                coffee = coffee + input5;
                cups = cups + input6;
                
                break;
                
            case "take" :
                System.out.println("\nI gave you" + " $" + money);
                money = 0;
                break;
                           
            default :
                proceed = !proceed;
                break;
            }
        }
    }
}