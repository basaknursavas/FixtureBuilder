import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Fixture {
    private List<String> teams;
    private List<String> fixture;

    public Fixture(List<String> teams) {
        this.teams = teams;
        this.fixture = new ArrayList<>();
    }

    public void buildFixture() {
        int numberOfTeams = teams.size();


        if (numberOfTeams % 2 != 0) {
            teams.add("Bay");
            numberOfTeams++;
        }

        int numberOfRounds = numberOfTeams - 1;
        int roundOrder = 1;
        int roundOrderA = 0;
        int roundOrderB = numberOfTeams / 2;


        for (int round = 0; round < numberOfRounds; round++) {
            for (int i = 0; i < numberOfTeams / 2; i++) {
                String takimA = teams.get(roundOrderA);
                String takimB = teams.get(roundOrderB);

                String mac = takimA + " vs " + takimB;
                fixture.add(mac);

                roundOrderA = (roundOrderA+ 1) % (numberOfTeams - 1);
                roundOrderB = (roundOrderB + 1) % (numberOfTeams - 1);
            }
            roundOrder++;
            Collections.rotate(teams.subList(1, teams.size()), -1); 
        }
    }
    public void showFixture() {
        int round = 1;
        for (int i = 0; i < fixture.size(); i += teams.size() / 2) {
            System.out.println("Round " + round);
            for (int j = i; j < i + teams.size() / 2; j++) {
                System.out.println(fixture.get(j));
            }
            System.out.println();
            round++;
        }
    }
}
