package hw.ch04.idcard;

import hw.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;         // 시리얼 번호 
    private String issuedDate;  // 발급 날짜 추가 (YYYY-MM-DD) 

    // 생성자 수정 
    IDCard(String owner, int serial, String issuedDate) {
        System.out.println(owner + "의 카드를 " + serial + "번으로 만듭니다.");
        this.owner = owner;
        this.serial = serial;
        this.issuedDate = issuedDate;
    }

    @Override
    public void use() {
        System.out.println(this.toString() + "을 사용합니다.");
    }

    @Override
    public String toString() { // 발급 날짜 포함하여 출력하도록 수정 
        return "[IDCard:" + owner + " (" + serial + ")] - 발급날짜: " + issuedDate;
    }

    public String getOwner() { return owner; }
    public int getSerial() { return serial; }
    public String getIssuedDate() { return issuedDate; } 
}