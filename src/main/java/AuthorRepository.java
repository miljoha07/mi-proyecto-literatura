package gutendex_api_project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Métodos para consultas personalizadas
}