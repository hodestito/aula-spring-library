package br.com.fiap.library;

import br.com.fiap.library.controller.BookController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class BookControllerTest {

    BookController bookController = new BookController();

    @Test
    public void getAllTest(){
        //Assert.notEmpty(bookController.getAll("Senhor dos Aneis"));
        assertEquals(bookController.getAll("Senhor dos Aneis"));
    }

    @Test
    public void getByIdTest(){
        Assert.notEmpty(bookController.findById(1));
    }

}
