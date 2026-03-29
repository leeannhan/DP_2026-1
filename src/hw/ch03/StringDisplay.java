package hw.ch03;

public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    // 기본 테스트용 생성자 (기본 5회) 
    public StringDisplay(String string) {
        super();
        this.string = string;
        this.width = string.length();
    }

    // [Step 1] 반복 횟수 제어용 생성자 
    public StringDisplay(String string, int repeatCount) {
        super(repeatCount);
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void open() { printLine(); }

    @Override
    public void print() { System.out.println("|" + string + "|"); }

    @Override
    public void close() { printLine(); }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) { System.out.print("-"); }
        System.out.println("+");
    }
}