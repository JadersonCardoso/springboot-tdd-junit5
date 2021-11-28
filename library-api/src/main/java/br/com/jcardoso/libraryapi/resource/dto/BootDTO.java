package br.com.jcardoso.libraryapi.resource.dto;

import lombok.Data;

@Data
public class BootDTO {

    private Long id;
    private String title;
    private String author;
    private String isbn;

}
