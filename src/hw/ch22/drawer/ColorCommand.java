package hw.ch22.drawer;

import hw.ch22.command.Command;
import java.awt.Color;

public class ColorCommand implements Command {
    // 그리기 대상 
    protected Drawable drawable;
    // 변경할 색상
    private Color color;

    // 생성자
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }

    // 실행시 대상의 색상을 변경함
    @Override 
    public void execute() {
        drawable.setColor(color);
    }
    
}
