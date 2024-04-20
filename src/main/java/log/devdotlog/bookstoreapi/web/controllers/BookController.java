package log.devdotlog.bookstoreapi.web.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.repositories.BookRepository;
import log.devdotlog.bookstoreapi.services.BookService;
import log.devdotlog.bookstoreapi.web.model.BookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/bookstore/books")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/ ")
    public ResponseEntity<BookDTO> addBook(@RequestBody BookDTO bookDTO) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable("id") Long id) {
        JSONPObject j = new JSONPObject("id", id);
        System.out.println(j);
//        Optional<Book> book = bookService.findById(id);
        return null;
    }
}
