package practice;

import java.util.Scanner;

public class Basics {
    public String word(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
        
    }
    public static void main(String[] args){
        Basics basics = new Basics();
        String result = basics.word();
        System.out.println("The word is : " + result);
    }
}
