/**
 * Project: Mars Rover Version: 1.0
 * Created by Leng and Rob on 7/03/2014.
 */

/**
 * This is where the rover is created, variables are assigned for its coordinates and position.
 * A direction is assigned too.
 */
public class Rover {
    private int mX;
    private int mY;
    private int x;
    private int y;
    private char direction;
    // Set Coordinate
    public void setCoordinate(int mX, int mY) {
        this.mX = mX;
        this.mY = mY;
    }

    //Set Position for Rover
    public void setPosition(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

    }

    //set instructions for each character in th estring for directions
    public void setInstruction(String instruction) {
        char[] inst = instruction.toCharArray();
        for (char ins : inst) {
            switch (ins) {
                case 'L':
                    this.turnLeft();
                    break;
                case 'R':
                    this.turnRight();
                    break;
                case 'M':
                    this.move();
                    break;
            }
        }
    }

    //set the right turn direction
    public void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;

        }

    }

    //set the left turn direction
    public void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;

        }

    }

    // set the movement action
    public void move() {
        switch (direction) {
            case 'N':
                if (y < mY) {
                    this.y += 1;
                }
                break;
            case 'S':
                if (y > 0) {
                    this.y -= 1;
                }
                break;
            case 'E':
                if (x < mX) {
                    this.x += 1;
                }
                break;
            case 'W':
                if (x > 0) {
                    this.x -= 1;
                }
                break;
        }
    }

    //a function used to print the current position of the rover
    public void printResult() {
        System.out.println( this.x +" "  + this.y + " " + this.direction);


    }


}
