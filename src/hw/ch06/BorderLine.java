package hw.ch06;

// 반드시 기존 프레임워크의 Product를 가져와야 합니다.
import hw.ch06.framework.Product;

public class BorderLine implements Product {
    private char borderChar;

    public BorderLine(char borderChar) {
        this.borderChar = borderChar;
    }

    @Override
    public void use(String s) {
        int length = s.length(); 
        
        // 위쪽 라인 출력 [
        for (int i = 0; i < length; i++) {
            System.out.print(borderChar);
        }
        System.out.println();

        // 본문 출력 
        System.out.println(s);

        // 아래쪽 라인 출력 
        for (int i = 0; i < length; i++) {
            System.out.print(borderChar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone(); 
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}