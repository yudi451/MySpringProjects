package ViewPlayerGUI;

import java.io.FileReader;
import java.io.FileWriter;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
//import java.util.Iterator;
import java.util.Objects;
//import java.util.Set;


public class PlayerList{
    private HashMap<Integer,Player> PlayerListMap;
//    these next three strings allow for centralized management of the file paths.
//    eventually, the sourcePath and destinationPath will be the same.
//    the first one just refers to the fact that the files are contained in the root directory of the project
    private final String fileDirectory = ".\\";
    private final String sourcePath = "playerListSmall.csv";
//    private final String destinationPath = "output.csv";
    private final String destinationPath = sourcePath;
    
    
    public PlayerList() throws FileNotFoundException, IOException{
        this.PlayerListMap = new HashMap<>();
        CSVReader reader = new CSVReader(new FileReader(fileDirectory + sourcePath));
        String [] nextLine;
        reader.readNext(); //skip the header line.
        while ((nextLine = reader.readNext()) != null) {
            int newID = Integer.parseInt(nextLine[0]);
            Player AddPlayer = new Player(nextLine[1]);
            AddPlayer.setID(newID);
            AddPlayer.setUserFirstName(nextLine[2]);
            AddPlayer.setUserLastName(nextLine[3]);
            AddPlayer.setUserGender(nextLine[4]);
            AddPlayer.setUserEmail(nextLine[5]);
            AddPlayer.setUserPhoneNumber(nextLine[6]);
            AddPlayer.setUserAddressLine1(nextLine[7]);
            AddPlayer.setUserAddressLine2(nextLine[8]);
            AddPlayer.setUserCity(nextLine[9]);
            AddPlayer.setUserState(nextLine[10]);
            AddPlayer.setUserZip(nextLine[11]);
            AddPlayer.setIsPlayer(Boolean.parseBoolean(nextLine[12]));
            AddPlayer.setIsCoach(Boolean.parseBoolean(nextLine[13]));
            AddPlayer.setIsMgmt(Boolean.parseBoolean(nextLine[14]));
            
            PlayerListMap.put(newID,AddPlayer);
    
        }
    }
    
    
    public String getUsernameFromID(int userID){
        if (this.PlayerListMap.get(userID) != null) {
           return this.PlayerListMap.get(userID).getUserName(); 
        }
        else{
            return "";
        }
    }
    
    public int getIDFromUsername(String username){
        for (Map.Entry<Integer,Player> entry : this.PlayerListMap.entrySet()){
            if(Objects.equals(username.toUpperCase(), entry.getValue().getUserName().toUpperCase())){
                return entry.getKey();
            }        
        }
    return -1; 
    }
    public int getNewMaxID(){
        int maxKey = 1;
        while(this.PlayerListMap.containsKey(maxKey)){
            maxKey++;
        }
        return maxKey;
        
    }
    public boolean addNewPlayer(String username){
//        this checks first to verify that a username is not being used before adding one.
        if(this.getIDFromUsername(username) == -1){
            Player newPlayer = new Player(username);
            int newPlayerID = this.getNewMaxID();
            newPlayer.setID(newPlayerID);

            this.PlayerListMap.put(newPlayerID,newPlayer);

            return true;
        }
//        if a username is found, it returns false
        else{
            return false;
        }
    }
    public Player getPlayerFromID(int playerID){
//        returns an entire player object via the ID, as opposed to the above methods
//        who only return a username or an id.
//        this gives public access to the hashMap values.
        return this.PlayerListMap.get(playerID);
    }
    
    public HashMap<Integer, Player> getUserMap(){
//        this is necessary to allow access to the HashMap iterators, etc.
        return this.PlayerListMap;
    }
    
    public boolean writeListToCSV() throws FileNotFoundException, IOException{
        try (CSVWriter writer = new CSVWriter(new FileWriter(fileDirectory + destinationPath))) {
            String [] firstLine = "id,userName,userFirstName,userLastName,userGender,userEmail,userPhoneNumber,userAddressLine1,userAddressLine2,userCity,userState,userZip,isPlayer,isCoach,isMgmt".split(",");
            writer.writeNext(firstLine);
            for (Map.Entry<Integer, Player> userEntry : this.getUserMap().entrySet())
            {
                writer.writeNext(userEntry.getValue().toStringArray());
            }
            return true;
        }
        
    }
}
