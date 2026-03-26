package hw.ch01;

import java.util.Iterator;

public class BookShelfGenreIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private String genre;
    private int index;

    public BookShelfGenreIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while (index < bookShelf.getLength()) {
            Book book = bookShelf.getBookAt(index);
            if (book.getGenre().equals(genre)) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}