package br.com.jcardoso.libraryapi.service.impl;

import br.com.jcardoso.libraryapi.entity.Book;
import br.com.jcardoso.libraryapi.exception.BusinessException;
import br.com.jcardoso.libraryapi.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements br.com.jcardoso.libraryapi.service.BookService {

    private BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        if(repository.existsByIsbn(book.getIsbn())) {
            throw new BusinessException("Isbn já cadastrado.");
        }
        return repository.save(book);
    }
}
