package com.nicoo;
import java.util.*;
public class MatchingParenthesis {
    // Global object.
    static Scanner read = new Scanner(System.in);

    // Function for getting the boolean value by checking the inputted parenthesis string if it's matched or not.
    static boolean Parenthesis(String parenthesesInput) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parenthesesInput.length(); i++) {
            if (parenthesesInput.charAt(i) == '(') {
                stack.push(parenthesesInput.charAt(i));
            }else if(stack.empty()){
                return false;
            }else{
                if (parenthesesInput.charAt(i) == ')') {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    // Function for printing the output of the inputted cases.
    static void Print(){
        int x = 0;
        System.out.print("Enter number of test cases: ");
        int nCases = read.nextInt();
        Stack<String> stack = new Stack<>();

        while (x <= nCases){
            String pInput = read.nextLine();
            if(Parenthesis(pInput)) {
                stack.push(" properly matched");
            }else{
                stack.push(" not properly matched");
            }
            x++;
        }
        for (int i = 1; i <= nCases; i++) {
            System.out.println( "Case #" + i + stack.get(i));
        }
    }
    public static void main(String[] args) {
        Print();
    }
}
/*
* Llosa, Eduardo Dominico F.
* CC 13.1 B - DATA STRUCTURES AND ALGORITHMS
* Activity 4: Matching Parenthesis
* */