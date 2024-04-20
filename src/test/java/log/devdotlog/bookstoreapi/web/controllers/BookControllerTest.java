package log.devdotlog.bookstoreapi.web.controllers;

import log.devdotlog.bookstoreapi.domain.order.Customer;
import log.devdotlog.bookstoreapi.domain.order.Purchase;
import log.devdotlog.bookstoreapi.domain.store.Author;
import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.domain.store.Publisher;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BookControllerTest {
    Author author;
    Set<Book> books;

    Publisher publisher;
    Purchase purchase;

    Customer customer;

    @BeforeEach
    void setUp() {
        books = new HashSet<>();

        Timestamp currentTimeStamp = new Timestamp(new Date().getTime());

        author = Author.authorBuilder()
                .name("Timothy")
                .surname("Adams")
                .books(new HashSet<>())
                .build();
        publisher = Publisher.publisherBuilder()
                .name("The Books Publisher")
                .books(new HashSet<>())
                .build();


        purchase = Purchase.purchaseBuilder()
                .price(BigDecimal.valueOf(343))
                .books(new HashSet<>())
                .orderDate(new Timestamp(new Date().getTime()))
                .build();
        books.add(Book.bookBuilder()
                .name("The Greater Beyond")
                .isbn("1234567890987")
                .pages(1001L)
                .author(author)
                .publisher(publisher)
                .publishDate(currentTimeStamp)
                .purchase(purchase)
                .build());
        Book book = Book.bookBuilder()
                .name("The Great Beyond")
                .isbn("1234567890987")
                .pages(1001L)
                .author(author)
                .publisher(publisher)
                .publishDate(currentTimeStamp)
                .purchase(Purchase.purchaseBuilder()
                        .price(BigDecimal.valueOf(300))
                        .build())
                .build();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addBook() {
    }

    @Test
    void getBookById() {
    }
}