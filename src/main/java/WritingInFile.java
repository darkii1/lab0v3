import  java.io.*;

public class WritingInFile {

    public static void main(String[] args) {

    }
    public static void writel(String line, File myFile)
    {
        String input = line;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile,false));
            writer.write(input);
            writer.flush();
            writer.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
