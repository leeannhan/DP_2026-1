package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int start;
    private int end;
    private int number;

    // 생성자 정의: 시작값과 종료값 설정
    public EvenNumberGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // 현재 생성된 수를 취득함
    @Override
    public int getNumber() {
        return number;
    }

    // start부터 end 미만까지 짝수만 순서대로 생성하며 통보
    @Override
    public void execute() {
        for (int i = start; i < end; i += 2) {
            number = i;
            notifyObservers(); // 값이 변경될 때마다 등록된 관찰자들에게 알림
        }
    }
}