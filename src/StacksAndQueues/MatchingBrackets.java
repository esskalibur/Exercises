package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression=scanner.nextLine();
        ArrayDeque<Integer>indexes=new ArrayDeque<>();
        for(int i=0;i<expression.length();i+=1){
            char currentSymbol = expression.charAt(i);
            if(currentSymbol=='('){
                indexes.push(i);
            } else if (currentSymbol==')') {
                Integer lastIndex = indexes.pop();
                String matching=expression.substring(lastIndex,i+1);
                System.out.println(matching);
            }
        }
    }
}
