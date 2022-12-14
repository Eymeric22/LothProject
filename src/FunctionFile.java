import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FunctionFile {
    public static List<String> readFile(File toRead) throws FileNotFoundException {
        String mot = "";
        Scanner reader = new Scanner(toRead).useDelimiter("\\p{Z}");
        List<String> result = new ArrayList<String>();
        // while loop
        while (reader.hasNext()) {
            // find next line
            mot = reader.next();
            result.add(mot);
        }
        reader.close();
        /*for (String s: result
             ) {
            System.out.print(s);
        }
        ;*/
        return result;
    }
    public static String randomize(List<String> list, int number){
        String proverb = "";

        for(int i = 0; i<number;i++){
            Random rand = new Random();
            proverb = proverb +" " + list.get(rand.nextInt(list.size()));
        }
        return proverb;
    }
}
