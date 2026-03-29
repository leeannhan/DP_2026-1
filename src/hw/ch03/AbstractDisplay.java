package hw.ch03;

public abstract class AbstractDisplay {
    protected int repeatCount; // [Step 1] 필드 추가 

    public AbstractDisplay() { this.repeatCount = 5; } // 기본값 5 
    public AbstractDisplay(int repeatCount) { this.repeatCount = repeatCount; } //  생성자 추가

    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) { // [Step 1] 필드 사용 
            print();
        }
        close();
    }
}