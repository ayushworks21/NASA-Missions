class MoonMission extends NASAMission {
    int numberOfAstronauts;

    MoonMission(String missionName, int launchYear, String destination, int numberOfAstronauts) {
        super(missionName, launchYear, destination);
        this.numberOfAstronauts = numberOfAstronauts;
    }

    @Override
    void displayMission() {
        super.displayMission();
        System.out.println("Mission Type: Lunar Exploration");
        System.out.println("Number of Astronauts: " + numberOfAstronauts);
    }
}