/*
 Eric Young
 CIS254
 March 12th, 2019
 Professor Harden
 Assignment 7.2
 
The MyMath class is composed of two methods, isPerfect and isPrime. These methods check if an int i is a perfect number and a prime number.
These methods are involved in the MyMathTest class that is an application where the user is able to select from 3 options which display the perfect numbers up to 10000 and
prime numbers up to 1000. 

 */

public class MyMath {
   static boolean isPerfect(int x){
       int sum = 0;
       for(int i = 1; i < x; i++){
           if(x % i == 0) sum += i;
       }
       if(x == sum) return true;
       else return false;
   }
   static boolean isPrime(int x){
       int count = 0;
       for(int i = 1; i <= Math.sqrt(x); i++){
           if(x % i == 0) count++;
       }
       if(count == 1) return true;
       else return false;
   }
}