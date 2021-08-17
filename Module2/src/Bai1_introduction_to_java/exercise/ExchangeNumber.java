package Bai1_introduction_to_java.exercise;

import java.util.Scanner;

public class ExchangeNumber {
        public static void main(String[] args) {
            System.out.println("Hãy nhập số: ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int hangChuc = (a % 100) / 10;
            int hangTram = a / 100;
            int hangDonVi = a - hangTram * 100 - hangChuc * 10;
            int soDacBiet = (a % 100);
            if (a <= 10) {
                soDonVi(hangDonVi);
            } else if (a < 20) {
                soDacBiet1(soDacBiet);
            } else if (a < 1000) {
                soTram(hangTram);
                if (hangChuc == 1) {
                    soDacBiet1(soDacBiet);
                } else {
                    soChuc(hangChuc);
                    soDonVi(hangDonVi);
                }
            }
        }

        public static void soDonVi(int hangDonVi) {
            switch (hangDonVi) {
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" four");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" seven");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;
                case 10:
                    System.out.print(" ten");
                    break;
            }
        }

        public static void soChuc(int hangChuc) {
            switch (hangChuc) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("eventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
        }

        public static void soTram(int hangTram) {
            switch (hangTram) {
                case 1:
                    System.out.print(" one hundred ");
                    break;
                case 2:
                    System.out.print(" two hundred ");
                    break;
                case 3:
                    System.out.print(" three hundred ");
                    break;
                case 4:
                    System.out.print(" four hundred ");
                    break;
                case 5:
                    System.out.print(" five hundred ");
                    break;
                case 6:
                    System.out.print(" six hundred ");
                    break;
                case 7:
                    System.out.print(" seven hundred ");
                    break;
                case 8:
                    System.out.print(" eight hundred ");
                    break;
                case 9:
                    System.out.print(" nine hundred ");
                    break;
            }
        }

        public static void soDacBiet1(int dacBiet) {
            switch (dacBiet) {
                case 11:
                    System.out.print(" eleven ");
                    break;
                case 12:
                    System.out.print(" twele ");
                    break;
                case 13:
                    System.out.print(" thirteen ");
                    break;
                case 14:
                    System.out.print(" fourteen");
                    break;
                case 15:
                    System.out.print(" fifteen ");
                    break;
                case 16:
                    System.out.print(" sixteen ");
                    break;
                case 17:
                    System.out.print(" seventeen ");
                    break;
                case 18:
                    System.out.print(" eighteen ");
                    break;
                case 19:
                    System.out.print(" nineteen ");
                    break;
            }
        }
    }

