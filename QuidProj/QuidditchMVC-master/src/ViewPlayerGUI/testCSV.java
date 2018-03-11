package ViewPlayerGUI;

import java.io.IOException;

public class testCSV{

    public static void main(String[] args) throws IOException {
        
        UserList initPlayerList = new UserList();
        
        System.out.println("initPlayerList.getUsernameFromID(3) = " + initPlayerList.getUsernameFromID(3));
        System.out.println("initPlayerList.getIDFromUsername(\"ahudsonf\") = " + initPlayerList.getIDFromUsername("ahudsonf"));
        System.out.println("initPlayerList.getIDFromUsername(\"egibson3\") = " + initPlayerList.getIDFromUsername("egibson3"));
        System.out.println("initPlayerList.getNewMaxID() = " + initPlayerList.getNewMaxID());
        int maxID = initPlayerList.getNewMaxID();
        System.out.println("maxID = " + maxID);
        System.out.println("initPlayerList.getIDFromUsername(\"jrobins2\") = " + initPlayerList.getIDFromUsername("jrobins2"));
        initPlayerList.addNewUser("jrobins2");
        System.out.println("initPlayerList.getUsernameFromID(maxID) = " + initPlayerList.getUsernameFromID(maxID));
        maxID = initPlayerList.getNewMaxID();
        System.out.println("maxID = " + maxID);
        initPlayerList.addNewUser("wmjones3");
        System.out.println("initPlayerList.getUsernameFromID(maxID) = " + initPlayerList.getUsernameFromID(maxID));
        maxID = initPlayerList.getNewMaxID();
        System.out.println("maxID = " + maxID);
        initPlayerList.getUserFromID(6).setUserCity("Greensboro");
        initPlayerList.getUserFromID(5).setUserGender("F");
        initPlayerList.getUserFromID(5).setIsPlayer(Boolean.TRUE);
        
        
        initPlayerList.writeListToCSV();
    }

}