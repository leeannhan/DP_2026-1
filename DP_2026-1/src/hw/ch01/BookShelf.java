package hw.ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    // 추가된 메서드 1: 장르 필터용
    public Iterator<Book> iteratorByGenre(String genre) {
        return new BookShelfGenreIterator(this, genre);
    }

    // 추가된 메서드 2: 연도 역순용
    public Iterator<Book> iteratorByYear() {
        return new BookShelfYearIterator(this);
    }
}