import java.io.*;
import java.security.Timestamp;
import java.util.Date;

public class RecordFile {

Date date = new Date();
    public  void writingToFile(String n){
        File file = new File("test.txt");
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(date.toString() + "\n");
            writer.write(n + "\n" );
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public  void readFile(){
        try {
            BufferedReader br = null;
            br = new BufferedReader(new FileReader("test.txt"));
            String line;
            while ((line = br.readLine()) !=null){

                System.out.println(line);

            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
