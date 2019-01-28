public class Robot {
    private final Platform platform;
    private int positnion = 0;
    private boolean holdsBlock = false;

    public Robot(Platform platform) {
        this.platform = platform;
    }

    private void pickUp() {
        positnion = 0;
        holdsBlock = true;
    }

    private void move() {
        if (positnion < platform.getPLATFORM_LENGTH()) {
            positnion++;
        }
    }

    private void lower() {
        if (platform.canLower(positnion) && holdsBlock) {
            platform.addBloc(positnion);
            holdsBlock = false;
        }
    }

    public void run(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'P') {
                pickUp();
            } else if (c == 'M') {
                move();
            } else if (c == 'L') {
                lower();
            }
        }
        System.out.println(platform.blocksOnPlatform());
    }
}
