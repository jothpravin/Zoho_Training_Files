public class TowerOfHanoi {
    public static void main(String[] args) {
        int numDisks = 3;
        solveTowerOfHanoi(numDisks, 'A', 'C', 'B');
    }

    public static void solveTowerOfHanoi(int numDisks, char source, char destination, char auxiliary) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveTowerOfHanoi(numDisks - 1, source, auxiliary, destination);
        System.out.println("Move disk " + numDisks + " from " + source + " to " + destination);
        solveTowerOfHanoi(numDisks - 1, auxiliary, destination, source);
    }
}

