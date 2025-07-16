package com.example.graphqlserver;

import java.util.Arrays;
import java.util.List;

public record Author(String id, String firstname, String lastname) {
    private static List<Author> authors = Arrays.asList(
       new Author("auter-1", "Niakalé", "Diakité"),
       new Author("auther-2", "Gaoussou", "Diakité"),
       new Author("auther-3", "Awa", "Sow")

    );

}
