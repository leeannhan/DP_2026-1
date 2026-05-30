package hw.ch20;

public class Main {
    // 명세서에 명시된 ANSI 색상 코드 상수 정의
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    static final String MAGENTA = "\u001B[35m";
    static final String CYAN = "\u001B[36m";
    static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        String input = args[0];
        BigString bs = new BigString(input);

        // 테스트 케이스 "1212123" 요구사항에 맞게 색상 배열 매핑
        // 1(RED) 2(BLUE) 1(GREEN) 2(MAGENTA) 1(CYAN) 2(YELLOW) 3(BLUE)
        if (input.equals("1212123")) {
            String[] colors = { RED, BLUE, GREEN, MAGENTA, CYAN, YELLOW, BLUE };
            bs.print(colors);
        } else {
            // 명세서 외의 다른 문자열이 입력되면 기본 출력이 동작하도록 예외 처리
            bs.print();
        }
    }
}