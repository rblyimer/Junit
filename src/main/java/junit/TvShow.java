package junit;

public class TvShow {
    private String showName;
    private int numOfEpisodes;
    private String genre;

    public TvShow(String showName, int numOfEpisodes, String genre) {
        this.showName = showName;
        this.numOfEpisodes = numOfEpisodes;
        this.genre = genre;
    }

    public String getShowName() {
        return showName;
    }

    public int getNumOfEpisodes() {
        return numOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return (
            "The name of the show is " + getShowName() + " with " + getNumOfEpisodes() + " number of episodes. " + "The genre is " + getGenre()
        );
    }

}