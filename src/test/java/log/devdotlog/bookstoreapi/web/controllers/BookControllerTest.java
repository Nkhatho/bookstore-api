package log.devdotlog.bookstoreapi.web.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import log.devdotlog.bookstoreapi.domain.order.*;
import log.devdotlog.bookstoreapi.domain.store.Author;
import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.domain.store.BookPublisher;
import log.devdotlog.bookstoreapi.domain.store.Publisher;
import log.devdotlog.bookstoreapi.services.BookService;
import log.devdotlog.bookstoreapi.web.model.BookDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
@WebMvcTest(BookController.class)
class BookControllerTest {
    Set<Author> authors = new HashSet<>();
    Set<Book> books = new HashSet<>();
    Set<BookPublisher> bookPublishers = new HashSet<>();

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    BookService bookService;

    Timestamp currentTimeStamp;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(new BookController(bookService)).build();
        books = new HashSet<>();

        currentTimeStamp = new Timestamp(new Date().getTime());

        authors.add(Author.authorBuilder()
                .name("Timothy")
                .surname("Adams")
//                .books(new HashSet<>())
                .build());
        bookPublishers.add(BookPublisher.bookPublisherBuilder()
                .publishedDate(new Date())
                //.books(new HashSet<>())
                        .build());

        books.add(Book.bookBuilder()
                .name("The Greater Beyond")
                .isbn("1234567890987")
                .pages(1001L)
                .authors(authors)
                .bookPublishers(bookPublishers)
                .publishDate(currentTimeStamp)
                .build());
    }

    @Test
    void addBook() {
    }
    @Test
    void addBookTest() throws Exception {
        Long id = 1L;
        BookDTO bookDTO = BookDTO.builder()
                .id(id)
                .name("The Greater Beyond")
                .isbn("1234567890987")
                .pages(1001L)
                .authors(authors)
                .bookPublishers(bookPublishers)
                .publishDate(currentTimeStamp)
                .build();
        given(bookService.persistBook(bookDTO)).willReturn(bookDTO);
        String json = objectMapper.writeValueAsString(bookDTO);
        mockMvc.perform(post("/v1/bookstore/books/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1))
                .andDo(print());

    }

    @Test
    void getBookById() throws Exception {
        Long id = 1L;
        BookDTO bookDTO = BookDTO.builder()
                .id(id)
                .name("The Greater Beyond")
                .isbn("1234567890987")
                .pages(1001L)
                .authors(authors)
                .bookPublishers(bookPublishers)
                .publishDate(currentTimeStamp)
                .build();

        given(bookService.retrieveBookById(id)).willReturn(bookDTO);

        mockMvc.perform(get("/v1/bookstore/books/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andDo(print());
//        .andExpect(jsonPath("$.name").value("The Greater Beyond"))


    }
}