import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20, 10, 30, 40, 20, 50);

        try {
            Integers operations = new Integers(integers);
            operations.printResults();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        List<Integer> emptyList = new ArrayList<>();
        try {
            Integers emptyOperations = new Integers(emptyList);
            emptyOperations.printResults();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}