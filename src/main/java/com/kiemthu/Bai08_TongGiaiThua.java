package com.kiemthu;

public class Bai08_TongGiaiThua {
    // Hàm phụ tính giai thừa của k
    public static long tinhGiaiThua(int k) {
        if (k < 0) {
            throw new IllegalArgumentException("k phai la so khong am.");
        }
        long fact = 1;
        for (int i = 1; i <= k; i++) {
            fact *= i;
        }
        return fact;
    }

    // Hàm chính tính tổng S = 1! + 2! + ... + n!
    public static long tinhTongGiaiThua(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n phai la so nguyen duong.");
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += tinhGiaiThua(i);
        }
        return sum;
    }
}