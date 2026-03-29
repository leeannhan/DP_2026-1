package hw.ch03;

public class NumberDisplay extends AbstractDisplay {
    private int number;

    // 숫자를 n회 반복해서 출력하는 생성자 [cite: 876]
    public NumberDisplay(int number, int repeatCount) {
        super(repeatCount);
        this.number = number;
    }

    @Override
    public void open() { 
        System.out.println("<<Number>>"); // [cite: 885]
    }

    @Override
    public void print() { 
        System.out.println(number); // [cite: 887]
    }

    @Override
    public void close() { 
        System.out.println("<<Number>>"); // [cite: 888]
    }
}