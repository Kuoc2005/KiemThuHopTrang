package com.kiemthu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai04_SoNgayTrongThangTest {

    // === ISSUE 1: LUỒNG HỢP LỆ (Các tháng 31 ngày, 30 ngày, tháng 2 năm nhuận và
    // không nhuận) ===
    @Test
    void testTinhSoNgay_Thang31Ngay() {
        assertEquals(31, Bai04_SoNgayTrongThang.tinhSoNgay(1, 2024));
        assertEquals(31, Bai04_SoNgayTrongThang.tinhSoNgay(12, 2024));
    }

    @Test
    void testTinhSoNgay_Thang30Ngay() {
        assertEquals(30, Bai04_SoNgayTrongThang.tinhSoNgay(4, 2024));
        assertEquals(30, Bai04_SoNgayTrongThang.tinhSoNgay(11, 2024));
    }

    @Test
    void testTinhSoNgay_Thang2NamNhuan() {
        // Phủ nhánh nam % 400 == 0
        assertEquals(29, Bai04_SoNgayTrongThang.tinhSoNgay(2, 2000));
        // Phủ nhánh nam % 4 == 0 và nam % 100 != 0
        assertEquals(29, Bai04_SoNgayTrongThang.tinhSoNgay(2, 2024));
    }

    @Test
    void testTinhSoNgay_Thang2NamKhongNhuan() {
        // Phủ nhánh nam % 4 != 0
        assertEquals(28, Bai04_SoNgayTrongThang.tinhSoNgay(2, 2023));
        // Phủ nhánh nam % 100 == 0 nhưng nam % 400 != 0 (thế kỷ không nhuận)
        assertEquals(28, Bai04_SoNgayTrongThang.tinhSoNgay(2, 1900));
    }

    // === ISSUE 2: NGOẠI LỆ VÀ ĐIỀU KIỆN BIÊN LỖI ===
    @Test
    void testTinhSoNgay_ThangKhongHopLe() {
        // Biên thang < 1
        assertThrows(IllegalArgumentException.class, () -> Bai04_SoNgayTrongThang.tinhSoNgay(0, 2024));
        // Biên thang > 12
        assertThrows(IllegalArgumentException.class, () -> Bai04_SoNgayTrongThang.tinhSoNgay(13, 2024));
    }

    @Test
    void testTinhSoNgay_NamKhongHopLe() {
        // Biên nam < 1
        assertThrows(IllegalArgumentException.class, () -> Bai04_SoNgayTrongThang.tinhSoNgay(5, 0));
        assertThrows(IllegalArgumentException.class, () -> Bai04_SoNgayTrongThang.tinhSoNgay(5, -100));
    }
}