import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private double marks;

    public Student(String id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getRank() {
        if (marks >= 0 && marks < 5.0) return "Fail";
        else if (marks < 6.5) return "Medium";
        else if (marks < 7.5) return "Good";
        else if (marks < 9.0) return "Very Good";
        else if (marks <= 10.0) return "Excellent";
        else return "Invalid Marks";
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Rank: " + getRank();
    }
}

public class ASM {
    private List<Student> students = new ArrayList<>();

    public void addStudent(String id, String name, double marks) {
        students.add(new Student(id, name, marks));
    }

    public void editStudent(String id, String newName, double newMarks) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(newName);
                student.setMarks(newMarks);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    public void sortStudents() {
        students.sort((s1, s2) -> {
        int markComparison = Double.compare(s2.getMarks(), s1.getMarks());
        if (markComparison != 0) {
            return markComparison;
        } else {
            return s1.getName().compareTo(s2.getName());
        }
    });
    }

    public void searchStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        ASM management = new ASM();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Sort Students");
            System.out.println("5. Search Student");
            System.out.println("6. Display All Students");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                   
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    double marks;
                    do {
                        System.out.print("Enter Marks (0-10): ");
                        marks = scanner.nextDouble();
                        if (marks < 0 || marks > 10) {
                            System.out.println("Marks must be between 0 and 10.");
                        }
                    } while (marks < 0 || marks > 10);
                    management.addStudent(id, name, marks);
                    break;
                case 2:
                    System.out.print("Enter ID to edit: ");
                    id = scanner.nextLine();
                    System.out.print("Enter new Name: ");
                    name = scanner.nextLine();
                    do {
                        System.out.print("Enter new Marks (0-10): ");
                        marks = scanner.nextDouble();
                        if (marks < 0 || marks > 10) {
                            System.out.println("Marks must be between 0 and 10.");
                        }
                    } while (marks < 0 || marks > 10);
                    management.editStudent(id, name, marks);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    id = scanner.nextLine();
                    management.deleteStudent(id);
                    break;
                case 4:
                
                    management.sortStudents();
                    System.out.println("Students sorted by marks:");
                    management.displayAllStudents();
                    break;
                    
                            
                case 5:
                    System.out.print("Enter ID to search: ");
                    id = scanner.nextLine();
                    management.searchStudent(id);
                    break;
                case 6:
                    management.displayAllStudents();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}