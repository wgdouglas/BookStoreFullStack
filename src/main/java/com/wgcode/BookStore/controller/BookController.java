package com.wgcode.BookStore.controller;

import com.wgcode.BookStore.dto.BookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("api/getAllBooks")
    public ResponseEntity<List<BookDTO>> getListOfBooks(){
        BookDTO book = BookDTO.builder()
                .title("My First Book title")
                .build();

        List<BookDTO> bookDTOList = new ArrayList<>();
        bookDTOList.add(book);

        return ResponseEntity.ok(bookDTOList);
    }
}
