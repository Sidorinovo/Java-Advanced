package Exercise02;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        Map<String, List<Employee>> departments = new HashMap<>();

        for (int i = 0; i < input; i++) {
            String[] employeeDetails = br.readLine().split("\\s+");
            String name = employeeDetails[0];
            double salary = Double.parseDouble(employeeDetails[1]);
            String position = employeeDetails[2];
            String department = employeeDetails[3];

            if (employeeDetails.length == 5) {
                String next = employeeDetails[4];

                if (next.contains("@")) {
                    Employee current = new Employee(name, salary, position, department, next);
                    departments.putIfAbsent(department, new ArrayList<>());
                    List<Employee> employees = departments.get(department);
                    employees.add(current);
                    departments.put(department, employees);
                } else {
                    int age = Integer.parseInt(next);
                    Employee current = new Employee(name, salary, position, department, age);
                    departments.putIfAbsent(department, new ArrayList<>());
                    List<Employee> employees = departments.get(department);
                    employees.add(current);
                    departments.put(department, employees);
                }
            } else if (employeeDetails.length == 6) {
                String email = employeeDetails[4];
                int age = Integer.parseInt(employeeDetails[5]);
                Employee current = new Employee(name, salary, position, department, email, age);
                departments.putIfAbsent(department, new ArrayList<>());
                List<Employee> employees = departments.get(department);
                employees.add(current);
                departments.put(department, employees);
            } else {
                Employee current = new Employee(name, salary, position, department);
                departments.putIfAbsent(department, new ArrayList<>());
                List<Employee> employees = departments.get(department);
                employees.add(current);
                departments.put(department, employees);
            }
        }

        double highestAvgSalary = 0.0;
        String highestPaidDept = "";

        for (Map.Entry<String, List<Employee>> entry : departments.entrySet()) {
            double totalSalary = 0.0;

            for (Employee employee : entry.getValue()) {
                totalSalary += employee.getSalary();
            }

            totalSalary = totalSalary / entry.getValue().size();

            if (totalSalary > highestAvgSalary) {
                highestAvgSalary = totalSalary;
                highestPaidDept = entry.getKey();
            }
        }

        List<Employee> employees = departments.get(highestPaidDept);
        pr.println(String.format("Highest Average Salary: %s", highestPaidDept));

        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(e -> pr.println(String.format("%s %.2f %s %d", e.getName(), e.getSalary(), e.getEmail(), e.getAge())));
        pr.flush();
    }
}
