import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //This will let users input a username
   Scanner myBank = new Scanner(System.in);
   String userName;

   System.out.println("-Hello, welcome to Crest Bank! Please enter you username below:");
   userName = myBank.nextLine();

   System.out.println("Thank You, your username is: " + userName);

   //This will let users input a password
   Scanner crestBank = new Scanner(System.in);
   String passWord;

   System.out.println("-Now please enter your password below:");
   passWord = crestBank.nextLine();

   System.out.println("Thank you your password is: " + passWord );

   //This is additional printstaments to bring the code together
   System.out.println("-Welcome to your crest Bank account-");
   System.out.println("Below is your remaining amount after last weekss transactions:");

    int result = sum(10);
    System.out.println("$" + result);
  }
   // the recursion here will keep printing until 10
    public static int sum(int num)
    {
      if (num > 0)
     { 
       return num + sum(num - 1);
       //10 + 45 = 55
       //9 + 36 = 45
       //8 + 28 = 36
       //7 + 21 = 28
       //6 + 15 = 21
       //5 + 10 = 15
       //4 + 6 = 10
       //3 + 3 = 6
       //2 + 1 = 3
       //1 + 0 = 1
     }else{
       return 0;
     }
    

 




  }
}