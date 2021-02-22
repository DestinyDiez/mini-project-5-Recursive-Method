import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner myBank = new Scanner(System.in);
   String userName;

   System.out.println("Hello, welcome to Crest Bank! Please enter you username.");
   userName = myBank.nextLine();

   System.out.println("Thank You, your username is: " + userName);

   

  }
}