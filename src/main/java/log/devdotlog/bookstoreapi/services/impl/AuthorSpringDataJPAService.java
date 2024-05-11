package log.devdotlog.bookstoreapi.services.impl;

import log.devdotlog.bookstoreapi.domain.builders.DTOBuilder;
import log.devdotlog.bookstoreapi.domain.builders.EntityBuilder;
import log.devdotlog.bookstoreapi.domain.store.Author;
import log.devdotlog.bookstoreapi.repositories.AuthorRepository;
import log.devdotlog.bookstoreapi.services.AuthorService;
import log.devdotlog.bookstoreapi.web.exceptions.AuthorNotFoundException;
import log.devdotlog.bookstoreapi.web.model.AuthorDTO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthorSpringDataJPAService implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorSpringDataJPAService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Set<AuthorDTO> retrieveAllAuthors() {
        return new HashSet<>((Collection) authorRepository.findAll());
    }

    @Override
    public AuthorDTO retrieveAuthorById(Long id) throws AuthorNotFoundException {
        Optional<Author> author = authorRepository.findById(id);
        if(author.isPresent()) {
            return DTOBuilder.buildAuthorDTO(author.get());
        }
        throw new AuthorNotFoundException();
    }

    @Override
    public AuthorDTO persistAuthor(AuthorDTO authorDTO) {
        Author author = EntityBuilder.buildAuthorEntity(authorDTO);
        return DTOBuilder.buildAuthorDTO(authorRepository.save(author));
    }

    @Override
    public void deleteAuthorById(Long id) {
        authorRepository.deleteById(id);
    }
}
