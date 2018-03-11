package ViewPlayerGUI;
public class test{
    public static void main(String[] args) {
        User jmsmith = new User("jmsmith");
        User ajjones = new User("ajjones");        
        User wmtucker = new User("wmtucker");        
        User jjjames = new User("jjjames");        
        User pnparker = new User("pnparker");        
        User erbrock = new User("erbrock");        
        User kdlittle = new User("kdlittle");        
        User bdchurch = new User("bdchurch");
                
        Roster rosterOne = new Roster(12345);
        System.out.println("adding player 1");
        rosterOne.addUser(jmsmith,"Beater");
        System.out.println("rosterOne.getTeamsize() = " + rosterOne.getTeamSize());
        
        System.out.println("adding player 2");
        rosterOne.addUser(ajjones,"Beater");
        System.out.println("rosterOne.getTeamsize() = " + rosterOne.getTeamSize());
        
        System.out.println("adding player 3");
        rosterOne.addUser(wmtucker,"seeker");
        System.out.println("rosterOne.getTeamsize() = " + rosterOne.getTeamSize());
        
        System.out.println("adding player 4");
        rosterOne.addUser(pnparker,"chaser");
        System.out.println("rosterOne.getTeamsize() = " + rosterOne.getTeamSize());
        
        System.out.println("adding player 5");
        rosterOne.addUser(erbrock,"chaser");
        System.out.println("rosterOne.getTeamsize() = " + rosterOne.getTeamSize());
        
        System.out.println("adding player 6");
        rosterOne.addUser(jjjames,"chaser");
        System.out.println("rosterOne.getTeamsize() = " + rosterOne.getTeamSize());
        
        System.out.println("adding player 7");
        rosterOne.addUser(kdlittle,"keeper");
        System.out.println("rosterOne.getTeamsize() = " + rosterOne.getTeamSize());
        
        System.out.println("adding player 8 (shouldn't get added)");
        rosterOne.addUser(bdchurch,"keeper");
        System.out.println("rosterOne.getTeamsize() = " + rosterOne.getTeamSize());
        System.out.println(rosterOne);
        
    }



}