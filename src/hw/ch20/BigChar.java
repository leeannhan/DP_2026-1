package hw.ch20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    private char charname;
    private String fontdata;
    
    // ANSI 색상 리셋 상수
    private static final String RESET = "\u001B[0m";

    public BigChar(char charname) {
        this.charname = charname;
        try {
            // [수정 구간]
            String filename = "src/hw/ch20/big" + charname + ".txt";
            
            StringBuilder sb = new StringBuilder();
            for (String line: Files.readAllLines(Path.of(filename))) {
                sb.append(line);
                sb.append("\n");
            }
            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    // 기존 print() 메서드
    public void print() {
        System.out.print(fontdata);
    }

    // 외재 상태인 색상 코드를 받아 출력하는 오버로드
    public void print(String colorCode) {
        System.out.print(colorCode + fontdata + RESET);
    }
}