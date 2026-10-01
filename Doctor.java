public class Doctor {
    int doctorId;
    String name;
    String specialization;
    double salary;

    Doctor(int doctorId, String name, String specialization, double salary) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.salary = salary;
    }

    void introduce() {
        System.out.println("Hello, my name is Dr. " + name + ".");
    }

    void work() {
        System.out.println("Dr. " + name + " works in " + specialization + ".");
    }

    void displayInformation() {
        System.out.println("Doctor ID = " + doctorId
                + "\nDoctor name: " + name
                + "\nSpecialization: " + specialization
                + "\nSalary = " + salary);

        System.out.println("____________________________________________________");
    }

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor(3, "Mostafa", "Heart", 10000);
        Doctor doctor2 = new Doctor(4, "Asmaa", "Bones", 2780);
        Doctor doctor3 = new Doctor(6, "Mohamed", "Engine", 1830);

        doctor1.introduce();
        doctor1.work();
        doctor1.displayInformation();

        doctor2.introduce();
        doctor2.work();
        doctor2.displayInformation();

        doctor3.introduce();
        doctor3.work();
        doctor3.displayInformation();
    }
}
