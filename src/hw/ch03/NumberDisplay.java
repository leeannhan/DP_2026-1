package hw.ch03;

public class NumberDisplay extends AbstractDisplay {
    private int number;

    // [Step 2] 숫자와 반복 횟수를 받는 생성자 
    public NumberDisplay(int number, int repeatCount) {
        super(repeatCount);
        this.number = number;
    }

    @Override
    public void open() { 
        System.out.println("<<Number>>"); 
    }

    @Override
    public void print() { 
        System.out.println(number); // 숫자를 한 줄에 하나씩 출력 
    }

    @Override
    public void close() { 
        System.out.println("<<Number>>"); 
    }
}