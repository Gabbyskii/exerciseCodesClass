public class Film {
    private String titel;
    private int år;
    private double rating;

    public Film(String titel, int år, double rating) {
        this.titel = titel;
        this.år = år;
        this.rating = rating;
    }

    public String getTitel() {
        return titel;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film: " + titel + " (" + år + "), rating: " + rating;
    }
}