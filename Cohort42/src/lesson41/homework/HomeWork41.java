package lesson41.homework;

import lesson41.homework.controller.BookController;
import lesson41.homework.repository.BookRepository;
import lesson41.homework.service.BookService;


public class HomeWork41 {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);
        BookController bookController = new BookController(bookService);
        bookController.run();
    }
}
