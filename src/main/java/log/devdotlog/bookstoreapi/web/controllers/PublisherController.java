package log.devdotlog.bookstoreapi.web.controllers;

import log.devdotlog.bookstoreapi.domain.Publisher;
import log.devdotlog.bookstoreapi.repositories.PublisherRepository;
import log.devdotlog.bookstoreapi.web.model.PublisherDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/v1/book/publisher")
public class PublisherController {

    private PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }
    @GetMapping("/{id}")
    public ResponseEntity<PublisherDto> getPublisherById(@PathVariable("id") Long id){
        Optional<Publisher> publisherOptional = publisherRepository.findById(id);
        PublisherDto publisherDto = PublisherDto.builder()
                .id(publisherOptional.get().getId())
                .name(publisherOptional.get().getName())
                .books(publisherOptional.get().getBooks())
                .build();

        return new ResponseEntity<>(publisherDto, HttpStatus.OK);
    }
}
