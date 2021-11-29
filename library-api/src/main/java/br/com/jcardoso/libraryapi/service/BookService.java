package br.com.jcardoso.libraryapi.service;

import br.com.jcardoso.libraryapi.entity.Book;
import org.springframework.stereotype.Service;


public interface BookService {
    Book save(Book any);
}
