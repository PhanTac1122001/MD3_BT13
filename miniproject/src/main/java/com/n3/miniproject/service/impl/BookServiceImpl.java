package com.n3.miniproject.service.impl;

import com.n3.miniproject.model.dao.IBookDao;
import com.n3.miniproject.model.entity.Book;
import com.n3.miniproject.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    IBookDao bookDao;
    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookDao.findById(id);
    }

    @Override
    public boolean addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public boolean updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public void deteleBook(int id) {
    bookDao.deleteBook(id);
    }
}
