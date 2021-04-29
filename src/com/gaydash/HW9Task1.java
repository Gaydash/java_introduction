package com.gaydash;

/*
1) В банк положили S денег. Какой станет сумма вклада через N лет,
если процент 1,5% добавляется к сумме вклада ежемесячно.
*/

import java.util.Scanner;

public class HW9Task1 {

    public static final double INTEREST_RATE = 0.015;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму вклада S = ");
        double money = in.nextDouble();
        System.out.println("Введите количество лет N = ");
        int yearsCount = in.nextInt();
        System.out.println("Сумма вклада через " + yearsCount + "года, будет составлять: "
                + getSumDeposit(yearsCount, money) + " грн.");
    }

    public static double getSumDeposit(int yearsCount, double money) {
        for (int i = 1; i <= (yearsCount * 12); i++) {
            money = money + (money * INTEREST_RATE);
        }
        return money;
    }
}
