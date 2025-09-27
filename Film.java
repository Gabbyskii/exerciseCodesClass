public class Film {
    // Felter (egenskaber)
    private String titel;
    private int år;
    private double rating;

    // Constructor (bruges til at oprette objekter)
    public Film(String titel, int år, double rating) {
        this.titel = titel;
        this.år = år;
        this.rating = rating;
    }

    // Gettere (læse værdier)
    public String getTitel() {
        return titel;
    }

    public int getÅr() {
        return år;
    }

    public double getRating() {
        return rating;
    }

    // Settere (ændre værdier)
    public void setRating(double rating) {
        this.rating = rating;
    }

    // toString (udskrift af objektet)
    @Override
    public String toString() {
        return "Film: " + titel + " (" + år + "), rating: " + rating;
    }
}