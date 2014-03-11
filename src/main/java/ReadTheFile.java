import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leng on 7/03/2014.
 */

public class ReadTheFile {

//Rob Do it     //ok
    public List<String> readTheFile(){
        List<String> result=new ArrayList<String>();

        try {
            BufferedReader in = new BufferedReader(new FileReader("/Users/user/Desktop/GitProjects/MarsRover/src/main/resources/note.txt"));
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
