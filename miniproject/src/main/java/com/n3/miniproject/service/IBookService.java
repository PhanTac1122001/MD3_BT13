package com.n3.miniproject.service;

import com.n3.miniproject.model.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    Book findById(int id);

    boolean addBook(Book book);

    boolean updateBook(Book book);

    void deteleBook(int id);
}
