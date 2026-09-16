package com.kiemthu;

public class Bai06_TongChuoiDanDau {
    public static int tinhTong(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n phai la so nguyen duong.");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        return sum;
    }
}