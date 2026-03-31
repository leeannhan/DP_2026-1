package practice.ch05;

public enum Singleton2 {
    //상수
    INSTANCE;//클래스 로드 시 Singleton2 객체가 하나 만들어짐. 
    INSTANCE2;
    INSTANCE3;
    
    //메소드 
    public void hello() {
        System.out.println("싱글톤객체의 hello 메소드입니다");
    }
