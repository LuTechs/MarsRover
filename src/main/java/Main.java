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

        RoverFileReader roverFileReader=new RoverFileReader();
        inputList = roverFileReader.read();

        Rover rover=new Rover();

        for(int x = 0; x < inputList.size(); x++){
            // r = new Rover(inputList[i], inputList[i+1])
            // r.move()
            if(x == 0){
                rover.setCoordinate(Integer.parseInt(inputList.get(x).charAt(0) + ""), Integer.parseInt(inputList.get(x).charAt(2) + ""));
            }else if((x % 2 )== 1){
                rover.setPosition(Integer.parseInt(inputList.get(x).charAt(0) + ""), Integer.parseInt(inputList.get(x).charAt(2) + ""), inputList.get(x).charAt(4));
            } else{
                rover.setInstruction(inputList.get(x));
                rover.printResult();
            }

            // RoverOutputFormatter formatter = new ...
            // formatter.print(rover)
        }

    }
}
