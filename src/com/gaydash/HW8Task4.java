package com.gaydash;

import java.util.Arrays;
import java.util.Scanner;


/*
Баланс скобок. Дана конечная последовательность, состоящая из левых и правых скобок различных заданных типов.
Определить, можно ли добавить в нее цифры и знаки арифметических действий так, чтобы получилось правильное арифметическое выражение.
Примеры:
1 ( NO
2 )) NO
3 [} NO
4 {} YES
5 (){}[] YES
6 ({[]}{}) YES
7 [({}())[] NO
*/

public class HW8Task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please input set of brackets: ");
        String bracketsSet = in.next();
        char[] helpArray = correctBrackets(bracketsSet);
        System.out.println(Arrays.toString(helpArray));


    }

    private static char[] correctBrackets(String str){
        char[] str1 = str.toCharArray();
        char[] exitStr = new char[10];
        int k = 0;
        for (char c : str1) {
            if (c == '[' || c == '(' || c == '{'){
                exitStr[k] = c;
                k ++;
            }
            if (exitStr == null || exitStr.length==0){
                System.out.println(exitStr.length);
 //               return false;
            }
        }
        System.out.println(exitStr.length);
        return exitStr;
    }

}
