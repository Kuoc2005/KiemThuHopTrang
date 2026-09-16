package com.kiemthu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai02_DienTichHCNTest {

    // === LUỒNG HỢP LỆ (Phủ nhánh a > 0 và b > 0) ===
    @Test
    void testTinhDienTich_LuongHopLe() {
        assertEquals(15.0, Bai02_DienTichHCN.tinhDienTich(5, 3), 0.001);
        assertEquals(1.0, Bai02_DienTichHCN.tinhDienTich(1, 1), 0.001);
    }

    // === NHÁNH LỖI VÀ NGOẠI LỆ (Phủ các nhánh a <= 0 hoặc b <= 0) ===
    @Test
    void testTinhDienTich_NhanhChieuDaiKhongHopLe() {
        assertThrows(IllegalArgumentException.class, () -> Bai02_DienTichHCN.tinhDienTich(0, 5));
        assertThrows(IllegalArgumentException.class, () -> Bai02_DienTichHCN.tinhDienTich(-1, 5));
    }

    @Test
    void testTinhDienTich_NhanhChieuRongKhongHopLe() {
        assertThrows(IllegalArgumentException.class, () -> Bai02_DienTichHCN.tinhDienTich(5, 0));
        assertThrows(IllegalArgumentException.class, () -> Bai02_DienTichHCN.tinhDienTich(5, -2));
    }
}