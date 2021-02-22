import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //This will let users input a username
   Scanner myBank = new Scanner(System.in);
   String userName;

   System.out.println("-Hello, welcome to Crest Bank! Please enter you username below.");
   userName = myBank.nextLine();

   System.out.println("Thank You, your username is: " + userName);

   //This will let users input a password
   Scanner crestBank = new Scanner(System.in);
   String passWord;

   System.out.println("-Now please enter your password below.");
   passWord = crestBank.nextLine();

   System.out.println("Thank you your password is: " + passWord );
   System.out.println("-Welcome to your crest Bank account-");
   System.out.println("Below is your remaining amount after last weekss transactions");





  }
}