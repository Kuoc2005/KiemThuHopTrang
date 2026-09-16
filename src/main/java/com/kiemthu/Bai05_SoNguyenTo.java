package com.kiemthu;

public class Bai05_SoNguyenTo {
    public static boolean laSoNguyenTo(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n phai la so nguyen duong.");
        }
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}