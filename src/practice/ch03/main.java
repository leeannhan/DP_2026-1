package practice.ch03;

public class main {
    public static void main(String[] args) {
        //CharDisplay d1 = new CharDisplay('H'); //'H', "H" 
        AbstractDisplay d1 = new CharDisplay('H'); //추상 클래스도 참조 변수로 사용할 수 있다
        d1.display();
        d1.open();

        //StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
       d2.display();
    }
    
}
