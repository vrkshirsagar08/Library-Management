package com.project.library.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.library.Entity.Book;
import com.project.library.Repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
    
    @Autowired
     private BookRepository bookRepository;

    public Book addBook(Book book) {
        book.setAvailable(true); 
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
    public Optional<Book> getBookById(Integer id) {
        return bookRepository.findById(id);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

    public Book updateAvailability(Integer id, Boolean available) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found " + id));
        book.setAvailable(available);
        return bookRepository.save(book);
    }
}
