/*
 Eric Young
 CIS254
 March 12th, 2019
 Professor Harden
 Assignment 7.2
 
Utilizes the methods created within MyMath class. Creates the application with selections for displaying prime numbers or perfect numbers with an option to quit the program.
User selected input correlates to which method will be called upon.

 */

import javax.swing.*;

public class MyMathTest{
   public static void main(String args[]){
       int input;
       while(true){
           JFrame frame = new JFrame("MathTest");
           String choice1 = JOptionPane.showInputDialog(frame, "Please Select an Option \n1: Prime numbers within 1-1000\n2: Perfect numbers within 1-10000\n3: Quit");
           input = Integer.parseInt(choice1);
           String output = "";
           if(input == 1){
               output += "The prime numbers from 1-1000 are:\n";
               int count = 0;
               for(int i = 1; i <= 1000; i++){
                   if(MyMath.isPrime(i)){
                       count++;
                       output = output + i + " ";
                       if(i < 100) output += " ";
                       if(i < 10) output += " ";
                       if(count % 10 == 0) output += "\n";
                   }
               }
           }
           else if(input == 2){
               output += "The perfect numbers from 1-1000 are:\n";
               for(int i = 1; i <= 10000; i++){
                   if(MyMath.isPerfect(i)){
                       output = output + i + " ";
                   }
               }
           }
           else if(input == 3){
               output += "Thanks for using the program!!";
               JOptionPane.showMessageDialog(frame, output);
               break;
           }
           JOptionPane.showMessageDialog(frame, output);
       }
   }
}

