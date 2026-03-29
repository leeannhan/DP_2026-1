package hw.ch03;

public class CharDisplay extends AbstractDisplay {
    private char ch;

    // 기본 테스트용 생성자 (기본 5회) 
    public CharDisplay(char ch) {
        super(); 
        this.ch = ch;
    }

    // [Step 1] 반복 횟수 제어용 생성자 
    public CharDisplay(char ch, int repeatCount) {
        super(repeatCount); 
        this.ch = ch;
    }

    @Override
    public void open() { System.out.print("<<"); }

    @Override
    public void print() { System.out.print(ch); }

    @Override
    public void close() { System.out.println(">>"); }
}