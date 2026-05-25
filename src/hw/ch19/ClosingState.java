package hw.ch19;

public class ClosingState implements State {
    // 1. 싱글톤 패턴 적용
    private static ClosingState singleton = new ClosingState();

    private ClosingState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        // hour < 17 이면 DayState로 전환
        if (hour < 17) {
            context.changeState(DayState.getInstance());
        } 
        // 20 <= hour 이면 NightState로 전환
        else if (20 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        // 경비 센터에 마감 금고 점검을 통보 (출력 양식: call! 마감 금고 점검)
        context.callSecurityCenter("마감 금고 점검");
    }

    @Override
    public void doAlarm(Context context) {
        // 경비 센터에 비상벨을 보고하고 UrgentState로 전환 (UrgentState는 과제 문서 기준 싱글톤)
        context.callSecurityCenter("비상벨(마감)");
        context.changeState(UrgentState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        // 퇴근 확인 통화를 기록 (출력 양식: record ... 퇴근 확인 통화(마감))
        context.recordLog("퇴근 확인 통화(마감)");
    }

    @Override
    public String toString() {
        return "[마감]";
    }
}
