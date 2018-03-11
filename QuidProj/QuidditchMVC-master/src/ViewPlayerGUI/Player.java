package ViewPlayerGUI;
public class Player extends User{
    
    public Player(String newUsername){
        // 0 id - int
        // should be set by the PlayerList.
        // 1 userName - String
        super.setUserName(newUsername);
        // 2 userFirstName - String
        super.setUserFirstName("");
        // 3 userLastName - String
        super.setUserLastName("");
        // 4 userGender - String
        super.setUserGender("");
        // 5 userEmail - String
        super.setUserEmail("");
        // 6 userPhoneNumber - String
        super.setUserPhoneNumber("");
        // 7 userAddressLine1 - String
        super.setUserAddressLine1("");
        // 8 userAddressLine2 - String
        super.setUserAddressLine2("");
        // 9 userCity - String
        super.setUserCity("");
        // 10 userState - String
        super.setUserState("");
        // 11 userZip - String
        super.setUserZip("");
        // 12 isPlayer - Boolean
        super.setIsPlayer(Boolean.FALSE);
        // 13 isCoach - Boolean
        super.setIsCoach(Boolean.FALSE);
        // 14 isMgmt - Boolean
        super.setIsMgmt(Boolean.FALSE);
    }
}

    