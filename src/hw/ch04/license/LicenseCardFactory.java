package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import java.time.LocalDate; // 날짜 계산을 위해 추가

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100; // 면허번호 100부터 시작 
    private String baseDate;          // 발급 기준 날짜 

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate; 
    }

    @Override
    protected Product createProduct(String owner) {
        // 1. 문자열로 된 baseDate를 날짜 객체로 변환
        LocalDate issued = LocalDate.parse(this.baseDate);
        
        // 2. 5년 뒤를 계산하고, 그 날의 하루 전날(-1일)을 만료일로 설정
        LocalDate expiry = issued.plusYears(5).minusDays(1);
        
        String expiryDate = expiry.toString(); // "2031-03-19" 형태로 변환
        
        // 3. LicenseCard 생성 (번호 증가) 
        return new LicenseCard(owner, ++licenseCounter, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        // 등록 메시지 출력 요구사항 
        System.out.println(product + "을 등록했습니다.");
    }
}