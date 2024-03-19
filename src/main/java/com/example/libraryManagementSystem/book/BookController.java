package com.example.libraryManagementSystem.book;

import com.example.libraryManagementSystem.type.Type;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/types/{id}/books")
    public List<Book> getAllBooks(@PathVariable String id){
        return bookService.getAllBooks(id);
    }

    @RequestMapping("/types/{typeId}/books/{id}")
    public Book getBookById(@PathVariable String typeId, @PathVariable String id) {
        return bookService.getBookById(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/types/{typeId}/books")
    public void addBook(@PathVariable String typeId, @RequestBody Book book){
        book.setType(new Type(typeId, "", ""));
        bookService.addBook(book);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/types/{typeId}/books/{id}")
    public void updateBook(@PathVariable String typeId, @PathVariable String id, @RequestBody Book book){
        book.setType(new Type(typeId, "", ""));
        bookService.updateBook(book, id);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/types/{typeId}/books/{id}")
    public void deleteBook(@PathVariable String typeId, @PathVariable String id){
        bookService.deleteBook(id);
    }

}
