package hw.ch19;

public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        // [수정 구간] 17시부터 20시 전까지는 ClosingState로 전환되도록 설정합니다.
        if (hour < 9 || 20 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (17 <= hour && hour < 20) {
            context.changeState(ClosingState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용(주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}