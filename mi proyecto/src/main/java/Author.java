package gutendex_api_project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Author {
    private String name;
    private Integer birthYear;
    private Integer deathYear;

    // Getters, Setters y toString()
}