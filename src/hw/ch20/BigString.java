package hw.ch20;

public class BigString {
    private BigChar[] bigchars;

    public BigString(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigchars = new BigChar[string.length()];
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 기존 print() 메서드는 그대로 유지
    public void print() {
        for (BigChar bc: bigchars) {
            bc.print();
        }
    }

    //  각 글자에 맞는 색상 배열을 받아 오버로드 출력 구현
    public void print(String[] colors) {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print(colors[i]);
        }
    }
}
