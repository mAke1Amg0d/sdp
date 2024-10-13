package Assignment3.Iterator;

public class ArrayMovieIterator implements Iterator<String> {
    private String[] movies;
    private int position = 0;

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
    }

    public boolean hasNext() {
        return position < movies.length;
    }

    public String next() {
        return movies[position++];
    }
}