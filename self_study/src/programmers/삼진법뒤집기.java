package programmers;

import java.util.Scanner;
import java.util.Stack;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        int n = 1;
        String str = Integer.toString(n, 3);
        Stack s = new Stack();
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }
        String temp = "";
        for(int i = 0; i < str.length(); i++){
            temp += s.pop();
        }
        int answer = Integer.parseInt(temp, 3);
        System.out.println(answer);
    }
}
