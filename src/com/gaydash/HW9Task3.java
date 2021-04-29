package com.gaydash;

/*
3*) Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве.
Входящие параметры: массив и число.
(считаем что массива который нам передали отсортирован, проверять это не нужно)
*/

public class HW9Task3 {

    public static final int REQUIRED_NUMBER = 3;

    public static void main(String[] args){
        int index = binarySearch(new int[]{1, 3, 4, 5, 6, 7, 8, 9, 10, 11}, REQUIRED_NUMBER);
        if (index<0){
            System.out.println("Такого элемента в массиве нет");
        } else{
            System.out.println("Такой элемент в массиве есть, его индекс: " + index);
        }
    }

    public static int binarySearch(int[] arr, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;
        }
        return -1;
    }
}
