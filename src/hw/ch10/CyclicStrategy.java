package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int lastHandValue = -1;

    @Override
    public Hand nextHand() {
        // (현재 값 + 1) % 3 연산을 통해 0 -> 1 -> 2 -> 0 순으로 무한 반복합니다.
        lastHandValue = (lastHandValue + 1) % 3;
        return Hand.getHand(lastHandValue);
    }

    @Override
    public void study(boolean win) {
        // CyclicStrategy는 승패에 따라 전략을 바꾸지 않으므로 구현하지 않습니다
    }
}