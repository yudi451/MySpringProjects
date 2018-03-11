package QuidditchCoachView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
//import java.util.Map;
//import java.util.Objects;

public class QuidditchTeams{
        HashMap<Integer,Team> Teams;
        HashMap<Integer,Player> Roster;
        Team t;
        Player newP;
        int playerRosterID;
        //String team;
        //String name;

        
        // get teamID from teamname
    public int getIDFromTeamName(String TeamName){
        for (HashMap.Entry<Integer,Team> entry : this.Teams.entrySet()){
            if(Objects.equals(TeamName, entry.getValue().getTeamID())){
                return entry.getKey();
            }
            else{
//                returns -1 if username is not found
                return -1;
            }
        
        }
        
        return -1; 
    }
        
        
        // This creates a new roster
    public void createRoster(String tName, String uName) throws IOException{
        Teams = new HashMap<>();
        //Roster = new HashMap<>();
        //String [] TeamInfo;
        String teamName = tName;
        String userName = uName;
        
        t = new Team(teamName, Roster);
        //t.setTeamID(TeamID);
        t.setCoachID(t.TeamID);
        t.setTeamName(teamName);
        //t.setTeamSize(t.getRoster().size());
        Teams.put(t.TeamID, t);
        t.TeamID++;
        Roster = new HashMap<Integer, Player>();  
        
        String PlayerPosition = " "; 
        PlayerList playList = new PlayerList();
        
        
        // Find new player's username
        Player newP = new Player(userName);
        // get the ID to player
        playList.getIDFromUsername(userName);
        // give this player a position
        PlayerPosition = "Seeker";
        t.addUser(newP, PlayerPosition);
        // TeamID = null;
        // add this player to the roster hashmap
        Roster.put(playerRosterID, newP);
        
        
        
        // This is a test to see who is in the roster
        System.out.println("roster is " + Roster.get(0).getUserName() + "\n");
        //System.out.println("roster is " + Roster.get(1).getUserName());
        //System.out.println("roster is " + t.getRoster());
        Iterator<Team> it = Teams.values().iterator();
        Team teamIterator;
        while (it.hasNext()){
            teamIterator = it.next();
            System.out.println(teamIterator);
            //Iterator<Player> itt = teamIterator.getRoster().values().iterator();
            //while (itt.hasNext()){
                //System.out.println(itt.next());
            }
        }
    
    public void addMorePlayers(String tName, String uName, String PlayerPosition){
        Teams = new HashMap<>();
        String teamName = tName;
        String userName = uName;
        String Position = PlayerPosition;
        
        Teams.getIDFromTeamName(t);
        
        
        // add player to roster
        Player newP = new Player(userName);
        t.addUser(newP, Position);
        Roster.put(playerRosterID, newP);
        
    }
        

}
        
        

        
