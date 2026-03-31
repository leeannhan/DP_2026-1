package practice.ch05;


 //싱글톤 패턴 적용하기
public class Singleton {
    //(3) Singleton 객체를 미리 하나 만들어 둠.
    private static Singleton singleton = new Singleton();
    //반드시 static으로 선언해야 함. 그래야 클래스가 메모리에 올라갈 때 singleton 객체도 같이 만들어짐.

    //(1) 생성자를 private으로 함.
    private Singleton() {
    }

    //(2) Singleton 객체를 얻어갈 수 있는 메소드를 정의함
    public static Singleton getInstance() {
        return new Singleton();
    }

}
