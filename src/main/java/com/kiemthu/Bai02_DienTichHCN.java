package com.kiemthu;

public class Bai02_DienTichHCN {
    public static double tinhDienTich(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Chieu dai va chieu rong phai lon hon 0.");
        }
        return a * b;
    }
}