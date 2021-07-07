package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int array[];
        do {
            System.out.println("nhap kich thuoc mang : ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("kich thuoc mang vuot qua");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.println("Danh sach da nhap : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //Tim gia tri Max
        int Max = array[0];
        int index =1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Max) {
                Max = array[i];
                index++;
            }
        }
        System.out.println("Gia tri lon nhat la : "+Max+" tai vi tri "+ index);
    }
}