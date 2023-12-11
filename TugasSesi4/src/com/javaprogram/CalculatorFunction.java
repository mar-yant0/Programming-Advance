package com.javaprogram;

import java.util.Scanner;

public class CalculatorFunction {
    public static void main(String[] args) {
        int nilai1;
        int nilai2;
        int hasil;
        int pilihAngka;

        String operator;

        Scanner inputUser = new Scanner(System.in);

        while (true){

            System.out.println("=====================");
            System.out.println("Haloo, Selamat datang");
            System.out.println("=====================");
            System.out.println("1. Calculator");
            System.out.println("2. keluar");
            System.out.println("---------------------------------------------------------");

            System.out.print("Pilih 1 untuk memulai Calculator | pilih 2 untuk Keluar:");
                pilihAngka = inputUser.nextInt();
            System.out.print("\n");

                if (pilihAngka == 2){
                    System.out.println("====================================");
                    System.out.println("Terimakasih, sampai berjumpa kembali");
                    System.out.println("====================================");
                    break;

                } else if (pilihAngka == 1) {
                    System.out.print("Masukan nilai pertama: ");
                    nilai1 = inputUser.nextInt();

                    System.out.print("Masukan Operator (+, -, *, /): ");
                    operator = inputUser.next();


                    System.out.print("Masukan nilai kedua: ");
                    nilai2 = inputUser.nextInt();

                    switch (operator){
                        case "+":
                            hasil = nilai1 + nilai2;
                            System.out.printf("%d + %d = %d", nilai1, nilai2,hasil);
                            System.out.println("\n");
                            break;
                        case "-":
                            hasil = nilai1 - nilai2;
                            System.out.printf("%d - %d = %d", nilai1, nilai2, hasil);
                            System.out.println("\n");
                            break;
                        case "*":
                            hasil = nilai1 * nilai2;
                            System.out.printf("%d * %d = %d", nilai1, nilai2, hasil);
                            System.out.println("\n");
                            break;
                        case "/":
                            if (nilai2 != 0){
                                hasil = nilai1 / nilai2;
                                System.out.printf("%d / %d = %d", nilai1, nilai2, hasil);
                            } else {
                                System.out.println("Tidak dapat melakukan operasi pembagian dengan nilai 0, silahkan ulangi lagi");
                            }
                            System.out.println("\n");
                            break;
                        default:
                            System.out.println("Operator tidak sesuai!, silahkan coba Lagi");
                            System.out.print("\n");
                    }

                } else if (pilihAngka != 1){
                    System.out.print("\n");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Maaf pilihan yang anda masukkan salah, silahkan ulangi lagi");
                    System.out.print("\n");
                }
        }

    }
}
