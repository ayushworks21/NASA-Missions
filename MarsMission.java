class MarsMission extends NASAMission {
    int numberOfRovers;

    MarsMission(String missionName, int launchYear, String destination, int numberOfRovers) {
        super(missionName, launchYear, destination);
        this.numberOfRovers = numberOfRovers;
    }

    @Override
    void displayMission() {
        super.displayMission();
        System.out.println("Mission Type: Mars Exploration");
        System.out.println("Number of Rovers: " + numberOfRovers);
    }
}
