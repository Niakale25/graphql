package com.example.graphqlserver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public record Book(String id, String name, int pageCount, String authorId) {
    private static List<Book> books = Arrays.asList(
            new Book("Book_1", "name_1", 112, "Author_1"),
            new Book("Book_2", "name_2", 113, "Author_2"),
            new Book("Book_3", "name_3", 114, "Author_3")
    );
    public static Book getById(String id){
        return books.stream()
                .filter(book -> book.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
