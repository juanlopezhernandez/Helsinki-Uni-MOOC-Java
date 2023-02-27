
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList storage = new ArrayList<>();//would of been of used w/ a method
        int count = 0;
        int wins = 0;
        int loss = 0;
        System.out.println("File:");
        String userFile = scan.nextLine();
        
        System.out.println("Team:");
        String userTeam = scan.nextLine();
        
        try(Scanner requested = new Scanner (Paths.get(userFile)) ){
            while (requested.hasNext()){
                String requestedContent = requested.nextLine();
                //System.out.println(requestedContent);
               
                String [] parts = requestedContent.split(",");
                String home = parts[0];
                String away = parts [1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);
                
                if (userTeam.equals(home)) {
                    count++;                    
                    if (homeScore > awayScore ) {
                        wins++;
                    } else {
                        loss++;
                    }                    
                    continue;                   
                }
                
                if ( userTeam.equals(away)) {
                    count++;
                    if (homeScore > awayScore ) {
                        loss++;
                    } else {
                        wins++;
                    }                    
                    continue;                   
                }
                
                if (requestedContent.isEmpty()){
                    break;
                }                
            } 
            
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loss);
        } catch (Exception e) {
            
        }
        

    }

}
