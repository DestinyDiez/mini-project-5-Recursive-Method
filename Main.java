import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner myBank = new Scanner(System.in);
   String userName;

   System.out.println("Hello, welcome to Crest Bank! Please enter you username below.");
   userName = myBank.nextLine();

   System.out.println("Thank You, your username is: " + userName);

   Scanner crestBank = new Scanner(System.in);
   String passWord;

   System.out.println("Now please enter your password below.");
   passWord = crestBank.nextLine();

   System.out.println("Thank you your password is: " + passWord);

   



  }
}