package hw.ch12;

public class NumberedBorder extends Border {
    public NumberedBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        // 내용물 폭 + 행번호 영역(4글자)
        return 4 + display.getColumns();
    }

    @Override
    public int getRows() {
        // 행수는 내용물과 동일
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // row는 0부터 시작하므로 표시할 때는 row + 1을 사용
        // %2d를 통해 2자리 숫자를 확보하고 뒤에 " | "를 붙임
        return String.format("%2d | ", row + 1) + display.getRowText(row);
    }
}