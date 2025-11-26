package primeOrNot;

import java.util.Scanner;

class PrimeOrNot {

    public Boolean primeCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the num");
        Integer n = scanner.nextInt();
        scanner.close();
        if(n <= 1){
            return false;
        }
        Boolean isPrime=true;
        for(int i = 2; i < n ; i++){
            if (n % i == 0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args ){

        PrimeOrNot primeOrNot = new PrimeOrNot();
        Boolean result = primeOrNot.primeCheck();
        System.out.println(result ? "It is a prime number" : "It is not a prime number"); 

    }
}
