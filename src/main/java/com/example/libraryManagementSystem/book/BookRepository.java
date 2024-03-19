package com.example.libraryManagementSystem.book;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, String> {
     public List<Book> findByTypeId(String typeId);
}
