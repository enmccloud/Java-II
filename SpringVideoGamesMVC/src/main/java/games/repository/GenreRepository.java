/**
 * Genre Repo Class
 * @author Nikki McCloud
 * @version 1.0
 */
package games.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import games.beans.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}