package com.example.libraryManagementSystem.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(String typeId){
        List <Book> books = new ArrayList<>();
        bookRepository.findByTypeId(typeId).forEach(books::add);
        return books;
    }
    public Book getBookById(String id){
       return  bookRepository.findById(id).get();
    }
    public void addBook(Book book){
        bookRepository.save(book);
    }
    public void updateBook(Book book, String id){
        bookRepository.save(book);
    }
    public void deleteBook(String id){
        bookRepository.deleteById(id);
    }

}
