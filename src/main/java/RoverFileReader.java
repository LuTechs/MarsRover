import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: Mars Rover Version: 1.0
 * Created by Leng and Rob on 7/03/2014.
 */

/**
 * This class is used to transfer te strings from the read document into an array list.
 * It will ensure errors are taken into account using exceptions.
 * The list is then returned.
 */
public class RoverFileReader {

    //Reading Input From File
    public List<String> read(){
        List<String> result=new ArrayList<String>();

        try {
            String workingDir = System.getProperty("user.dir");
            BufferedReader in = new BufferedReader(new FileReader(workingDir+"/src/main/resources/note.txt"));
            String line;
            while ((line=in.readLine() )!= null){
              result.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return  result;


    }


}
//
//
//public class RoverNetworkPortReader implements RoverReader {
//    public List<String> read() {
//        return null;
//    }
//}
//
//public interface RoverReader {
//    public List<String> read();
//}