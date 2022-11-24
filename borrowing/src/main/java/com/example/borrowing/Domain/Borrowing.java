package com.example.borrowing.Domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Document(collection = "borrowing")
public class Borrowing {


    @Id
    private int borrowingNumber;
    private String date;
    private int customerNumber;
    private String customerName;
    private String isbn;
    private String bookTitle;

    public Borrowing(String date, int customerNumber, String customerName, String isbn, String bookTitle) {
    }
}