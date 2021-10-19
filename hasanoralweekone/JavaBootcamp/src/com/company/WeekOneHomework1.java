package com.company;

import java.util.Scanner;

public class WeekOneHomework1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please gimme a number:");
        int n = scanner.nextInt();

        if (n == 0){
            System.out.println("Gimme another number, Zero is not allowed!");
        }
        else if (n == 1){
            System.out.println("*");
        }
        else{

            for (int i = 0;i<n;i++){
                System.out.print("* ");
                for(int j = 0;j<n-2;j++){

                    if (i == 0 || i == n-1 ){
                        System.out.print("* ");
                    }

                    else{
                        if(i%2 == 1 && i != n-1){
                            if(j%2==0){
                                System.out.print("+ ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }

                        else if(i%2 == 0 && i != 0){
                            if(j%2==1){
                                System.out.print("+ ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                    }

                }
                System.out.print("*");
                System.out.println("");
            }

        }

    }
}
