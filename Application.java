import java.util.Scanner;

public class Application {
    public static String name;     //    we store the important info taken from the applicant
    public static byte age;        //    for the further use/ analise by the 'children' classes;
    public static byte lengthOfNonSupported;


    public static void main(String[] args) {

        String stud = "student";
        String work = "worker";
        String unemp = "unemployed";

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDear applicant, we are happy to help you with your application!" +
                "\nAccording to the procedure we need some information from you" +
                "\n\t\t\t\tIt won't take a long time\n\nPlease, enter your name? ");

        name = scanner.nextLine();
        System.out.println("Thank you, " + name);

        System.out.print("\nWhat is your age? (in years): ");
        age = scanner.nextByte();

        System.out.print("Thank you\n\nPlease, let us know how long (in years) you haven't " +
                "been \ngetting an additional support from the government.\nYou are currently getting a support, enter '0': ");
        lengthOfNonSupported = scanner.nextByte();

        System.out.print("\nPlease, enter also your current status\n(student, worker or unemployed): ");
        String status = scanner.nextLine();
        status = scanner.nextLine();

        boolean istStudent = (status.equals(stud));
        boolean istWorker = (status.equals(work));
        boolean istUnemployed = (status.equals(unemp));
        boolean istPerson = (istStudent || istWorker || istUnemployed);

        String result = (istStudent) ? "" : (istWorker) ? "" : (istUnemployed) ? "" : "";
        System.out.println(result);

        if (!istPerson) {
            while (!istPerson) {
                System.out.print("\nPlease, enter one of the statements\n(student, worker or unemployed): ");
                status = scanner.nextLine();

                if (status.equals(stud)) {
                    break;
                }

                if (status.equals(work)) {
                    break;
                }

                if (status.equals(unemp)) {
                    break;
                }
            }
        }

        Student inStud = new Student();        // we link to appropriate class to continue gathering
        Worker inWork = new Worker();          // additional information with an outcome for the applicant;
        Unemployed inUnemp = new Unemployed();

        if (status.equals(stud)){
        inStud.eligibility();}
        if (status.equals(work)){
            inWork.eligibility();
        }if (status.equals(unemp)){
            inUnemp.eligibility();
        }
    }
}

class Student extends Application {
public static String addIncomeStudentStatus;
    void eligibility() {
        Scanner scanner = new Scanner(System.in);

                               //  we take the condition of the grade (from '1' to '5');
        System.out.print("Please, enter your current grade (from '1' to '5'): ");
        byte grade = scanner.nextByte();

        if (grade >= 1 && grade <= 5){
            System.out.println(name + ", thank you very much.\n");
        }
        if (grade < 1 || grade > 5){
            while (grade < 1 || grade >5){
                System.out.print("Please, enter a valid grade, i.e. from '1' to '5': ");
                grade = scanner.nextByte();
                if (grade >= 1 && grade <= 5){
                    System.out.println(name + ", thank you very much.\n");
                }
            }
        }
                              // we take info about an additional income 'yes' or 'not';
        System.out.print("Are you having an extra " +
                "income besides the scholarship?\n");
        String incomeStudent = scanner.nextLine();
        String yes = "yes";
        String not = "not";
        boolean istYes = (incomeStudent.equals(yes));
        boolean istNot = (incomeStudent.equals(not));
        boolean istPass = (istYes || istNot);

        if (istPass) {
            System.out.println("Thank you for your response");
        }
        if (!istPass){
            while (!istPass){
                System.out.print("Please, enter 'yes' or 'not': ");
                incomeStudent = scanner.nextLine();
                if (incomeStudent.equals(yes) || incomeStudent.equals(not)){
                    System.out.println("Thank you for your response");
                    break;
                }
            }
        }
        System.out.println("\nDear " + name + ", you have informed us that you are " + age + " years old." +
                "\nYou are currently a student at the " + grade + " grade. And "
                + incomeStudent + " having an additional income besides the income from the scholarship");
    }
}

class Worker extends Application {
    void eligibility (){

    }

}

class Unemployed extends Application {
    void eligibility (){

    }
}
