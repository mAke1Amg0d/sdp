package Assignment3.Iterator;

public class ArrayMovieCollection {
    private String[] movies;

    public ArrayMovieCollection(String[] movies) {
        this.movies = movies;
    }

    public Iterator<String> iterator() {
        return new ArrayMovieIterator(movies);
    }
}