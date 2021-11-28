package br.com.jcardoso.libraryapi.resource;

import br.com.jcardoso.libraryapi.resource.dto.BootDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BootDTO create() {
        BootDTO dto = new BootDTO();
        dto.setId(1L);
        dto.setAuthor("Autor");
        dto.setTitle("Meu Livro");
        dto.setIsbn("1213212");
        return dto;
    }

}
