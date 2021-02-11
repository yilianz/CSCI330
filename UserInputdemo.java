import java.util.Scanner;

import javax.management.RuntimeErrorException;

import java.util.InputMismatchException;

public class UserInputdemo {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    String name = "[N/A]";
    int age = 0;

    System.out.println("Welcome to the Georgia Driver License Application System. Please enter your information.");

    try {
      System.out.println("Enter age:");
      int newAge = in.nextInt(); // expecting an integer
      checkAge(newAge);
      age = newAge;
      System.out.println("Enter name: ");
      name = in.next();
      checkName(name);  
      System.out.println("User information entered. Name: " + name + ". Age: " + age + ".");
    } catch (InputMismatchException e) {
      System.out.println("Your input does not match the expected data! Re-enter, please.");
      //throw new RuntimeException("data error!");    // what happens?
      // System.out.println(e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("Something went wrong:" + e.getMessage());
      // e.printStackTrace();
    } finally {
      // clean up code 
      System.out.println("Thanks for your input.");
    }
    System.out.println("Your information is stored in the system");
  }

  public static void checkAge(int age) {
    if (age < 18)
      throw new RuntimeException("Too young to drive!");
    else
      return;
  }

  public static void checkName(String name) {
    if (name.length() > 10)
      throw new RuntimeException("Name is too long.");
    else
      return;
  }
}
