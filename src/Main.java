package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	    Create a Rock-Paper-Scissors game that allows 2 people to play against each other.
	    Requirements:
	    - use Scanner to get user input
	    - use control-flow statements to determine the winner and print it out
	    - allow user to repeatedly play games
	    - must create at least one class
	    - Make your own Git Repo and paste the link in the excel sheet.
	    - have the computer randomly pick a an option ("rock", "paper", or "scissors")
	    - Use this link https://www.codegrepper.com/code-examples/java/how+to+select+a+random+element+from+an+array+in+java for assistance with picking a random element from an array
	    Stretch Goals:
	    - allow players to enter their name for a more personalized experience
	    - keep track of score
	    - Extend your game to be tic-tac-toe instead of Rock-Paper-Scissors
	 */


        Scanner input = new Scanner(System.in);
        // get player names
        System.out.print("Hello player1, please enter your name: ");
        String name1 = input.nextLine();
        System.out.print("Hello player2, please enter your name: ");
        String name2 = input.nextLine();
        System.out.println("Hello " + name1 + " and " + name2 + "!");

        while (true) {
            System.out.println("Let's play rock, paper, scissors!" + "\n" + "Please make your selection " + "\n" + "please be sure to type your choice in all lower case");



            String move1 = input.nextLine();
            String move2 = input.nextLine();


            switch (move1) {
                case "rock":
                    System.out.println(name1 + " chose rock");
                    break;
                case "paper":
                    System.out.println(name1 + " chose paper");
                    break;
                case "scissors":
                    System.out.println(name1 + " chose scissors");
                    break;
                default:
                    System.out.println(name1 + " please make proper selection");
                    break;

            }

            switch (move2) {
                case "rock":
                    System.out.println(name2 + " chose rock");
                    break;
                case "paper":
                    System.out.println(name2 + " chose paper");
                    break;
                case "scissors":
                    System.out.println(name2 + " chose scissors");
                    break;
                default:
                    System.out.println(name2 + " please make proper selection");
                    break;

            }




            if (move1.equals("scissors") && move2.equals("paper")){

                System.out.println(name1 + " win!");
            }
            else if(move1.equals("rock") && move2.equals("paper")){

                System.out.println(name2 + " wins!");
            }
            else if(move1.equals("paper") && move2.equals("scissors")){

                System.out.println(name2 + " win!");
            }
            else if(move1.equals("scissors") && move2.equals("rock")){

                System.out.println(name2 + " win!");
            }
            else if(move1.equals("rock") && move2.equals("scissors")){

                System.out.println(name1 + " win!");
            }
            else if(move1.equals("paper") && move2.equals("rock")){

                System.out.println(name1 + " win!");
            }
            else{
                System.out.println("no one wins!");
            }

        }
    }
}

