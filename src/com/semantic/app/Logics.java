import java.util.Scanner;

public class Logics{

  public static int reverseNumber(int n){
    int rev = 0, rem = 0;
    while( n>0 ){
      rem = n%10;
      rev = rev*10 +rem;
      n = n/10;
    }
    return rev;
  }

  public static String palindomeNumber(int num){
    int temp = num;
    int rev = Logics.reverseNumber(num);
    if(rev == temp){
      return "given number is palindrome";
    }
    else{
      return "Given number is not a palindrome";
    }
  }

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter any number");
    int number = scn.nextInt();
    //Logics logic = new Logics();
    int reverse = Logics.reverseNumber(number);
    System.out.println("Reverse Number is :: "+reverse);
    String palindrome = Logics.palindomeNumber(number);
    System.out.println(palindrome);
  }
}
