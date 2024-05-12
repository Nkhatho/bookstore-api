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
public class DataResponseBody<T> {
    private T data;
    private Links links;
    private Meta meta;
}
