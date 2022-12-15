import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.jar.JarFile;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        JFileChooser select = new JFileChooser("D:\\IntelliJ\\Workspace\\LothProject");
        select.showOpenDialog(null);
        File f = select.getSelectedFile();
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre de mots voulus dans le proverbe : ");
        int nbMots = sc.nextInt();
        System.out.println("Voici le proverbe : " + FunctionFile.randomize(FunctionFile.readFile(f), nbMots));
        while(nbMots != 0) {
            System.out.println("Entrez le nombre de mots voulus dans le proverbe : ");
            nbMots = sc.nextInt();
            System.out.println("Voici le proverbe : " + FunctionFile.randomize(FunctionFile.readFile(f), nbMots));
        }
            System.out.println("Fin du programme.");
    }
}
