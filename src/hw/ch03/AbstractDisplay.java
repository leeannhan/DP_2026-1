package hw.ch03;

public abstract class AbstractDisplay {
    protected int repeatCount; // [Step 1] 반복 횟수를 저장하는 필드 추가 

    // 기본 생성자: 반복 횟수를 명시하지 않으면 기본값 5 사용 
    public AbstractDisplay() { 
        this.repeatCount = 5; 
    } 

    // [Step 1] 생성자 확장: 생성자에서 반복 횟수를 인자로 받음 
    public AbstractDisplay(int repeatCount) { 
        this.repeatCount = repeatCount; 
    }

    public abstract void open();
    public abstract void print();
    public abstract void close();

    // Template Method: 알고리즘 구조 고정 
    public final void display() {
        open(); 
        for (int i = 0; i < repeatCount; i++) { // [Step 1] 필드값을 사용하여 반복 
            print(); 
        }
        close(); 
    }
}