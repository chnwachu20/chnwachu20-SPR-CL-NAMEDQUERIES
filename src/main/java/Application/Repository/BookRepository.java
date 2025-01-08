package Application.Repository;

import Application.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

/**
 * This interface explores JPA's ability to infer queries from method names using query methods.
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    /**
     * Retrieve a book by its ISBN.
     * @param isbn a long that identifies distinct books.
     * @return the book with a particular ISBN
     */
    Book findBookByIsbn(long isbn);

    /**
     * Retrieve a list of books by their author.
     * @param author the author of the books
     * @return a list of books written by the specified author
     */
    List<Book> findBooksByAuthor(String author);

    /**
     * Retrieve a list of books by their author and dateAdded.
     * @param author the author of the books
     * @param dateAdded the date the books were added
     * @return a list of books matching the author and dateAdded
     */
    List<Book> findBooksByAuthorAndDateAdded(String author, Timestamp dateAdded);

    /**
     * TODO: Retrieve a book by its title. Titles are unique, so a single Book should be returned.
     */
    Book findBookByTitle(String title);

    /**
     * TODO: Retrieve books by their availability using the field "available" in the class Book.
     */
    List<Book> findBooksByAvailable(boolean available);

    /**
     * TODO: Retrieve books by their dateAdded OR their lastDateWithdrawn.
     */
    List<Book> findBooksByDateAddedOrLastDateWithdrawn(Timestamp dateAdded, Timestamp lastDateWithdrawn);
}