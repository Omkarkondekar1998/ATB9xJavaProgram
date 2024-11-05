package Oct.ex_30122024;

import java.util.Scanner;

public class Lab137 {

    public static void main(String[] args) {
        //Right hand triangle
        //*
        //**
        //***
        //****
        //*****

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");

        int n = scanner.nextInt();

        for (int i = 0; i <n ; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
