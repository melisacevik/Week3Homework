class XboxController implements GameController {
    @Override
    public void connectToComputer() {
        System.out.println("Xbox controller is connected to the computer.");
    }

    @Override
    public void disconnectFromComputer() {
        System.out.println("Xbox controller is disconnected from the computer.");
    }

    @Override
    public void playGame() {
        System.out.println("Playing the game with Xbox controller.");
    }
}
