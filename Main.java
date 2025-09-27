import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Lav en liste af film
        ArrayList<Film> filmListe = new ArrayList<>();

        // Tilføj objekter til listen
        filmListe.add(new Film("Inception", 2010, 8.8));
        filmListe.add(new Film("Frozen", 2013, 7.5));
        filmListe.add(new Film("The Matrix", 1999, 8.7));

        // Udskriv alle film med for-each
        for (Film f : filmListe) {
            System.out.println(f);
        }

        // Brug en metode til at regne gennemsnit
        double gennemsnit = beregnGennemsnitligRating(filmListe);
        System.out.println("Gennemsnitlig rating: " + gennemsnit);
    }

    // Metode til at regne gennemsnitlig rating
    public static double beregnGennemsnitligRating(ArrayList<Film> liste) {
        double sum = 0;
        for (Film f : liste) {
            sum += f.getRating();
        }
        return sum / liste.size();
    }
}