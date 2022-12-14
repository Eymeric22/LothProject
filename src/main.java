import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.jar.JarFile;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        JFileChooser select = new JFileChooser("D:\\IntelliJ\\Workspace\\LothProject");
        select.showOpenDialog(null);
        System.out.println(FunctionFile.randomize(FunctionFile.readFile(select.getSelectedFile()), 5));
        //FunctionFile.readFile(select.getSelectedFile());
    }
}
