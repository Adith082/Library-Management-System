package com.example.libraryManagementSystem.book;


import com.example.libraryManagementSystem.type.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
  //  private boolean borrowed;
    @ManyToOne
    Type type;



    public Book(){}

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
