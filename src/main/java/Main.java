import java.util.List;

/**
 * Project: Mars Rover Version: 1.0
 * Created by Leng and Rob on 7/03/2014.
 */

/**
 * Main Class. Used as the initializer of the program.
 * The file reader is created here, which is followed by the rover.
 * Each action of the rover is called from here.
 */
public class Main {

    public static void main(String args[]){

        List<String> inputList;

        ReadTheFile f=new ReadTheFile();
        inputList = f.readTheFile();

        Rover r=new Rover();

        for(int x = 0; x < inputList.size(); x++){
            if(x == 0){
                r.setCoordinate(Integer.parseInt(inputList.get(x).charAt(0)+""),Integer.parseInt( inputList.get(x).charAt(2)+""));
            }else if((x % 2 )== 1){
                r.setPosition(Integer.parseInt(inputList.get(x).charAt(0)+""), Integer.parseInt(inputList.get(x).charAt(2)+""), inputList.get(x).charAt(4));
            } else{
                r.setInstruction(inputList.get(x));
                r.printResult();
            }

        }

    }
}
