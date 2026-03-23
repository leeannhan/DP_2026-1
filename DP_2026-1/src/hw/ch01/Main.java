package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10); 

        // 사진의 역순 출력을 위해 연도가 낮은 순서부터 입력
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
       

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
            // 소설 장르만 최신순으로 나오게 하려면 필터 조건 추가
            if (b.getGenre().equals("소설")) {
                System.out.println("제목: " + b.getName() + ", 장르: " + b.getGenre() + 
                                   ", 출판연도: " + b.getYear() + ", 가격: " + b.getPrice());
            }
        }
    }
}