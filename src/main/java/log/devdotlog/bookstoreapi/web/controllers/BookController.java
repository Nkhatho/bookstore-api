package log.devdotlog.bookstoreapi.web.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.repositories.BookRepository;
import log.devdotlog.bookstoreapi.services.BookService;
import log.devdotlog.bookstoreapi.web.model.BookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/v1/bookstore/books")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable("id") Long id) {
        JSONPObject j = new JSONPObject("id", id);
        System.out.println(j);
//        Optional<Book> book = bookService.findById(id);
        return null;
    }
}
