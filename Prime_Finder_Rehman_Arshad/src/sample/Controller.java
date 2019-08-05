package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class Controller {

    @FXML private TextField input;
    @FXML private TextField output;
    @FXML private Button calculate;


    public void calulateButtonPressed(ActionEvent event){

        try{
            double userInput = Double.parseDouble(input.getText());

            // Use String.format(" to convert doubles/int's to text ... ");
            // Use the parse function ... to convert strings to doubles,
            // The reason why is because TextFields ONLY accept Strings!!!


            if( userInput < 0 ){
                // Exception with negative inputs:
                input.setText("Enter a positive number please!");
            }else{
                output.setText(Prime_Factorization(userInput, input));
                // Sets the text of the output Textfield to whatever the prime factorization function returns ...
            }
        } catch (NumberFormatException ex) {
            input.setText("Enter a number ");
            input.selectAll();
            input.requestFocus();
        }
    }


    public static String Prime_Factorization(double userInput, TextField input) {

        // System.out.println("Enter a number >> ");

        userInput = Double.parseDouble(input.getText());


        Set<Integer> a = new HashSet<Integer>();
        ArrayList<Integer> Array = new ArrayList<Integer>();

        // System.out.println("Prime Factors in Set (duplicates are not included in the set, but are printed anyway!): ");


        for (int i = 2; i < userInput; i++) {
            while (userInput % i == 0) {
                a.add(i);                         // stores all prime factors excluding duplicates AS SETS DO NOT HAVE DUPLICATES!!!
                // System.out.println(a);            // prints the result of the prime factors in the set, including duplicates because the statement is executed every time in the loop.
                userInput = userInput / i;              // looks for every factor that is also not prime and is divisible by i.

                Array.add(i);                     // stores all prime factors including DUPLICATES, because arrays can have duplicates! :D
            }
        }

        if (userInput > 2) {
            // System.out.println(userInput);
        }

        // System.out.println("\nPrime Factors in Array (including duplicates for RARE instances, Since Set's do not allow duplicates!): ");
        // System.out.println(Array);                // prints out all the stored prime factors (including duplicates).116

        String output = Array.toString();         // Stores the Array elements as a String ...

        return output;                            // Returns the elements in a String so the .setText() method can be applied ...
    }

}

// Rehman Arshad
// CSC 221: Software Design Lab:
// (Assignment 6: With GUI)

//======================================================================================
// Report om assignment: (optional read it if you are not busy and curious)
//======================================================================================

// Really fun project I learned a bunch, My life became so much easier after I realized that I could simply pass a Textfield parameter
// into the other function, because before I was using scanner so half my app was GUI, but the results were being printed in the
// IDE console, what's worse is that it wasn't properly using user input. I had to manually type the number again in the console.

// The Crux of My problem:

// So Scanner input = new Scanner(System.in);
// double userInput = input.nextInt();

// Not only wold this be disastrous from an exception handling point it was causing other unintended problems ... as mentioned above.
// The error I would keep getting was that double and Textfield's were not compatible types, and what's worse is that since everything in
// java must be in a class, things can easily go out of scope! How Would I get around this?

// Unlike in C++ where a variable MUST be defined before it is passed into a function as a parameter, unless your using a copy parameter,
// which is what java uses by default ... The benefit is that I can pass a compatible type value from one function into another, as
// long as the the function accepts the parameter. This allowed me to do ...

// userInput = Double.parseDouble(input.getText());
// SOLVING MY PROBLEM INSTANTLY!!!   :D

// The rest (Prime Factorization function) is the same as before! :D
// Then i just commented out my print calls, because it was no longer needed since the GUI would handle that! :D

//======================================================================================
//======================================================================================
