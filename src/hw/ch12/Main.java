package hw.ch12;

public class Main {
    public static void main(String[] args) {
        // 1. MultiStringDisplay 생성 및 문자열 추가
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Hello, Java!");
        md.add("Decorator Pattern");
        md.add("is powerful.");

        // [2-1] 원본 출력
        System.out.println("--- [2-1] 원본 출력 ---");
        md.show();
        System.out.println();

        // [2-2] NumberedBorder 단독 적용
        System.out.println("--- [2-2] NumberedBorder 단독 적용 ---");
        Display d1 = new NumberedBorder(md);
        d1.show();
        System.out.println();

        // [2-3] FullBorder + NumberedBorder 조합
        System.out.println("--- [2-3] FullBorder + NumberedBorder 조합 ---");
        Display d2 = new FullBorder(new NumberedBorder(md));
        d2.show();
        System.out.println();

        // [2-4] SideBorder + NumberedBorder + FullBorder 3단 중첩
        System.out.println("--- [2-4] SideBorder + NumberedBorder + FullBorder 3단 중첩 ---");
        // 과제 문서의 기대 출력 결과에 맞춘 중첩 순서입니다.
        Display d3 = new SideBorder(
            new NumberedBorder(
                new FullBorder(md)
            ), 
            '*'
        );
        d3.show();
    }
}