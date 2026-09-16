package com.kiemthu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai03_PhuongTrinhBac2Test {

    // === ISSUE 1: KIỂM THỬ LUỒNG HỢP LỆ (Phương trình bậc 2 có nghiệm) ===
    @Test
    void testGiaiPhuongTrinh_HaiNghiemPhanBiet() {
        // Phủ nhánh a != 0 và delta > 0
        assertEquals("Phuong trinh co 2 nghiem x1 = 2.00, x2 = 1.00",
                Bai03_PhuongTrinhBac2.giaiPhuongTrinh(1, -3, 2));
    }

    @Test
    void testGiaiPhuongTrinh_NghiemKep() {
        // Phủ nhánh a != 0 và delta == 0
        assertEquals("Phuong trinh co nghiem kep x = 1.00",
                Bai03_PhuongTrinhBac2.giaiPhuongTrinh(1, -2, 1));
    }

    // === ISSUE 2: KIỂM THỬ CÁC NHÁNH ĐIỀU KIỆN LỖI, BIÊN VÀ ĐƯỜNG ĐỊ RẼ NHÁNH ===
    @Test
    void testGiaiPhuongTrinh_DeltaAm() {
        // Phủ nhánh a != 0 và delta < 0
        assertEquals("Phuong trinh vo nghiem",
                Bai03_PhuongTrinhBac2.giaiPhuongTrinh(1, 0, 1));
    }

    @Test
    void testGiaiPhuongTrinh_ABangKhong_BBacNhat() {
        // Phủ nhánh a == 0, b != 0 (Phương trình bậc 1)
        assertEquals("Phuong trinh co 1 nghiem x = 2.00",
                Bai03_PhuongTrinhBac2.giaiPhuongTrinh(0, 2, -4));
    }

    @Test
    void testGiaiPhuongTrinh_ABangKhong_BBangKhong_CBangKhong() {
        // Phủ nhánh a == 0, b == 0, c == 0
        assertEquals("Phuong trinh vo so nghiem",
                Bai03_PhuongTrinhBac2.giaiPhuongTrinh(0, 0, 0));
    }

    @Test
    void testGiaiPhuongTrinh_ABangKhong_BBangKhong_CKhacKhong() {
        // Phủ nhánh a == 0, b == 0, c != 0
        assertEquals("Phuong trinh vo nghiem",
                Bai03_PhuongTrinhBac2.giaiPhuongTrinh(0, 0, 5));
    }
}