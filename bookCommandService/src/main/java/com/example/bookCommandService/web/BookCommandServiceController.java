package com.example.bookCommandService.web;

import com.example.bookCommandService.service.dto.BookDTO;
import com.example.bookCommandService.service.dto.BookService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Data
@RequiredArgsConstructor
public class BookCommandServiceController {
    @Autowired
    private BookService bookService;

   @PostMapping("/addBook")
    public ResponseEntity<String> addBook () {
       return ResponseEntity.ok(bookService.addBook());


    }

    @PostMapping("/updateBook")
    public void updateBook (BookDTO bookDTO) {
        bookService.updateBook(bookDTO);
    }

    @PostMapping("/deleteBook")
    public void deleteBook (String bookIsbn) {
        bookService.deleteBook(bookIsbn);
    }

    @GetMapping("/")
    public String addBookPage () {
        return "add book  method";
    }

}
