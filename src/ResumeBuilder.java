import java.util.Scanner;

class Resume {
    private String name;
    private String email;
    private String phone;
    private String education;
    private String experience;
    private String skills;

    public Resume(String name, String email, String phone, String education, String experience, String skills) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.education = education;
        this.experience = experience;
        this.skills = skills;
    }

    public void displayResume() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Education: " + education);
        System.out.println("Experience: " + experience);
        System.out.println("Skills: " + skills);
    }
}

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter your education: ");
        String education = scanner.nextLine();

        System.out.print("Enter your experience: ");
        String experience = scanner.nextLine();

        System.out.print("Enter your skills: ");
        String skills = scanner.nextLine();

        Resume resume = new Resume(name, email, phone, education, experience, skills);

        System.out.println("\nGenerated Resume:");
        resume.displayResume();
    }
}
