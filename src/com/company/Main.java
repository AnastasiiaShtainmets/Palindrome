package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner =new Scanner(System.in);
        String str1;
        str1=scanner.nextLine();
        StringBuilder strBuilder=new StringBuilder(str1);
        String str2 = (strBuilder.reverse()).toString();
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Строка является палиндромом");
        }
        else{
            System.out.println("Строка не является палиндромом");

        }
    }
}
