
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStream;
import java.util.List;

public class Delivery {

    public static void main(String[] args) {
        order(System.in);
    }

    public static double order(InputStream in) {
        //Greeting! Welcome to our restaurant
        System.out.println("Welcome to Happy Lamb!!!");
        //print the menu
        List<String> list = new ArrayList<>();
        list.add("the egg price is $1.99\n");
        list.add("the beef price is $2.99\n");
        list.add("the lamb price is $3.99\n");
        list.add("the fish price is $4.99\n");
        list.forEach( v-> System.out.print(v + ""));
        double egg = 1.99;
        double beef = 2.99;
        double lamb = 3.99;
        double fish = 4.99;

        Scanner input = new Scanner(System.in);
        System.out.println("What food would you like to order? ");

        String food1 = input.nextLine();
        System.out.println("Would you want another order?");
        String order_answer1 = "Yes";
        String answer2 = "No";
        String order_answer2 = "egg";
        String order_answer3 = "beef";
        String order_answer4 = "fish";
        String order_answer5 = "lamb";

        String result = input.nextLine();

        if (result .equals("Yes"))
            System.out.println("What other food would you like? ");

        else if (result .equals("No"))

            System.out.println("Would you want a tip?");

        if (result .equals("No")){

            }

        String food2 = input.nextLine();
            System.out.println("Would you like to make another order");
            String keyboard = input.nextLine();
       if (result.equals("beef"))
           System.out.println("Would you like to make another order?");

        else if (result .equals("No"))

           System.out.println("Would you want a tip?");
        String food3 = input.nextLine();
        if (result.equals("lamb"))
            System.out.println("Thank you for ordering, what other food you would you like to order?");
        else if (result . equals("beef"))
            System.out.println("Thank you for ordering, would you like to stop ordering?");
        else if (result .equals("fish"))
            System.out.println("Thank you for ordering, would you like to stop ordering? ");





        System.out.println("Would you like us to deliver the food for you?");

        String answer1 = "Yes";
        String answer3 = "No";
        String customer = input.nextLine();
        if (customer .equals("Yes"))
            System.out.println("The Delivering tip is $5.99");
        else if (customer .equals("No")) {
            System.out.println("Would you want a tip?,Plse enter an amount between 0-40");
        }
        else {
            System.out.println("You are good to go! Here is your total price:");

        }


        //0-40
        System.out.println("Please enter an amount you want tip(0-40) :");
        int tipNum = input.nextInt();
        double tax;
        tax = ( 0.1 * beef + lamb + fish + egg );
        double price = (tax + tipNum + beef + lamb + fish + egg);
        System.out.println("Your total price is : " + price);

        //CalculateTotal
        return(-1);
        //return to -1
        }
    }