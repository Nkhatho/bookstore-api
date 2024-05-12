package log.devdotlog.bookstoreapi.web.controllers;

import log.devdotlog.bookstoreapi.services.BookService;
import log.devdotlog.bookstoreapi.web.exceptions.BookNotFoundException;
import log.devdotlog.bookstoreapi.web.model.BookDTO;
import log.devdotlog.bookstoreapi.web.responsebody.BookDataResponseBody;
import log.devdotlog.bookstoreapi.web.responsebody.DataResponseBody;
import log.devdotlog.bookstoreapi.web.responsebody.Meta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.RequestContextFilter;

import java.util.Set;

@RestController
@RequestMapping("/v1/bookstore")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/books")
    public ResponseEntity addBook(@RequestBody BookDTO bookDTO) {
        DataResponseBody<BookDTO> bookData = new DataResponseBody<>();
        bookData.setData(bookService.persistBook(bookDTO));
        return new ResponseEntity<>(bookData, HttpStatus.CREATED);
    }

    @GetMapping("/books/{book_id}")
    public ResponseEntity getBookById(@PathVariable("book_id") Long id) {
        try{
            DataResponseBody<BookDTO> bookData = new DataResponseBody<>();
            bookData.setData(bookService.retrieveBookById(id));
            return ResponseEntity.ok(bookData);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }
}
