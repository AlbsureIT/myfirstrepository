package vacationfinder;

import java.util.Scanner;

public class VacationFinder {

    public static void main(String[] args) {
        //arrays containing vacation destinations
        String[] sunnyDestination = {"cancun", "Miami"};
        String[] snowyDestination = {"Edmonton", "Aspen"};

        //varible to indicate if user wants to quit 
        Boolean quit = false;

        //keep looping until user indicates they want to quit
        while (!quit) {

            //greet the user
            System.out.println("Welcome to vacation Finder!");

            //create a scanner 
            Scanner scanner = new Scanner(System.in);

            //ask the user a question to give recomendations
            System.out.println("do you prefer a sunny or snowy vacation");

            //get the input from the user
            String input = scanner.next();

            // use if statement to determine whic list of vacation destinations 
            //to display
            
         //use an if statement to determine which list of vacation destinations
        // to display
                if (input.equals("sunny")) {
                    System.out.println("here are some sunny vacation "
                            + "destinations that you might like to visit");

              //loop through the list of sunny destinations and display them 
                    for (int i = 0; i < sunnyDestination.length; i++) {
                        System.out.println(sunnyDestination[i]);
                    }//end for loop

           } else if (input.equals("snowy")) {
                 System.out.println("here are some snowy vacation destinations "
                            + "that you might like to visit: ");

             //loop through the list of snowy destinations and display them
             for (int i = 0; i < snowyDestination.length; i++) {
            System.out.println(snowyDestination[i]);
            //end for loop
                    }

          } else {
               System.out.println("sorry, I can only make recommendations ");
          } // end else if

        //ask a question of the user and response using a switch statement
         System.out.println("what is the most popular vacation destination?");
         System.out.println("Enter A for Vegas, B for Cancun, C for Miami.");

         //get the answer from the user 
             input = scanner.next();

                //use a switch statement to determine the response
                switch (input) {
                    case "A":
                        System.out.println("you are correct");
                        break;

                    case "B":
                        System.out.println("incorrect");
                        break;

                    case "C":
                        System.out.println("incorrect");
                        break;
                }
                //ask the user if they want to quit
                System.out.println("Enter Q if you want to quit.");

                //get the user's input
                input = scanner.next();

                //if the user enters Q to quit, then assign quit value of true
                //so that the program will not repeat again
                if (input.equals("Q")) {
                    quit = true;
                }//end if
            }// end while loop

        } //end main

    }// end class

