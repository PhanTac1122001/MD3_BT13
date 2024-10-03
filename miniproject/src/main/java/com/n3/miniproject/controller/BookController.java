package com.n3.miniproject.controller;

import com.n3.miniproject.model.entity.Book;
import com.n3.miniproject.model.entity.Category;
import com.n3.miniproject.service.IBookService;
import com.n3.miniproject.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    IBookService bookService;

    @Autowired
    ICategoryService categoryService;
    @GetMapping
    public String indexBook(Model model){
        List<Book> bookList=bookService.findAll();
        model.addAttribute("book",bookList);
        return "book/index";
    }
    @GetMapping("/add")
    public String addBook(Model model) {

        model.addAttribute("book", new Book());
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "book/add";
    }

    @PostMapping("/add-book")
    public String createBook(@ModelAttribute("book") Book book, Model model) {
        boolean bl = bookService.addBook(book);
        List<Category> categories =  categoryService.findAll();
        if (bl) {
            model.addAttribute("categories", categories);
            return "redirect:/book";
        } else {

            model.addAttribute("book", book);
            return "book/add";
        }
    }

    @GetMapping("/edit/{id}")
    public String editBook(Model model, @PathVariable("id") int id) {
        Book book = bookService.findById(id);
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        model.addAttribute("book", book);
        return "book/update";
    }

    @PostMapping("/edit/{id}")
    public String updateBook(@PathVariable("id") int id, @ModelAttribute("book") Book book, Model model) {
        if (bookService.updateBook(book)) {
            List<Category> categories = categoryService.findAll();
            model.addAttribute("categories", categories);
            model.addAttribute("book", book);

            return "redirect:/book";
        } else {
            return "book/add";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, RedirectAttributes redirectAttributes){
        bookService.deteleBook(id);
        redirectAttributes.addFlashAttribute("success","xoa thanh cong");
        return "redirect:/book";
    }
}
