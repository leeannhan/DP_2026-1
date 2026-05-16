package hw.ch17;

public class Main {
    public static void main(String[] args) {
        // [3-1] 0부터 30 미만까지 짝수를 생성하는 generator 생성
        NumberGenerator generator = new EvenNumberGenerator(0, 30);
        
        // [3-2] 세 개의 관찰자(Observer) 객체 생성
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new RangeObserver(); // 새로 추가한 범위 관찰자
        
        // [3-3] 생성기에 모든 관찰자 등록
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        
        // [3-4] 실행 및 실시간 자동 통보 확인
        generator.execute();
    }
}