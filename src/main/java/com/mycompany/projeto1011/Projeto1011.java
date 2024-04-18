/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1011;

import java.util.Scanner;

public class Projeto1011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R;
        R = sc.nextDouble();
        double pi;
        pi = 3.14159;
        double VOLUME = (R * R * R) * pi * (4 / 3.0);
        System.out.printf("VOLUME = %.3f\n", VOLUME);
    }
}
