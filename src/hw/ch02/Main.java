package hw.ch02;

public class Main {
    public static void main(String[] args) {
        // 1. 한국 콘센트 객체 생성 (Banner 대신 KoreanOutlet 사용) 
        KoreanOutlet outlet = new KoreanOutlet();
        
        // 2. 어댑터 생성 및 콘센트 연결 (PrintBanner가 KoreanOutlet을 인자로 받음) 
        Print adapter = new PrintBanner(outlet);
        
        // 3. 스마트폰에 어댑터 전달 
        Smartphone myPhone = new Smartphone(adapter);
        
        // 4. 충전 실행 (결과 확인) 
        System.out.println("스마트폰 충전을 시도합니다.");
        myPhone.charge(); 
    }
}