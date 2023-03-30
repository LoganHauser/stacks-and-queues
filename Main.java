import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner inputScanner = new Scanner(System.in);
        //Create an empty Queue
        Queue<Integer> queue = new LinkedList<>();
        //Create an empty Stack
        Stack<Integer> stack = new Stack<>();

        //Ask the user to enter data
        System.out.println("Enter data. Enter -1 to finish.");
        //Start a loop
        while (true) {
            try {
                //Store the input from the user
                int input = Integer.parseInt(inputScanner.nextLine());
                //Break from the loop if the user inputs -1
                if (input == -1) {
                    break;
                }
                //Add the user input to the queue and stack
                queue.add(input);
                stack.push(input);
            } catch (NumberFormatException e) {
                //Print a message if the user input is not an int
                System.out.println("Please enter an integer value.");
            }
        }

        //Print each element in the queue
        System.out.println("Queue:");
        int queueSize = queue.size();
        for (int i = 0; i < queueSize; i++) {
            System.out.println(queue.remove());
        }
        System.out.println();

        //Print each element in the stack
        System.out.println("Stack:");
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.println(stack.pop());
        }
        System.out.println();

        //Simulate a stack of books with a stack
        System.out.println("Enter the title of a book to add it on top of the stack of books.");
        System.out.println("Enter \"take\" to take the top book.");
        System.out.println("Enter \"done\" to end the program.");
        //Variable for storing the user input
        String input;
        //Create an empty stack
        Stack<String> bookStack = new Stack<>();
        //Loop until the user input equals "done"
        while (!(input = inputScanner.nextLine()).toLowerCase().equals("done")) {
            //If the user input equals "take"
            if (input.toLowerCase().equals("take")) {
                if (bookStack.empty()) {
                    //Print a message if the stack is empty
                    System.out.println("The stack of books is empty.");
                } else {
                    //If the stack is not empty, tell the user which book they took
                    System.out.println("You took the book \"" + bookStack.pop() + "\" from the stack of books.");
                    
                    if (bookStack.empty()) {
                    //Print a message if the stack is empty
                    System.out.println("The stack of books is empty.");
                    } else {
                        //If the stack is not empty, print each book in the stack from top to bottom
                        System.out.println("Books in the stack from top to bottom:");
                        for (int i = bookStack.size() - 1; i > -1; i--) {
                            System.out.println(bookStack.get(i));
                        }
                    }
                }
            } else {
                //If the user did not enter "take", add the inputted book to the stack
                bookStack.push(input);
                //Tell the user that they added the book to the stack
                System.out.println("You put the book \"" + input + "\" onto the stack of books.");
                //Print each book in the stack from top to bottom
                System.out.println("Books in the stack from top to bottom:");
                for (int i = bookStack.size() - 1; i > -1; i--) {
                    System.out.println(bookStack.get(i));
                }
            }
            System.out.println();
        }

        //Close the scanner
        inputScanner.close();
    }
}
