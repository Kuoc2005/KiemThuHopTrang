package com.kiemthu;

public class Bai03_PhuongTrinhBac2 {
    public static String giaiPhuongTrinh(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Phuong trinh vo so nghiem";
                } else {
                    return "Phuong trinh vo nghiem";
                }
            } else {
                double x = -c / b;
                if (x == -0.0)
                    x = 0.0;
                return String.format("Phuong trinh co 1 nghiem x = %.2f", x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                return "Phuong trinh vo nghiem";
            } else if (delta == 0) {
                double x = -b / (2 * a);
                if (x == -0.0)
                    x = 0.0;
                return String.format("Phuong trinh co nghiem kep x = %.2f", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return String.format("Phuong trinh co 2 nghiem x1 = %.2f, x2 = %.2f", x1, x2);
            }
        }
    }
}