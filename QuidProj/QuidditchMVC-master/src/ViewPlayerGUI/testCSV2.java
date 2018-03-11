package ViewPlayerGUI;

import java.io.IOException;

public class testCSV2{

    public static void main(String[] args) throws IOException {
        
        UserList initPlayerList = new UserList();
        initPlayerList.addNewUser("jrobins2");
        initPlayerList.writeListToCSV();
    }

}