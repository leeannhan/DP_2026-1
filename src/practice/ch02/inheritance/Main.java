package practice.ch02.inheritance;

import ch02.Sample1.Banner;

//이미 존재하는 클래스, vendor클래스, 강아지(멍멍()제공), 수정할 수 없음
public class Main {
    public static void main(String[] args) {
        Banner banner = new Banner("Hello, World!");
        banner.showWithParen();
        banner.showWithAster();
    }
}
