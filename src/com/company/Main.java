/*
 * Main
 *
 * Version info 1
 *
 * Zviertseva Nataliia,  NTU "KhPI"
 */
package com.company;
public class Main {

    public static void main(String[] args) {
double start =0;
double finish = Math.PI;
double deltaX = 0.1;
double area = 0.0;
double y = 0.5;
        for (double x = 0; x < finish; x+=deltaX) {
            double rectangle = 0;
            if (Math.sin(x) < y) {
                rectangle = Math.sin(x) * deltaX;
            } else {
                rectangle = y * deltaX;
            }

            area += rectangle;
        }
        System.out.println(area);
    }
}
