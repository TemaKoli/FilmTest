import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void NotAdded() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddAndOutputOneFilm() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddAndOutputMoreFilms() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void OutputLastAddedOneFilm() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void OutputLastAddedFiveFilms() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");
        manager.addMovies("Film 4");
        manager.addMovies("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void OutputLastAddedFilms() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");
        manager.addMovies("Film 4");
        manager.addMovies("Film 5");
        manager.addMovies("Film 6");
        manager.addMovies("Film 7");
        manager.addMovies("Film 8");
        manager.addMovies("Film 9");

        String[] expected = {"Film 9", "Film 8", "Film 7", "Film 6", "Film 5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void NotOutput() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
