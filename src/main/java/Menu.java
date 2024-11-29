package gutendex_api_project;

import java.util.Scanner;

public class Menu {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú Principal");
            System.out.println("1. Buscar libro por título");
            System.out.println("2. Listar todos los libros");
            System.out.println("3. Listar autores");
            System.out.println("4. Listar autores vivos en un año");
            System.out.println("5. Mostrar estadísticas de libros por idioma");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // limpiar el buffer

            switch (option) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String title = scanner.nextLine();
                    BookService.searchBookByTitle(title);
                    break;
                case 2:
                    BookService.listAllBooks();
                    break;
                case 3:
                    AuthorService.listAllAuthors();
                    break;
                case 4:
                    System.out.print("Ingrese el año: ");
                    int year = scanner.nextInt();
                    AuthorService.listAuthorsAliveInYear(year);
                    break;
                case 5:
                    System.out.print("Ingrese el idioma (ejemplo: 'en', 'es'): ");
                    String language = scanner.nextLine();
                    BookService.showBooksStatsByLanguage(language);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}