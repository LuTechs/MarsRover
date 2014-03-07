import java.util.List;

/**
 * Created by leng on 7/03/2014.
 */
public class Main {

    public static void main(String args[]){

        List<String> inputList;

        System.out.println("Starting Test");


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
