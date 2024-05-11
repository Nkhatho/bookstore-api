package log.devdotlog.bookstoreapi.web.responsebody;

import log.devdotlog.bookstoreapi.web.model.AuthorDTO;
import log.devdotlog.bookstoreapi.web.model.BookDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorDataResponseBody {
    private AuthorDTO data;
    private Links links;
    private Meta meta;
}
