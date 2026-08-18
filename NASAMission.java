class NASAMission {
    String missionName;
    int launchYear;
    String destination;

    NASAMission(String missionName, int launchYear, String destination) {
        this.missionName = missionName;
        this.launchYear = launchYear;
        this.destination = destination;
    }

    void displayMission() {
        System.out.println("Mission Name: " + missionName);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Destination: " + destination);
    }
}