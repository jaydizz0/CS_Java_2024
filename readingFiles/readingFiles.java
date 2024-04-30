package readingFiles;
import java.util.*;
import java.io.File;  
import java.io.FileNotFoundException;

public class readingFiles {
    public static void main(String[] args){
        ArrayList<Character> letterList = new ArrayList<>();
        try{
            File fileObj = new File("readThis.txt");
            Scanner fileReader = new Scanner(fileObj);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                for (int i = 0; i < data.length(); i++) {
                    char letter = data.charAt(i);
                    if (Character.isLetter(letter)) {
                        letterList.add(Character.toLowerCase(letter));
                    }
                }
            }
            fileReader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An error occurred.");
        }

        int letterCount = letterList.size();
        System.out.println("Number of letters: " + letterCount); 
    }
}

