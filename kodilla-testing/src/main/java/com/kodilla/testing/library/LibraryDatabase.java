package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    List<Book> listBookWithCondition(String titleFragment);

    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    boolean rentAbook(LibraryUser libraryUser, Book book);

    int returnBooks(LibraryUser libraryUser);
}
