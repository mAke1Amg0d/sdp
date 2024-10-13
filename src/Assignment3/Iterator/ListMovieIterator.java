package Assignment3.Iterator;

import java.util.List;

public class ListMovieIterator implements Iterator<String> {
    private List<String> movies;
    private int position = 0;

    public ListMovieIterator(List<String> movies) {
        this.movies = movies;
    }

    public boolean hasNext() {
        return position < movies.size();
    }

    public String next() {
        return movies.get(position++);
    }
}