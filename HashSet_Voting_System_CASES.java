import java.util.*;
public class HashSet_Voting_System_CASES {

        public static void main(String[] args) {

            Set<String> votes = new HashSet<>();
            Scanner scanner = new Scanner(System.in);
            String choice;

            do {
                System.out.print("\nVoting System Menu:\n\n\t1.Cast a vote\n\t2.Count a vote\n\t3.Display vote count\n\t4.Exit\n\nEnter your choice: ");
                choice = scanner.nextLine();
                scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.print("Enter the candidate's name: ");
                        String candidateName = scanner.nextLine();
                        votes.add(candidateName);
                        System.out.println("Vote casted for " + candidateName + ".");
                        break;
                    case "2":
                        int totalVotes = votes.size();
                        System.out.println("Total votes: " + totalVotes);
                        break;
                    case "3":
                        System.out.println("Vote count for each candidate: ");
                        for (String candidate : votes) {
                            int candidateVotes = 0;
                            for (String vote : votes) {
                                if (vote.equals(candidate)) {
                                    candidateVotes++;
                                }
                            }
                            System.out.println(candidate + ": " + candidateVotes + "Votes");
                        }
                        break;

                    case "4":
                        System.out.println("Thank you for your session!");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
            while (choice == "4");
            scanner.close();
        }
    }