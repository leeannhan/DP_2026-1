package hw.ch16;

import java.awt.Color;
import java.awt.Label;

public class ColleagueLabel extends Label implements Colleague {
    private Mediator mediator;

    public ColleagueLabel(String text) {
        super(text);
    }

    // Mediator를 설정한다
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator의 지시에 따라 상태(텍스트, 색상)를 동적으로 변경한다
    @Override
    public void setColleagueEnabled(boolean enabled) {
        if (enabled) {
            setText(" 로그인 가능");
            setForeground(Color.blue);
        } else {
            setText(" 로그인 불가");
            setForeground(Color.gray);
        }
    }
}