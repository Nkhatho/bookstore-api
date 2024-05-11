package log.devdotlog.bookstoreapi.web.responsebody;

import log.devdotlog.bookstoreapi.web.model.BookDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDataResponseBody {
    private BookDTO data;
    private Links links;
    private Meta meta;
}
