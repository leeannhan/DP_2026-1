package hw.ch04;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;
import hw.ch04.license.LicenseCardFactory;

public class Main {
    public static void main(String[] args) {
        // [3-1] Step 1 테스트: IDCard 정보 확장 [cite: 81]
        System.out.println("--- IDCard Test ---");
        Factory factory1 = new IDCardFactory("2026-01-15"); // [cite: 84]
        Product card1 = factory1.create("Kim Youngjin");
        Product card2 = factory1.create("Son Heungmin");
        card1.use(); // [cite: 87]
        card2.use();

        System.out.println();

        // [3-2] Step 2 테스트: 새로운 카드 타입 (LicenseCard) [cite: 89]
        System.out.println("--- LicenseCard Test ---");
        Factory factory2 = new LicenseCardFactory("2026-03-20"); // [cite: 92]
        Product license1 = factory2.create("Park Jisung");
        Product license2 = factory2.create("Lee Min-jae");
        license1.use(); // [cite: 95]
        license2.use();
    }
}