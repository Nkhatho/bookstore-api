package log.devdotlog.bookstoreapi.domain.store;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.common.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Entity
@Data
@Table(name = "book_publisher")
public class BookPublisher extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "book_id")
    @JsonIgnoreProperties("bookPublishers")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    @JsonIgnoreProperties("bookPublishers")
    private Publisher publisher;

    private Date publishedDate;

    @Builder(builderMethodName = "bookPublisherBuilder")
    public BookPublisher(Long id, Book book, Publisher publisher, Date publishedDate) {
        super(id);
        this.book = book;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
    }
}