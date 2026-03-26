package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // 책 10권을 담을 수 있는 책장 생성
        BookShelf bookShelf = new BookShelf(10); 

        // [데이터 입력] 리안님이 요청하신 순서대로 입력합니다.
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        
        // 나머지 예시 데이터들 (장르 구분을 위해 추가)
        bookShelf.appendBook(new Book("자바의 정석", "컴퓨터", 2020, 30000));
        bookShelf.appendBook(new Book("AI 입문", "컴퓨터", 2024, 25000));

        // 1. 소설 장르 책 목록 출력
        System.out.println("=== 소설 장르 책 목록 ===");
        Iterator<Book> genreIt = bookShelf.iteratorByGenre("소설");
        while (genreIt.hasNext()) {
            Book b = genreIt.next();
            System.out.println("제목: " + b.getName() + ", 장르: " + b.getGenre() + 
                               ", 출판연도: " + b.getYear() + ", 가격: " + b.getPrice());
        }

        // 2. 출판연도 역순 책 목록 (최신순)
        System.out.println("\n=== 출판연도 역순 책 목록 ===");
        Iterator<Book> yearIt = bookShelf.iteratorByYear();
        while (yearIt.hasNext()) {
            Book b = yearIt.next();
            // 소설 장르만 필터링하여 최신순 출력
            if (b.getGenre().equals("소설")) {
                System.out.println("제목: " + b.getName() + ", 장르: " + b.getGenre() + 
                                   ", 출판연도: " + b.getYear() + ", 가격: " + b.getPrice());
            }
        }
    }
}