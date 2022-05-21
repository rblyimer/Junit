package junit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TvShowTest {
    @DisplayName("Test Tvshowname() method")
    @Test
    void getShowName() {
        TvShow tvShow = new TvShow("Home Economics", 22, "comedy");
        assertEquals("Home Economics", tvShow.getShowName());
    }

    @DisplayName("Test Tvshowepisodes() method")
    @Test
    void getNumOfEpisodes() {
        TvShow numOfEpisodes = new TvShow("Home Economics", 22, "comedy");
        assertEquals(22, numOfEpisodes.getNumOfEpisodes());
    }

    @DisplayName("Test TvshoweGenre() method")
    @Test
    void getGenre() {
        TvShow genre = new TvShow("Home Economics", 22, "Comedy");
        assertEquals("Comedy", genre.getGenre());
    }
}
