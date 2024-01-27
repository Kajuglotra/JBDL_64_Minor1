package org.gfg.minor1.controller;

import org.gfg.minor1.model.Book;
import org.gfg.minor1.model.FilterType;
import org.gfg.minor1.model.Operator;
import org.gfg.minor1.request.BookCreateRequest;
import org.gfg.minor1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public Book createBook(@RequestBody BookCreateRequest bookCreateRequest){
        // validation can here -
        return bookService.createBook(bookCreateRequest);
    }

    @GetMapping("/filter")
    public List<Book> filter(@RequestParam("filterBy") FilterType filterBy,
                             @RequestParam("operator") Operator operator,
                             @RequestParam("value") String value){
        return bookService.filter(filterBy, operator, value);
    }

}
