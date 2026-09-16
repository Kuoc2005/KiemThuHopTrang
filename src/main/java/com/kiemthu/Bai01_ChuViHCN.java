package com.kiemthu;

public class Bai01_ChuViHCN {
    public static double tinhChuVi(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Chieu dai va chieu rong phai lon hon 0.");
        }
        return 2 * (a + b);
    }
}