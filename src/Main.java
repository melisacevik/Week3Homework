public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        GameController xboxController = new XboxController();
        GameController playStationController = new PlayStationController();


        try {
            computer.open();
            computer.addController(xboxController);
            computer.playGame();
        } catch (RuntimeException e) {
            System.out.println("Error with Xbox controller: " + e.getMessage());
        }
        computer.shutdown();

        try {
            computer.open();
            computer.addController(playStationController);
            computer.playGame();
        } catch (RuntimeException e) {
            System.out.println("Error with PlayStation controller: " + e.getMessage());
        }
        computer.shutdown();
    }
}
