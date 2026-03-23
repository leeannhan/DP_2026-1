package hw.ch01;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfYearIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfYearIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength() - 1; // 마지막(1997년)부터 시작
    }

    public boolean hasNext() { return index >= 0; }

    public Book next() {
        if (!hasNext()) throw new NoSuchElementException();
        return bookShelf.getBookAt(index--); // 뒤에서 앞으로 이동
    }
}