package log.devdotlog.bookstoreapi.web.model;

import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.domain.store.Publisher;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookPublisherDTO {

    private Book book;
    private Publisher publisher;
    private Date publishedDate;
}
