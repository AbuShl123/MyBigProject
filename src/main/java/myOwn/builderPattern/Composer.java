package myOwn.builderPattern;

import java.util.List;

class Main {
    public static void main(String[] args) {
        Composer mozart = new ComposersBuilder("Wolfgang Amadeus", "Mozart", "1756-1791", "classical")
                .sonata(18).symphony(41).piano_concerto(27).requiem(1).minuet(117).fugue(3).opera(22).serenade(16).build();
        Composer beethoven = new ComposersBuilder("Ludwig Van", "Beethoven", "1770-1827", "classical-romantic")
                .sonata(32).symphony(9).piano_concerto(5).waltzes_forPiano(15).minuet(12).serenade(141).opera(1).prelude(2).build();
        Composer chopin = new ComposersBuilder("Frederic", "Chopin", "1810-1849", "romantic")
                .nocturne(21).waltzes_forPiano(19).etude(27).prelude(26).sonata(3).mazurka(57).impromptu(4).build();
        Composer liszt = new ComposersBuilder("Franz", "Liszt", "1811-1886", "romantic")
                .etude(16).rhapsody(19).sonata(1).symphony(13).build();
        Composer schubert = new ComposersBuilder("Franz", "Schubert", "1797-1828", "classic-romantic")
                .symphony(9).sonata(30).impromptu(11).build();
        Composer shostakovich = new ComposersBuilder("Dmitri", "Shostakovich", "1906-1975", "20th Century")
                .waltz(2).symphony(15).sonata(2).prelude(12).fugue(12).opera(10).build();
        List<Composer> composers = List.of(mozart, beethoven, chopin, liszt, schubert, shostakovich);

        for (Composer composer : composers) {
            System.out.println(composer);
        }

    }
}

public class Composer {
    public static final String RESET = "\033[0m";
    public static final String YELLOW_BOLD = "\033[1;33m";

    private final String firstName;
    private final String lastName;
    private final String yearOfLife;
    private final String style;
    private final int waltzes, waltzes_forPiano, etudes, nocturnes, sonatas, preludes, symphonies,
            piano_concertos, minuets, fugues, mazurkas, requiem, operas, serenades, impromptu, rhapsodies;


    public Composer(ComposersBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.yearOfLife = builder.yearOfLife;
        this.style = builder.style;
        this.waltzes = builder.waltzes;
        this.waltzes_forPiano = builder.waltzes_forPiano;
        this.etudes = builder.etudes;
        this.nocturnes = builder.nocturnes;
        this.sonatas = builder.sonatas;
        this.preludes = builder.preludes;
        this.symphonies = builder.symphonies;
        this.piano_concertos = builder.piano_concertos;
        this.minuets = builder.minuets;
        this.fugues = builder.fugues;
        this.mazurkas = builder.mazurkas;
        this.requiem = builder.requiem;
        this.operas = builder.operas;
        this.serenades = builder.serenades;
        this.impromptu = builder.impromptu;
        this.rhapsodies = builder.rhapsodies;
    }

    public String toString() {
        final int compositions_totally = waltzes + etudes  + nocturnes + sonatas + preludes + sonatas + symphonies + piano_concertos + minuets + fugues + mazurkas + requiem;
        final int pianoCompositions_totally = waltzes_forPiano + etudes + nocturnes + sonatas + preludes + piano_concertos + mazurkas + impromptu;
        return YELLOW_BOLD + "\n\t\t\t\t\t" + firstName + " " + lastName + RESET + " (" + yearOfLife + ") " + "- " + style +
                "\nsonatas: " + sonatas + "\nsymphonies: " + symphonies + "\npiano concertos: " + piano_concertos + "\nnocturnes: " + nocturnes  + "\npreludes: " + preludes + "\netudes: " + etudes + "\nwaltzes: " + waltzes + "\npiano waltzes: " + waltzes_forPiano + "\nminuets: " + minuets + "\nfugues: " + fugues + "\nmazurkas: " + mazurkas + "\nrequiem: " + requiem + "\nimpromptu: " + "\nrhapsodies: " + rhapsodies+ "\nimpromptu: " + impromptu + "\noperas: " + operas + "\nserenades" + serenades + "\n\t\ttotal amount:" + "\n\tpiano compositions: "+ pianoCompositions_totally + "\n\ttotally: " + compositions_totally + "\n";
    }

}

class ComposersBuilder {
    public final String firstName;
    public final String lastName;
    public final String yearOfLife;
    public final String style;
    public int waltzes, waltzes_forPiano, etudes, nocturnes, sonatas, preludes, symphonies, piano_concertos, minuets,
            fugues, mazurkas, requiem, operas, serenades, impromptu, rhapsodies;

    ComposersBuilder(String firstName, String lastName, String yearOfLife, String style) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfLife = yearOfLife;
        this.style = style;
    }

    ComposersBuilder waltz(int waltzes) {this.waltzes = waltzes; return this;}
    ComposersBuilder waltzes_forPiano (int waltzes_forPiano) {this.waltzes_forPiano = waltzes_forPiano; return this;}
    ComposersBuilder etude(int etudes) {this.etudes = etudes; return this;}
    ComposersBuilder nocturne(int nocturnes) {this.nocturnes = nocturnes; return this;}
    ComposersBuilder sonata(int sonatas) {this.sonatas = sonatas; return this;}
    ComposersBuilder prelude(int preludes) {this.preludes = preludes; return this;}
    ComposersBuilder symphony(int symphonies) {this.symphonies = symphonies; return this;}
    ComposersBuilder piano_concerto(int piano_concertos) {this.piano_concertos = piano_concertos; return this;}
    ComposersBuilder minuet(int minuets) {this.minuets = minuets; return this;}
    ComposersBuilder fugue(int fugues) {this.fugues = fugues; return this;}
    ComposersBuilder mazurka(int mazurkas) {this.mazurkas = mazurkas; return this;}
    ComposersBuilder requiem(int requiem) {this.requiem = requiem; return this;}
    ComposersBuilder opera(int operas) {this.operas = operas; return this;}
    ComposersBuilder serenade(int serenades) {this.serenades = serenades; return this;}
    ComposersBuilder impromptu(int impromptu) {this.impromptu = impromptu; return this;}
    ComposersBuilder rhapsody(int rhapsodies) {this.rhapsodies = rhapsodies; return this;}

    public Composer build() {
        return new Composer(this);
    }
}