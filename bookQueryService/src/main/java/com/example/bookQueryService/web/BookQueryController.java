package com.example.bookQueryService.web;


import com.example.bookQueryService.service.BookQueryService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@Data
@RequiredArgsConstructor
public class BookQueryController {

    @Autowired
    private BookQueryService bookQueryService;

    @GetMapping("books/getBook/{bookName}")
    public ResponseEntity<String> getBook (@PathVariable String bookName) {
        System.out.println("get book method");
        return ResponseEntity.ok("bookDTO");
    }

}
