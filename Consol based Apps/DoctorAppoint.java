import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Visitor {
    private String name;
    private int age;
    private String phoneNumber;
    private String appointmentDate;
    private String appointmentTimeSlot;

    public Visitor(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter methods for appointment details
    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTimeSlot() {
        return appointmentTimeSlot;
    }

    public void setAppointmentTimeSlot(String appointmentTimeSlot) {
        this.appointmentTimeSlot = appointmentTimeSlot;
    }

    // Other getters and setters for name, age, phoneNumber
    // ...

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Phone: " + phoneNumber +
               " | Appointment: " + appointmentDate + " " + appointmentTimeSlot;
    }

    public String getName() {
        return null;
    }
}

class Clinic {
    private List<Visitor> visitors;
    private Map<String, List<String>> appointmentSchedule;

    public Clinic() {
        visitors = new ArrayList<>();
        appointmentSchedule = new HashMap<>();
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void bookAppointment(Visitor visitor, String date, String timeSlot) {
        visitor.setAppointmentDate(date);
        visitor.setAppointmentTimeSlot(timeSlot);

        appointmentSchedule.computeIfAbsent(date, k -> new ArrayList<>()).add(visitor.getName());
    }

    // Other methods for editing, canceling appointments, etc.
    // ...

    public void printVisitorsList() {
        for (Visitor visitor : visitors) {
            System.out.println(visitor);
        }
    }

    public void printAppointmentSchedule(String date) {
        List<String> appointments = appointmentSchedule.get(date);
        if (appointments != null) {
            System.out.println("Appointment Schedule for " + date);
            for (String visitorName : appointments) {
                System.out.println(visitorName);
            }
        } else {
            System.out.println("No appointments for " + date);
        }
    }

    public Visitor[] getVisitors() {
        return null;
    }

    public boolean isTimeSlotAvailable(String date, String bookTimeSlot) {
        return false;
    }
}

public class DoctorAppoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clinic clinic = new Clinic();

        while (true) {
            System.out.println("\nWelcome to the Small Clinic Appointment Management System");
            System.out.println("1. View Visitors List");
            System.out.println("2. Add New Visitor");
            System.out.println("3. View Appointment Schedule for a Day");
            System.out.println("4. Book an Appointment");
            System.out.println("5. Exit");

            System.out.print("\nPlease enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    clinic.printVisitorsList();
                    break;
                case 2:
                    System.out.print("Enter Visitor's Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Visitor's Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Visitor's Phone Number: ");
                    String phoneNumber = scanner.nextLine();

                    Visitor newVisitor = new Visitor(name, age, phoneNumber);
                    clinic.addVisitor(newVisitor);

                    System.out.print("Select Appointment Date (DD-MM-YYYY): ");
                    String date = scanner.nextLine();
                    System.out.println("Available Time Slots:\n1. 09:00 AM - 10:00 AM\n2. 11:00 AM - 12:00 PM");
                    System.out.print("Select Time Slot: ");
                    int timeSlotChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    String timeSlot = (timeSlotChoice == 1) ? "09:00 AM - 10:00 AM" : "11:00 AM - 12:00 PM";
                    clinic.bookAppointment(newVisitor, date, timeSlot);

                    System.out.println("Visitor " + name + "'s appointment on " + date + " at " + timeSlot + " has been booked.");
                    break;
                case 3:
                    System.out.print("Enter Appointment Date (DD-MM-YYYY): ");
                    String viewDate = scanner.nextLine();
                    clinic.printAppointmentSchedule(viewDate);
                    break;
                    case 4:
                    System.out.print("Enter Visitor's Name: ");
                    String visitorName = scanner.nextLine();
                
                    Visitor foundVisitor = null;
                    for (Visitor visitor : clinic.getVisitors()) {
                        if (visitor.getName().equalsIgnoreCase(visitorName)) {
                            foundVisitor = visitor;
                            break;
                        }
                    }
                
                    if (foundVisitor == null) {
                        System.out.println("Visitor not found.");
                        break;
                    }
                
                    System.out.print("Select Appointment Date (DD-MM-YYYY): ");
                    String bookDate = scanner.nextLine();
                
                    System.out.println("Available Time Slots:\n1. 09:00 AM - 10:00 AM\n2. 11:00 AM - 12:00 PM");
                    System.out.print("Select Time Slot: ");
                    int bookTimeSlotChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                
                    String bookTimeSlot = (bookTimeSlotChoice == 1) ? "09:00 AM - 10:00 AM" : "11:00 AM - 12:00 PM";
                
                    if (clinic.isTimeSlotAvailable(bookDate, bookTimeSlot)) {
                        clinic.bookAppointment(foundVisitor, bookDate, bookTimeSlot);
                        System.out.println("Visitor " + visitorName + "'s appointment on " + bookDate + " at " + bookTimeSlot + " has been booked.");
                    } else {
                        System.out.println("Selected time slot is not available.");
                    }
                
                    break;
                    
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
