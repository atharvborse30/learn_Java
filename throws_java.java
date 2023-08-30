import java.io.*;
public class throws_java {
    //declaring the type of exception
    public static void findFile() throws IOException {
        //code that may generate IOException
        File newFile = new File("tes.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args){
        try {
            findFile();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
