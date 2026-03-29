package hw.ch03;

public class Main {
    public static void main(String[] args) {
        // [3-1] 기본 테스트: 기존 코드 호환성 확인 (기본 5회) [cite: 890, 891]
        System.out.println("--- [3-1] 기본 테스트 ---");
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello");
        d1.display();
        d2.display();
        System.out.println();

        // [3-2] Step 1 테스트: 반복 횟수 제어 확인 [cite: 897]
        System.out.println("--- [3-2] 반복 횟수 제어 테스트 ---");
        AbstractDisplay d3 = new CharDisplay('X', 3); 
        AbstractDisplay d4 = new StringDisplay("Test", 7); 
        d3.display();
        d4.display();
        System.out.println();

        // [3-3] Step 2 테스트: 새로운 NumberDisplay 확인 [cite: 902]
        System.out.println("--- [3-3] NumberDisplay 테스트 ---");
        AbstractDisplay num = new NumberDisplay(42, 4); // 42를 4회 반복 [cite: 904]
        num.display();
    }
}