public class TowersOfHanoi {
    public static void main(String[] args) {
        towersOfHanoi(3, "1", "2", "3");
    }

    public static void towersOfHanoi(int n, String startRod, String utilityRod, String endRod) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from rod " + startRod + " to rod " + endRod);
            return;
        }
        towersOfHanoi(n - 1, startRod, endRod, utilityRod);
        System.out.println("Move disk " + n + " from rod " + startRod + " to rod " + endRod);
        towersOfHanoi(n - 1, utilityRod, startRod, endRod);
    }
}
