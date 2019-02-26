// Ocean Lu
// CS14
// Assignment 3
// 11.06.17

import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double[][] sales = new double[6][4];
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 4; c++) {
                sales[r][c] = keyboard.nextDouble();
            }
        }

        System.out.println("\nSALES AMOUNTS BY DIVISION" + "\n=========================");
        for (int r = 0; r < 6; r++) {
            System.out.println("DIVISION " + (r + 1));
            for (int c = 0; c < 4; c++) {
                System.out.printf("Quarter " + (c + 1) + ": $%,.2f \n", sales[r][c]);
            }
            System.out.println();
        }

        System.out.println("\nQUARTERLY INCREASE/DECREASE BY DIVISION" + "\n=======================================");
        for (int r = 0; r < 6; r++) {
            System.out.println("DIVISION " + (r + 1));
            for (int c = 1; c < 4; c++) {
                System.out.printf("Quarter " + (c + 1) + ": $%,.2f \n", ((sales[r][c]) - (sales[r][c - 1])));
            }
            System.out.println();
        }

        System.out.println("\nSALES AMOUNTS BY QUARTER" + "\n========================");
        for (int c = 0; c < 4; c++) {
            double amount = 0;
            for (int r = 0; r < 6; r++) {
                amount += sales[r][c];
            }
            System.out.printf("Quarter " + (c + 1) + ": $%,.2f \n", amount);
        }

        System.out.println("\nQUARTERLY INCREASE/DECREASE FOR THE COMPANY" + "\n===========================================");
        for (int c = 1; c < 4; c++) {
            double one = 0;
            double two = 0;
            for (int r = 0; r < 6; r++) {
                one += sales[r][c];
                two += sales[r][c - 1];
            }
            System.out.printf("Quarter " + (c + 1) + ": $%,.2f \n", one - two);
        }

        System.out.println("\nAVERAGE SALES PER QUARTER" + "\n=========================");
        for (int c = 0; c < 4; c++) {
            double amount = 0;
            for (int r = 0; r < 6; r++) {
                amount += sales[r][c];
            }
            System.out.printf("Quarter " + (c + 1) + ": $%,.2f \n", amount / 6);
        }

        System.out.println("\nDIVISION WITH THE HIGHEST SALES PER QUARTER" + "\n===========================================");
        for (int c = 0; c < 4; c++) {
            int division = 0;
            double highest = sales[0][c];
            for (int r = 1; r < 6; r++) {
                if (highest < sales[r][c]) {
                    highest = sales[r][c];
                    division = r;
                }
            }
            System.out.println("Highest division for quarter " + (c + 1) + " is division " + (division+1));
        }
    }
}

