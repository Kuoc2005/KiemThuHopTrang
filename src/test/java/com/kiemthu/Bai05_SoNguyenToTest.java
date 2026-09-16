package com.kiemthu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai05_SoNguyenToTest {

    // === ISSUE 1: LUỒNG HỢP LỆ (Các số nguyên tố và hợp số) ===
    @Test
    void testLaSoNguyenTo_LaSoNguyenTo() {
        // Phủ n = 2 (số nguyên tố nhỏ nhất, vòng lặp không chạy)
        assertTrue(Bai05_SoNguyenTo.laSoNguyenTo(2));
        // Phủ n = 7 (số nguyên tố, vòng lặp lặp nhiều lần và trả về true)
        assertTrue(Bai05_SoNguyenTo.laSoNguyenTo(7));
    }

    @Test
    void testLaSoNguyenTo_KhongPhaiSoNguyenTo() {
        // Phủ n = 1 (trường hợp đặc biệt, trả về false)
        assertFalse(Bai05_SoNguyenTo.laSoNguyenTo(1));
        // Phủ n = 9 (hợp số, vòng lặp thỏa điều kiện chia hết và trả về false)
        assertFalse(Bai05_SoNguyenTo.laSoNguyenTo(9));
    }

    // === ISSUE 2: NHÁNH LỖI, ĐIỀU KIỆN BIÊN VÀ NGOẠI LỆ ===
    @Test
    void testLaSoNguyenTo_NhanhKhongHopLe() {
        // Biên n = 0
        assertThrows(IllegalArgumentException.class, () -> Bai05_SoNguyenTo.laSoNguyenTo(0));
        // Số âm n < 0
        assertThrows(IllegalArgumentException.class, () -> Bai05_SoNguyenTo.laSoNguyenTo(-5));
    }
}