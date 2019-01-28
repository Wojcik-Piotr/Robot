public class Main {
    public static void main(String[] args) {
        Platform platform = new Platform();
        Robot robot = new Robot(platform);
        robot.run("PMLPMMMLPMLPMML");
        robot.run("PLPLPLPLPLPLPLPL");
        robot.run(args[0]);
    }
}
