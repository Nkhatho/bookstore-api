package log.devdotlog.bookstoreapi.web.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
//import log.devdotlog.bookstoreapi.domain.order.Purchase;
import log.devdotlog.bookstoreapi.domain.store.Author;
import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.domain.store.Publisher;
import log.devdotlog.bookstoreapi.repositories.BookRepository;
import log.devdotlog.bookstoreapi.services.BookService;
import log.devdotlog.bookstoreapi.web.exceptions.BookNotFoundException;
import log.devdotlog.bookstoreapi.web.model.BookDTO;
import org.hibernate.generator.internal.CurrentTimestampGeneration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/v1/bookstore/books")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/ ")
    public ResponseEntity<BookDTO> addBook(@RequestBody BookDTO bookDTO) {
        return new ResponseEntity<>(bookService.persistBook(bookDTO), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<Set<BookDTO>> getAllBooks() {
        return ResponseEntity.ok(bookService.retrieveAllBooks());
    }

    @GetMapping("/{book_id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable("book_id") Long id) {
        try{
            return ResponseEntity.ok(bookService.retrieveBookById(id));
        } catch (BookNotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }
}
