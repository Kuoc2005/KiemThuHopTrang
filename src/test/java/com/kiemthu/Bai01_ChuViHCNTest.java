package com.kiemthu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai01_ChuViHCNTest {

    // === ISSUE 1: KIỂM THỬ LUỒNG XỬ LÝ HỢP LỆ (HAPPY PATH) ===
    @Test
    void testTinhChuVi_LuongHopLe() {
        // Phủ nhánh a > 0 và b > 0
        assertEquals(16.0, Bai01_ChuViHCN.tinhChuVi(5, 3), 0.001);
        assertEquals(4.0, Bai01_ChuViHCN.tinhChuVi(1, 1), 0.001);
    }

    // === ISSUE 2: KIỂM THỬ CÁC NHÁNH LỖI VÀ BIÊN ===
    @Test
    void testTinhChuVi_NhanhChieuDaiKhongHopLe() {
        // Phủ nhánh a <= 0 (a = 0)
        assertThrows(IllegalArgumentException.class, () -> Bai01_ChuViHCN.tinhChuVi(0, 5));

        // Phủ nhánh a <= 0 (a < 0)
        assertThrows(IllegalArgumentException.class, () -> Bai01_ChuViHCN.tinhChuVi(-1, 5));
    }

    @Test
    void testTinhChuVi_NhanhChieuRongKhongHopLe() {
        // Phủ nhánh b <= 0 (b = 0)
        assertThrows(IllegalArgumentException.class, () -> Bai01_ChuViHCN.tinhChuVi(5, 0));

        // Phủ nhánh b <= 0 (b < 0)
        assertThrows(IllegalArgumentException.class, () -> Bai01_ChuViHCN.tinhChuVi(5, -2));
    }
}