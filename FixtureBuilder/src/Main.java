import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");

        Fixture fixtureBuilder = new Fixture(teams);
        fixtureBuilder.buildFixture();
        fixtureBuilder.showFixture();
    }
}
