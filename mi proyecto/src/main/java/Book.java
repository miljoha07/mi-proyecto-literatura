package gutendex_api_project;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@gutendex_api_project.JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    private String title;
    @JsonAlias("languages")
    private List<String> languages;
    private int downloadCount;
    private Author author;

    // Getters, Setters y toString()
}