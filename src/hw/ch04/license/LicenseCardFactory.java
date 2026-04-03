package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100; // 100부터 시작 [cite: 69]
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate; // [cite: 72]
    }

    @Override
    protected Product createProduct(String owner) {
        // 예시로 만료일은 발급일로부터 5년 후로 설정 (문자열 처리) [cite: 73]
        String expiryDate = baseDate.replace("2026", "2031"); 
        return new LicenseCard(owner, ++licenseCounter, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다."); // [cite: 74]
    }
}