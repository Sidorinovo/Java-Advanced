import java.util.*;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.nextLine();
        Map<String, List<Double>> studentGrades = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            String[] studentDetails = scan.nextLine().split("\\s+");
            String name = studentDetails[0];
            double grade = Double.parseDouble(studentDetails[1]);

            studentGrades.putIfAbsent(name, new ArrayList<>());
            List<Double> currentGrades = studentGrades.get(name);
            currentGrades.add(grade);
            studentGrades.put(name, currentGrades);
        }

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            entry.getValue().stream().forEach(e -> System.out.printf("%.2f ", e));
            double avgGrade = entry.getValue().stream().mapToDouble(e -> e).average().getAsDouble();
            System.out.printf("(avg: %.2f)\n", avgGrade);
        }
    }
}
