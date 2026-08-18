import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String missionType = sc.nextLine();
        String missionName = sc.nextLine();
        int launchYear = Integer.parseInt(sc.nextLine());
        String destination = sc.nextLine();
        int specificNumber = Integer.parseInt(sc.nextLine());

        if (missionType.equalsIgnoreCase("Mars")) {

            MarsMission mission = new MarsMission(
                    missionName,
                    launchYear,
                    destination,
                    specificNumber
            );

            mission.displayMission();

        } else if (missionType.equalsIgnoreCase("Moon")) {

            MoonMission mission = new MoonMission(
                    missionName,
                    launchYear,
                    destination,
                    specificNumber
            );

            mission.displayMission();
        }

        sc.close();
    }
}