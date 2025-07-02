
import java.util.*;

public class tut28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int votes[] = new int[4];
        int totalVoters, Choice;
        String password = "pass";
        int attempts = 3;
        String inputPass;

        System.out.print("Please enter your name : ");
        String userName = sc.nextLine();

        System.out.print("Please enter your age : ");
        int userAge = sc.nextInt();
        if (userAge >= 18) {
            System.out.println("You are able to vote");

        do {
            System.out.print("Enter admin password : ");
            inputPass = sc.next();
            if (inputPass.equals(password)) {
                System.out.println("LOgin successful!\n");
                break;
            } else {
                attempts--;
                System.out.print("Incorrect password, Attempts left : " + attempts);
            }
        } while (attempts > 0);

        if (attempts == 0) {
            System.out.print("Too many failed attempts. Exiting from the system.....");
            return;
        }

        System.out.print("Enter number of voters : ");
        totalVoters = sc.nextInt();

        int voterCount = 1;

        while (voterCount <= totalVoters) {
            System.out.println(" Voter # " + voterCount);
            System.out.println("1. Ansh Janta Party");
            System.out.println("2. Sarvgya Political Party");
            System.out.println("3. Aayush Thakur Party");
            System.out.println("4. Varnit National Party");
            System.out.println("Enter your vote (1-4) : ");
            Choice = sc.nextInt();

            switch (Choice) {
                case 1:
                    votes[0]++;
                    break;

                case 2:
                    votes[1]++;
                    break;

                case 3:
                    votes[2]++;
                    break;

                case 4:
                    votes[3]++;
                    break;

                default:
                    System.out.println("Invalid choice. Vote not conted.");
                    continue;
            }
            voterCount++;
        }

        System.out.println("----- Voting Results -----");
        String[] candidates = {" Ansh Janta Party ", " Sarvgya Political Party ", " Aayush Thakur Party ", " Varnit National Party "};
        for (int i = 0; i < votes.length; i++) {
            System.out.println(candidates[i] + ":" + votes[i] + " votes");
        }
        int maxVotes = votes[0];
        int winnerIndex = 0;
        for (int i = 1; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winnerIndex = i;
            }
        }
        int count = 0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] == maxVotes) {
                count++;
            }
        }

        System.out.println("------ Result ------");
        if (count > 1) {
            System.out.println("It's a tie");
        } else {
            System.out.println("Winner : " + candidates[winnerIndex]);
        } 
        }
        else {
            System.out.println("You are not able to vote, system is Exiting.....");
            }
     }
}