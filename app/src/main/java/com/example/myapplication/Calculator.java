package com.example.myapplication;

import java.util.ArrayList;
import java.util.Stack;

public class Calculator {
    StringBuilder sb = new StringBuilder();
    StringBuilder sb1 = new StringBuilder();
    ArrayList<String> string = new ArrayList<>();

    public void append(char input) {
        sb1.append(input);
        if(isOperator(String.valueOf(input))) {
            string.add(sb.toString());
            string.add(String.valueOf(input));
            sb.delete(0, sb.length());
            return;
        }
        sb.append(input);
    }
    public String getString() {
        return sb1.toString();
    }
    public String getLastIndex() {
        return String.valueOf(sb1.charAt(sb1.length()-1));
    }
    private ArrayList<String> toPostFix(ArrayList<String> input) {
        Stack<String> stack = new Stack<>();
        ArrayList<String> sb = new ArrayList<>();

        for(int i = 0; i < input.size(); i++) {
            String char1 = input.get(i);
            if(isOperator(char1)) {
                while (true) {
                    if(stack.isEmpty()) {
                        break;
                    }
                    if (isSamePrecedence(char1, stack.peek())
                            || !isHigherPrecedence(char1, stack.peek())) {
                        sb.add(stack.pop());
                    }
                    else {
                        break;
                    }
                }

                stack.push(char1);
            }
            else {
                sb.add(char1);
            }
        }
        while(!stack.isEmpty()) {
            sb.add(stack.pop());
        }
        return sb;
    }
    public void solve() {
        string.add(sb.toString());
        ArrayList<String> postfix = toPostFix(string);
        Stack<Double> stack = new Stack<>();
        string.clear();
        sb1.delete(0, sb1.length());

        for (int i = 0; i < postfix.size(); i++) {
            if(!isOperator((postfix.get(i)))) {
                stack.push(Double.parseDouble(postfix.get(i)));
                continue;
            }
            double b = stack.pop();
            double a = stack.pop();
            stack.push(getResult(a, postfix.get(i), b));
        }
        string.add(String.valueOf(stack.pop()));
        sb1.append(string.get(0));
        sb.delete(0, sb.length());
        sb.append(string.get(0));
    }
    public String getInfixResult() {
        ArrayList<String> infix = toInfix(sb1.toString());
        Stack<String> stack = new Stack<>();
        String string1;

        for (int i = 0; i < infix.size(); i++) {
            if(stack.size() < 2) {
                stack.push(infix.get(i));
                continue;
            }
            double b = Double.parseDouble(infix.get(i));
            String op = stack.pop();
            double a = Double.parseDouble(stack.pop());
            stack.push(String.valueOf(getResult(a, op, b)));
        }
        string1 = stack.peek();
        return string1;
    }
    private double getResult(double a, String op, double b) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }
    public static boolean isOperator(String input) {
        switch (input) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
            default:
                return false;
        }
    }
    public static boolean isDecimal(String input) {
        return input.equals(".");
    }
    private boolean isHigherPrecedence(String input1, String input2) {
        return (input1.equals("*") || input1.equals("/")) && (input2.equals("+") || input2.equals("-"));
    }
    private boolean isSamePrecedence(String input1, String input2) {
        if((input1.equals("*")|| input1.equals("/")) && (input2.equals("*") || input2.equals("/"))) {
            return true;
        }
        return (input1.equals("+") || input1.equals("-")) && (input2.equals("+") || input2.equals("-"));
    }

    private ArrayList<String> toInfix(String input) {
        ArrayList<String> string1 = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            String char1 = String.valueOf(input.charAt(i));
            if(isOperator(char1)) {
                string1.add(sb.toString());
                string1.add(char1);
                sb.delete(0, sb.length());
                continue;
            }
            sb.append(char1);
        }
        string1.add(sb.toString());
        return string1;
    }

}
