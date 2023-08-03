import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDataGenerator {

    public static void main(String[] args) {
        // Generate data for five employees
        ArrayList<Employee> employees = generateEmployeeData();

        // Sort employees based on salary in ascending order
        sortEmployeesBySalary(employees);

        // Write the data to the CSV file
        try {
            writeDataToCSV(employees);
            System.out.println("Data successfully written to output.csv");

            // Verify CSV File
            verifyCSVFile();

            // TASK 4 in all catch & finally
        } catch (IOException e) {
            System.out.println("An error occurred while handling file I/O.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
    }

    // TASK 2
    private static ArrayList<Employee> generateEmployeeData() {
        ArrayList<Employee> employees = new ArrayList<>();

        // Generate data for each employee and add it to the ArrayList
        employees.add(new Employee(1, "Minakshee Bari", "IT", 90000.0));
        employees.add(new Employee(2, "Rakesh Rao", "HR", 55000.0));
        employees.add(new Employee(3, "Vikas Khanna", "Fin", 70000.0));
        employees.add(new Employee(4, "Sheena Dev", "Mark", 65000.0));
        employees.add(new Employee(5, "Sandy Charls", "Opr", 58000.0));

        return employees;
    }

    // Task 5 - Sorting employees based on salary
    private static void sortEmployeesBySalary(ArrayList<Employee> employees) {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp1.getSalary(), emp2.getSalary());
            }
        });
    }

    private static void writeDataToCSV(ArrayList<Employee> employees) throws IOException {
        String csvFile = "output.txt"; // csv replaced with txt
        FileWriter writer = new FileWriter(csvFile);
        try {
            // Write header
            writer.append("Employee ID,Employee Name,Department,Salary");
            writer.append("\n");

            // Write data for each employee
            for (Employee employee : employees) {
                writer.append(String.valueOf(employee.getId()) + "\t");
                // writer.append(",");
                writer.append(employee.getName() + "\t");
                // writer.append(",");
                writer.append(employee.getDepartment() + "\t");
                // writer.append(",");
                writer.append(String.valueOf(employee.getSalary()) + "\n");
                // writer.append("\n");
            }
            writer.flush();
        } finally {
            writer.close();
        }
    }

    // TASK 3
    private static void verifyCSVFile() throws IOException {
        String csvFile = "output.txt"; // csv replaced with txt
        FileReader fileReader = new FileReader(csvFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        System.out.println("\nCSV File Contents (Verification):\n");

        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            bufferedReader.close();
        }

        bufferedReader.close();
    }

    // TASK 1
    private static class Employee {
        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }
}
