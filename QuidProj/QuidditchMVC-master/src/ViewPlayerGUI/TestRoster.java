package QuidditchCoachView;

import java.io.IOException;
import java.util.HashMap;

public class TestRoster{
    public static void main(String[] args) throws IOException {
        //HashMap<Integer,Player> Roster = new HashMap<Integer,Player>();
        //HashMap<Integer,Team> Teams = new HashMap<Integer,Team>();
            
        String Test = "Test";
        String userName = "mfreeman0";
        String userName2 = "arobertson1";
        QuidditchTeams RavenClaw = new QuidditchTeams();
        //Team team = new Team();
        //Player mfreeman0
        RavenClaw.createRoster(Test, userName);
        
        System.out.println(RavenClaw.Teams.isEmpty());
        
//        RavenClaw.createRoster(Test, userName2);
        //System.out.println(RavenClaw.Teams.values().toString());
        //RavenClaw.deleteRoster();
        
        
        

    }

}