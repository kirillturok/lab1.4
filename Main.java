package com.company;

import java.util.Scanner;

public class Main {
static List2<Integer> list2 = new List2<>();
static List<Integer> list = new List<>();
    public static void main(String[] args) {
        System.out.println("Введите номера телефонов. Чтобы закончить ввод, введите 0.");
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
            num=scanner.nextInt();
            if(num==0) break;
            if((num>999&&num<1000000)||num>9999999||num<100){System.out.println("Неверный ввод.Повторите еще раз.");}else{list2.add(num);}

        }while(true);
        list2.task();
        list.print();
    }
}
