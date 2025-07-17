package com.example.graphqlserver;

import java.util.Arrays;
import java.util.List;

public record Author(String id, String firstName, String lastName) {
    private static List<Author> authors = Arrays.asList(
       new Author("author_1", "Niakalé", "Diakité"),
       new Author("author_2", "Gaoussou", "Diakité"),
       new Author("author_3", "Awa", "Sow")

    );
    public static Author getById (String id){
        return authors.stream()
                .filter(author -> author.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
