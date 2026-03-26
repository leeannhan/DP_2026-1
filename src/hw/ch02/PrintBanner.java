package hw.ch02;

public class PrintBanner implements Print {
    private KoreanOutlet banner; // 위임(Composition) 방식 사용

    public PrintBanner(KoreanOutlet banner) {
        this.banner = banner;
    }

    @Override
    public int charge() {
        // provide()를 호출하여 전압을 가져옴
        return banner.provide(); 
    }
}
