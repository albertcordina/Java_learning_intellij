import java.util.*;
public class HashSet_Voting_System_CASES {

        public static void main(String[] args) {

            Set<String> votes = new HashSet<>();
            Scanner scanner = new Scanner(System.in);
            String choice;

            do {
                System.out.print("\nVoting System Menu:\n\n\t1.Cast a vote\n\t" +
                        "2.Count a vote\n\t3.Display vote count\n\t4.Exit\n\nEnter your choice: ");
                choice = scanner.nextLine();
              //  scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.print("Enter the candidate's name: ");
                        String candidateName = scanner.nextLine();

                        System.out.println("Vote casted for " + candidateName + ".");
                        votes.add(candidateName);       //  the method 'add' is to add a new element/ candidate's name into the 'HashSet';
                        break;

                    case "2":
                        int totalVotes = votes.size(); //  the method 'size' is to get the number of all elements/ votes in the 'HashSet';
                        System.out.println("Total votes: " + totalVotes);
                        break;

                    case "3": // it doesn't work with the 'HashSet', because it does not store duplicate candidate's name entered for voting;
                        System.out.println("Vote count for each candidate: ");
                        for (String candidate : votes) {  //  iterate the whole 'HashSet' for candidates;
                            int candidateVotes = 0;       //  create 'int' with the '0' count of votes;
                            for (String vote : votes) {
                                if (vote.equals(candidate)) { //
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
            while (!choice.equals("4"));
            scanner.close();
        }
    }
 /*
                  the 'toLowerCase()' method IGNORES THE SIZE OF THE INPUT LETTERS:
 if (.... .toLowerCase().contains("...")) { System.out.println("The text contain this word ...");}

  */
