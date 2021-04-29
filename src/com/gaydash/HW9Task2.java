package com.gaydash;

/*
2) Реализовать метод который вернет строку String, в которой через пробел все числа от 1 до 99
со следующими изменениями:
- если число кратно 3 то вывести вместо него Hello
- если число кратно 5 то вывести вместо него World
- если число кратно и 3 и 5 то вывести вместо него HelloWorld
*/

public class HW9Task2 {
    public static void main(String[] args) {
        getHelloWorldString();
    }

    private static void getHelloWorldString() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 5 != 0) && (i % 3 != 0)) {
                System.out.print(i + " ");
            } else {
                if (i % 3 == 0) {
                    System.out.print("Hello ");
                }
                if (i % 5 == 0) {
                    System.out.print("World ");
                }
            }
        }
    }
}
