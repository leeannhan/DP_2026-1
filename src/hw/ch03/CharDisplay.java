package hw.ch03;

public class CharDisplay extends AbstractDisplay {
    private char ch;

    // 기존 호환성을 위한 생성자 (기본값 5회 사용)
    public CharDisplay(char ch) {
        super(); // AbstractDisplay() 호출
        this.ch = ch;
    }

    // [Step 1] 반복 횟수를 인자로 받는 생성자 추가
    public CharDisplay(char ch, int repeatCount) {
        super(repeatCount); // AbstractDisplay(int repeatCount) 호출 [cite: 28]
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<"); 
    }

    @Override
    public void print() {
        System.out.print(ch);

    @Override
    public void close() {
        System.out.println(">>"); 
    }
}