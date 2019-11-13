package com.semantic.app;

public class SampleProj {

  public static String reverseString(String str){
    String rev = "";
    for(int i=str.length()-1; i>=0; i--){
      rev = rev + str.charAt(i);
    }
    return rev;
  }
  public static void main(String[] args) {
    System.out.println("welcome to new got world");

    Scanner scn = new Scanner(System.in);
    System.out.println("Enter any string");
    String name = scn.nextLine();
    System.out.println("Given String is :: "+name);

  }
    public static void main(String[] args) {
        System.out.println("welcome to new got world");
        System.out.println("develope branch");
    }
}
