package log.devdotlog.bookstoreapi.web.controllers;

import log.devdotlog.bookstoreapi.services.AuthorService;
import log.devdotlog.bookstoreapi.web.exceptions.AuthorNotFoundException;
import log.devdotlog.bookstoreapi.web.model.AuthorDTO;
import log.devdotlog.bookstoreapi.web.responsebody.AuthorDataResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bookstore")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/authors")
    public ResponseEntity<AuthorDataResponseBody> createAuthor(@RequestBody AuthorDTO authorDTO){
        AuthorDataResponseBody authorData = new AuthorDataResponseBody();
        authorData.setData(authorService.persistAuthor(authorDTO));
        return new ResponseEntity<>(authorData, HttpStatus.CREATED);
    }
}