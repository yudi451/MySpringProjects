/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuidditchCoachView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;


/**
 *
 * @author moyockmike
 */
public class Team {
    private HashMap<Integer, Team> Teams;
    HashMap<Integer,Player> Roster;
    private String teamName;

    private final int BeaterNum = 2;
    private final int ChaserNum = 3;
    
    public int TeamID;
    public int CoachID;
    private User[] BeaterList = new User[BeaterNum];
    private User[] ChaserList = new User[ChaserNum];
    private User Seeker;
    private User Keeper;
    private int EventID;
    private int TeamSize;
    
    
    public Team(){
        
    }
    
    public Team(int EventIDNum) {
        this.TeamID = 0;        
        this.CoachID = 0;
        this.EventID = EventIDNum;
        this.TeamSize = 0;
        for (int i = 0; i < BeaterNum; i++) {
            this.BeaterList[i] = null;
        }
        for (int i = 0; i < ChaserNum; i++) {
            this.ChaserList[i] = null;
        }
        this.Seeker = null;
        this.Keeper = null;

    }
    
    public Team(String tName, HashMap<Integer,Player> floatroster){
        setRoster(floatroster);
        teamName = tName;
        //TeamID = teamID;
    }
    
    public void setRoster(HashMap<Integer,Player> floatroster){
        Roster = floatroster;
    }
    
    public HashMap<Integer, Player> getRoster(){
        return Roster;
    }
    public int getTeamID() {
        return TeamID;
    }
    public void setTeamID(int TeamID) {
        this.TeamID = TeamID;
    }
    
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    public int getCoachID() {
        return CoachID;
    }

    public void setCoachID(int CoachId) {
        this.CoachID = CoachId;
    }
    
    public int getTeamSize() {
        return TeamSize;
    }
    public void setTeamSize(int TeamSize) {
        this.TeamSize = TeamSize;
    }


    

    public int getEventID() {
        return EventID;
    }
    
//    public String getTeamIDfromTeamName(String TeamName){
//        return this.Teams.get(userID).getUserName();
//    }
    
    
    
    public boolean addUser(Player NewPlayer, String PlayerPosition) {
        PlayerPosition = PlayerPosition.toUpperCase();
        switch (PlayerPosition) {
            case "BEATER":
                for (int i = 0; i < BeaterNum; i++) {
                    if (this.BeaterList[i] == null) {
                        this.BeaterList[i] = NewPlayer;
                        this.TeamSize++;
                        return true;
                    }
                }
                return false;
            case "CHASER":
                for (int i = 0; i < ChaserNum; i++) {
                    if (this.ChaserList[i] == null) {
                        this.ChaserList[i] = NewPlayer;
                        this.TeamSize++;
                        return true;
                    }
                }
                return false;
            case "SEEKER":
                if (this.Seeker == null) {
                    this.Seeker = NewPlayer;
                    this.TeamSize++;
                    return true;
                }
                return false;
            case "KEEPER":
                if (this.Keeper == null) {
                    this.Keeper = NewPlayer;
                    this.TeamSize++;
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < BeaterNum; i++) {
            result += "BEATER" + (i + 1) + ":\t";
            if (this.BeaterList[i] == null) {
                result += "<empty>\n";
            } else {
                result += this.BeaterList[i].getUserName() + "\n";
            }
        }
        for (int i = 0; i < ChaserNum; i++) {
            result += "CHASER" + (i + 1) + ":\t";
            if (this.ChaserList[i] == null) {
                result += "<empty>\n";
            } else {
                result += this.ChaserList[i].getUserName() + "\n";
            }
        }
        result += "SEEKER:\t";
        if (this.Seeker == null) {
            result += "<empty>\n";
        } else {
            result += this.Seeker.getUserName() + " \n";
        }
        result += "KEEPER:\t";
        if (this.Keeper == null) {
            result += "<empty>\n";
        } else {
            result += this.Keeper.getUserName() + "\n";
        }

        return result;
    }
    
    
    public String lookupPlayer(int n){
        if (!Roster.containsKey(n)){
            System.out.println("No player with number " + n + " is on the roster for the " + teamName);
            return null;
        }
        else{
            return Roster.values().toString();
        }
    }
    
    


    
    // This creates a new roster
//    public void createRoster(String tName, String uName) throws IOException{
//        Roster = new HashMap<>();
//        String teamName = tName;
//        String userName = uName;
//        String PlayerPosition = null; 
//        PlayerList playList = new PlayerList();
//        Player newP = null;
//        
//        // Find new player's username
//        //userName = addNewPlayer.getUserName();
//        newP = new Player(userName);
//        // get the ID to player
//        playList.getIDFromUsername(userName);
//        // give this player a position
//        PlayerPosition = "Seeker";
//        addUser(newP, PlayerPosition);
//        // add this player to the roster hashmap
//        Roster.put(TeamID, newP);
//        
//        
//        // This is a test to see who is in the roster
//        System.out.println("roster is " + Roster.get(0).getUserName());
//        System.out.println("roster is " + getRoster().values().size());
//        
//        
//
//    }
    
    //this deletes the roster 
    public void deleteRoster(){
        Roster.clear();
        System.out.println("The Roster size is now " + getRoster().size());
    }
    
    // This allows a user to edit the roster in some way
//    public void editRoster(){
//        
//    }
}
