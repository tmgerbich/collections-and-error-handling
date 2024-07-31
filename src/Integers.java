import java.util.*;

class Integers {

    private List<Integer> integerList;
    private Set<Integer> integerSet;

    public Integers(List<Integer> integerList) {
        this.integerList = integerList;
        this.integerSet = new HashSet<>(integerList);
    }

    public int calculateSum() throws Exception {
        int sum = 0;
        for (int num : integerSet) {
            sum += num;
        }
        return sum;
    }

    public double calculateAverage(int sum) throws ArithmeticException {
        if (integerSet.size() > 0) {
            return (double) sum / integerSet.size();
        } else {
            throw new ArithmeticException("Division by zero while calculating average");
        }
    }

    public void printResults() throws Exception {
        try {
            int sum = this.calculateSum();
            double average = this.calculateAverage(sum);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("List without duplicates: " + integerSet);
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("Operation completed.");
        }
    }
}