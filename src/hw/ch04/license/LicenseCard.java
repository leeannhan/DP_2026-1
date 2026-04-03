package hw.ch04.license;

import hw.ch04.framework.Product;

public class LicenseCard extends Product {
    private String holder;        // 운전자명 [cite: 57]
    private int licenseNumber;    // 면허번호 [cite: 58]
    private String issuedDate;     // 발급 날짜 [cite: 59]
    private String expiryDate;     // 만료 날짜 [cite: 60]

    public LicenseCard(String holder, int licenseNumber, String issuedDate, String expiryDate) {
        System.out.println(holder + "의 운전면허증을 " + licenseNumber + " 번으로 만듭니다."); // [cite: 53]
        this.holder = holder;
        this.licenseNumber = licenseNumber;
        this.issuedDate = issuedDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public void use() {
        System.out.println(this.toString() + "을 사용합니다."); // [cite: 54]
    }

    @Override
    public String toString() { // 주어진 형식 준수 [cite: 64]
        return "[LicenseCard:" + holder + "(" + licenseNumber + ")] - 유효기간: " + issuedDate + "~" + expiryDate;
    }
}