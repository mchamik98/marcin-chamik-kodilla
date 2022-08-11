package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book>resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity ; n++){
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock LibraryDatabase libraryDatabaseMock;

    @Mock LibraryUser libraryUserMock;

    @Test
    void testListBooksWithConditionsReturnList(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBookWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionsMoreThan20(){
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBookWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBookWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBookWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionsFragmentShorterThan3(){
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBookWithCondition(anyString());
    }

    @Test
    void testListBooks0(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUserMock)).thenReturn(new ArrayList<>());

        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUserMock);

        //Then
        assertEquals(0, result.size());
    }

    @Test
    void testListBooks1(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> book = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUserMock)).thenReturn(book);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUserMock);

        //Then
        assertEquals(1, result.size());
    }

    @Test
    void testListBooks5(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> book = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUserMock)).thenReturn(book);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUserMock);

        //Then
        assertEquals(5, result.size());
    }
}
