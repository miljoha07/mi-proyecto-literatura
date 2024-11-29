package gutendex_api_project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Métodos para consultas personalizadas
}