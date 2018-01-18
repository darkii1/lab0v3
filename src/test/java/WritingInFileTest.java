import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class WritingInFileTest {

    @Test
    public void writel() {
        String expected = "aa";
        String actual ="";
        File myFile = new File("text.txt");
        WritingInFile.writel("aa", myFile);
        WritingInFile.writel("aa", myFile);
        try
        {
            FileReader reader = new FileReader(myFile);
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                actual += (char)c;
                // System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        assertEquals("Перезапись прошла успешно", expected, actual);
    }
}