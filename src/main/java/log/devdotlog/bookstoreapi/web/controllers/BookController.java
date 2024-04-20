package log.devdotlog.bookstoreapi.web.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import log.devdotlog.bookstoreapi.domain.order.Purchase;
import log.devdotlog.bookstoreapi.domain.store.Author;
import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.domain.store.Publisher;
import log.devdotlog.bookstoreapi.repositories.BookRepository;
import log.devdotlog.bookstoreapi.services.BookService;
import log.devdotlog.bookstoreapi.web.model.BookDTO;
import org.hibernate.generator.internal.CurrentTimestampGeneration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
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
        Book book = Book.bookBuilder()
                .name("The Great Beyond")
                .isbn("1234567890987")
                .pages(1001L)
                .author(Author.authorBuilder()
                        .name("Timothy")
                        .surname("Adams")
                        .build())
                .publisher(Publisher.publisherBuilder()
                        .name("The Books Publisher ")
                        .build())
                .publishDate(new Timestamp(new Date().getTime()))
                .purchase(Purchase.purchaseBuilder()
                        .price(BigDecimal.valueOf(300))
                        .build())
                .build();
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
