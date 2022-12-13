package scorekeeper;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreKeeper {
     
    public static void main(String[] args){
        // Create ArrayList for holding the players and one to hold their points
        ArrayList<String> players = new ArrayList<String>();
        ArrayList<Integer> points = new ArrayList<Integer>();
        //Get the desired menu choice from the user
        Scanner input = new Scanner(System.in);
        
        //Intialize the choice and winningScore variables 
        int choice;
        int winningScore = 0;
        
        // Continue showing options to user unless they quit the program
        do{
            choice = getMenuChoice(input);
           
            if (choice == 1){
                // Number user is playing to in their game
                winningScore = playingTo(input);
            }
            else if (choice == 2){
                // Add a new player
                newPlayer(input, players, points);
            }
            else if (choice == 3){
                // Add a point
                addPoint(input, points, players, winningScore);
            }
            else if (choice == 4){
                // Subtract a point
                subtractPoint(input, points, players, winningScore);
            }
            else if (choice == 5){
                // Display current points for all players
                displayPoints(input, points, players);
            }
        } while (choice != 6); //Quit the program
       
        // User has quit the program
        System.out.println("You have exited the Score Keeper Program.");
    }
    
    
    //Choice #1-Method for entering the number that the user is playing to in their chosen game
        public static int playingTo(Scanner input){
          System.out.println("Please enter the number you are playing to: ");
          
          int winningScore = input.nextInt();
          
            return winningScore;
        }
    
    //Choice #2-Method for adding a new player
        public static void newPlayer(Scanner input, ArrayList<String> players, ArrayList<Integer> points){
          System.out.println("Please enter the first name of the new player: ");
            String index = input.next();
            players.add(index);
            points.add(0);
            System.out.println("Your player index is: " + players.size());
            System.out.println();
        }
    
    //Choice #3-Method for adding a point to a specified player
        public static void addPoint(Scanner input, ArrayList<Integer> points, ArrayList<String> players, int winningScore){
            System.out.print("Please enter the index of the player whose score you would like to add a point to:");
            System.out.println();
            int index = input.nextInt();
            int score = points.get(index - 1);
            if(score != winningScore){
                points.set(index - 1, points.get(index - 1) + number(input)); 
            }    
            if(points.get(index - 1) == winningScore){
                    System.out.println("Congrats, " + players.get(index - 1) + " you have won the game!");
                    System.exit(0);
            }
        }
        
    //Choice #4-Method for subtracting a point to a specified player(use index -1 to make it user friendly)
        public static void subtractPoint(Scanner input, ArrayList<Integer> points, ArrayList<String> players, int winningScore){
            System.out.println("Please enter the index of the player you would like to subtract a point from: ");  
            System.out.println();
            int index = input.nextInt();
            int score = points.get(index - 1);
            if(score != winningScore){
                points.set(index - 1, points.get(index - 1) - number(input)); 
            }    
            if(points.get(index - 1) == winningScore){
                    System.out.println("Congrats, " + players.get(index - 1) + " you have won the game!");
                    System.exit(0);
            }   
        }
    
    //Choice #5-Method for displaying the current points for each player
        public static void displayPoints(Scanner input, ArrayList<Integer> points, ArrayList<String> players){
            for(int count = 0; count < players.size(); count++){
                String name = players.get(count);
                int point = points.get(count);
                System.out.println("Player Name: " + name + " Score: " + point);
                System.out.println();
            }
        }
        
    //Method for user to enter the number of points they want to add or subtract
        public static int number(Scanner input){
            System.out.println("How many points do you want to add or subtract?");
            int num = input.nextInt();
            
            return num;
        }
    
    //Method to display the menu options to the user
    public static int getMenuChoice(Scanner input){
        // Display menu.
        System.out.println("SCORE KEEPER PROGRAM OPTIONS");
        System.out.println("----------------------------");
        System.out.println("1. Enter the number playing to");
        System.out.println("2. Enter a new player");
        System.out.println("3. Add point");
        System.out.println("4. Subtract point");
        System.out.println("5. Display Current Scores");
        System.out.println("6. Exit Program");
        System.out.println("----------------------------");
        System.out.print("Choose an option: ");
        System.out.println();
       
        // Get menu choice from user.
        int choice = input.nextInt();
       
        // Ask user again if choice is not valid
        while (choice < 1 || choice > 6){
            System.out.print("Error: Choices are numbers 1-6 only");
            choice = input.nextInt();
        }
      
        // Return choice in order to call the correct method for the choice made
        return choice;
    }
}
