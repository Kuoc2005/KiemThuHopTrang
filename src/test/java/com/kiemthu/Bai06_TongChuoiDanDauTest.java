package com.kiemthu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai06_TongChuoiDanDauTest {

    // === ISSUE 1: LUỒNG HỢP LỆ (Dãy số với n lẻ và n chẵn) ===
    @Test
    void testTinhTong_LuongHopLe() {
        // Phủ n = 1 (biên dương nhỏ nhất, vòng lặp chạy 1 lần)
        assertEquals(1, Bai06_TongChuoiDanDau.tinhTong(1));

        // Phủ n chẵn (n = 4: 1 - 2 + 3 - 4 = -2)
        assertEquals(-2, Bai06_TongChuoiDanDau.tinhTong(4));

        // Phủ n lẻ (n = 5: 1 - 2 + 3 - 4 + 5 = 3)
        assertEquals(3, Bai06_TongChuoiDanDau.tinhTong(5));
    }

    // === ISSUE 2: NHÁNH LỖI, BIÊN VÀ NGOẠI LỆ ===
    @Test
    void testTinhTong_NhanhKhongHopLe() {
        // Biên n = 0
        assertThrows(IllegalArgumentException.class, () -> Bai06_TongChuoiDanDau.tinhTong(0));

        // n âm
        assertThrows(IllegalArgumentException.class, () -> Bai06_TongChuoiDanDau.tinhTong(-5));
    }
}