package ModelPlayerData;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PlayerData{
    String filePath = "E:\\playerFile.txt";
    public String getPlayerData() throws FileNotFoundException, IOException{
     String playerFileData ="";
     
     if(!(new File(filePath).isFile())){
         Files.createFile(Paths.get(filePath));
     }
     
     try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))){
         StringBuilder fileString = new StringBuilder();
         String fileLine = fileReader.readLine();
         while(fileLine != null){
             fileString.append(fileLine);
             fileString.append(';');
//             still putting stuff here. need to research CSV import
         
         }
     
     }
     
     return playerFileData;
    }
    
    public boolean writePlayerData(String playerFileData) throws FileNotFoundException, IOException{
    
        return false;
    }

}