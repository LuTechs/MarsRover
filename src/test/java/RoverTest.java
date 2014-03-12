import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RoverTest {
    @Test
    public void shouldTurnLeftWhenInstructionIsL() {
        Rover rover = new Rover();
        rover.setCoordinate(5, 5);
        rover.setPosition(0, 0, 'N');

        rover.setInstruction("L");
        assertEquals('W', rover.getDirection());
        rover.setInstruction("L");
        assertEquals('S', rover.getDirection());
        rover.setInstruction("L");
        assertEquals('E', rover.getDirection());
        rover.setInstruction("L");
        assertEquals('N', rover.getDirection());
    }

    @Test
    public void shouldTurnLeftWhenInstructionIsR() {
        Rover rover = new Rover();
        rover.setCoordinate(5, 5);
        rover.setPosition(0, 0, 'N');

        rover.setInstruction("R");
        assertEquals('E', rover.getDirection());
        rover.setInstruction("R");
        assertEquals('S', rover.getDirection());
        rover.setInstruction("R");
        assertEquals('W', rover.getDirection());
        rover.setInstruction("R");
        assertEquals('N', rover.getDirection());
    }
}