package com.kiemthu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai08_TongGiaiThuaTest {

    // === ISSUE 1: LUỒNG HỢP LỆ (Tính giai thừa và tính tổng giai thừa) ===
    @Test
    void testTinhGiaiThua_HopLe() {
        // Phủ k = 0 (0! = 1)
        assertEquals(1, Bai08_TongGiaiThua.tinhGiaiThua(0));
        // Phủ k > 0 (4! = 24)
        assertEquals(24, Bai08_TongGiaiThua.tinhGiaiThua(4));
    }

    @Test
    void testTinhTongGiaiThua_HopLe() {
        // Phủ n = 1 (S = 1! = 1)
        assertEquals(1, Bai08_TongGiaiThua.tinhTongGiaiThua(1));
        // Phủ n = 3 (S = 1! + 2! + 3! = 1 + 2 + 6 = 9)
        assertEquals(9, Bai08_TongGiaiThua.tinhTongGiaiThua(3));
    }

    // === ISSUE 2: NHÁNH LỖI, BIÊN VÀ NGOẠI LỆ ===
    @Test
    void testTinhGiaiThua_NhanhKhongHopLe() {
        // Phủ nhánh k < 0
        assertThrows(IllegalArgumentException.class, () -> Bai08_TongGiaiThua.tinhGiaiThua(-1));
    }

    @Test
    void testTinhTongGiaiThua_NhanhKhongHopLe() {
        // Biên n = 0
        assertThrows(IllegalArgumentException.class, () -> Bai08_TongGiaiThua.tinhTongGiaiThua(0));
        // n âm (n < 0)
        assertThrows(IllegalArgumentException.class, () -> Bai08_TongGiaiThua.tinhTongGiaiThua(-5));
    }
}