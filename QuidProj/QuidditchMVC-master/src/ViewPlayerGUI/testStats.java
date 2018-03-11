package ViewPlayerGUI;

import java.io.IOException;

public class testStats{
    public static void main(String[] args) throws IOException {
        PlayerStatsList testingStats = new PlayerStatsList();
        
        
        System.out.println("testingStats = \n" + testingStats);
        testingStats.writePlayerStatsListToCSV();
}
}