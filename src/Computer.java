class Computer {
    private boolean open;
    private GameController controller;

    public void open() {
        if (open) {
            throw new RuntimeException("Computer is already open.");
        }
        open = true;
        System.out.println("Computer is turned on.");
    }

    public void shutdown() {
        if (!open) {
            throw new RuntimeException("Computer is already shut down.");
        }
        if (controller != null) {
            controller.disconnectFromComputer();
        }
        open = false;
        System.out.println("Computer is shut down.");
    }

    public void addController(GameController controller) {
        if (this.controller != null) {
            throw new RuntimeException("A controller is already connected to the computer.");
        }
        this.controller = controller;
        controller.connectToComputer();
    }

    public void playGame() {
        if (!open) {
            throw new RuntimeException("Computer is not turned on.");
        }
        if (controller == null) {
            throw new RuntimeException("No controller is connected to the computer.");
        }
        controller.playGame();
    }
}