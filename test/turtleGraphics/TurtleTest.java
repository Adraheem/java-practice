package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    private Turtle turtle;

    @BeforeEach
    void setUp(){
        turtle = new Turtle();
    }

    @Test
    void turtleExistsTest(){
        assertNotNull(turtle);
    }

    @Test
    void turtleCanMovePenUpTest(){
        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    void turtleCanMovePenDownTest(){
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    void turtleCanTurnRightWhileFacingEastTest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingSouthTest(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingWestTest(){
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingNorthTest(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingEastTest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingNorthTest(){
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingWestTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingSouthTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardWhileFacingEastTest(){
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        turtle.move(5);
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardWhileFacingSouthTest(){
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        turtle.move(5);
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(10);
        assertEquals(new Position(9, 4), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardWhileFacingWestTest(){
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        turtle.move(5); // move 5 steps towards east
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
        turtle.turnRight(); // turn to south
        turtle.move(10); // move 10 steps towards south
        assertEquals(new Position(9, 4), turtle.getCurrentPosition());
        turtle.turnRight(); // turn to west
        turtle.move(3); // move 3 steps towards west
        assertEquals(new Position(9, 2), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardWhileFacingNorthTest(){
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        turtle.move(5); // ******************** move 5 steps towards east
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());

        turtle.turnRight(); // ******************** turn to south
        turtle.move(10); // ******************** move 10 steps towards south
        assertEquals(new Position(9, 4), turtle.getCurrentPosition());

        turtle.turnRight(); // ******************** turn to west
        turtle.move(3); // ******************** move 3 steps towards west
        assertEquals(new Position(9, 2), turtle.getCurrentPosition());

        turtle.turnRight(); // ******************** ******************** turn to north
        turtle.move(5); // ******************** move 5 steps towards north
        assertEquals(new Position(5, 2), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanDrawOnBoardWhileFacingEastAndPenDownTest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        turtle.penDown();
        turtle.move(10);

        String expected = String.format("""
                 *  *  *  *  *  *  *  *  *  * %s
                %s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s
                """, "   ".repeat(10), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20));

        assertEquals(expected, turtle.displayBoard());
    }

    @Test
    void turtleCanDrawOnBoardWhileFacingSouthAndPenDownTest(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());

        turtle.penDown();
        turtle.move(10);

        String expected = String.format("""
                 * %s%n * %s%n * %s%n * %s%n * %s%n * %s%n * %s%n * %s%n * %s%n * %s
                %s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s
                """, "   ".repeat(19), "   ".repeat(19), "   ".repeat(19),
                "   ".repeat(19), "   ".repeat(19), "   ".repeat(19),
                "   ".repeat(19), "   ".repeat(19), "   ".repeat(19), "   ".repeat(19),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20));

        assertEquals(expected, turtle.displayBoard());
    }

    @Test
    void turtleCanDrawOnBoardWhileFacingWestAndPenDownTest(){
        turtle.move(10);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        assertEquals(new Position(4, 9), turtle.getCurrentPosition());

        turtle.penDown();
        turtle.move(10);

        String expected = String.format("""
                %s%n%s%n%s%n%s
                 *  *  *  *  *  *  *  *  *  * %s
                %s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s
                """, "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(10),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20));

        assertEquals(expected, turtle.displayBoard());
    }

    @Test
    void turtleCanDrawOnBoardWhileFacingNorthAndPenDownTest(){
        turtle.turnRight();
        turtle.move(10);
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        assertEquals(new Position(9, 0), turtle.getCurrentPosition());

        turtle.penDown();
        turtle.move(10);

        String expected = String.format("""
                 * %s%n * %s%n * %s%n * %s%n * %s%n * %s%n * %s%n * %s%n * %s%n * %s
                %s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s
                """, "   ".repeat(19), "   ".repeat(19),
                "   ".repeat(19), "   ".repeat(19), "   ".repeat(19), "   ".repeat(19),
                "   ".repeat(19), "   ".repeat(19), "   ".repeat(19), "   ".repeat(19),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20));

        assertEquals(expected, turtle.displayBoard());
    }

    @Test
    void turtleCanDraw12by12SquareTest(){
        turtle.penDown();
        turtle.move(12);
        turtle.turnRight();
        turtle.move(12);
        turtle.turnRight();
        turtle.move(12);
        turtle.turnRight();
        turtle.move(12);
        turtle.penUp();

        String expected = String.format("""
                %s%s
                 * %s * %s
                 * %s * %s
                 * %s * %s
                 * %s * %s
                 * %s * %s
                 * %s * %s
                 * %s * %s
                 * %s * %s
                 * %s * %s
                 * %s * %s
                %s%s
                %s%n%s%n%s%n%s%n%s%n%s%n%s%n%s
                """, " * ".repeat(12), "   ".repeat(8),
                "   ".repeat(10), "   ".repeat(8),
                "   ".repeat(10), "   ".repeat(8),
                "   ".repeat(10), "   ".repeat(8),
                "   ".repeat(10), "   ".repeat(8),
                "   ".repeat(10), "   ".repeat(8),
                "   ".repeat(10), "   ".repeat(8),
                "   ".repeat(10), "   ".repeat(8),
                "   ".repeat(10), "   ".repeat(8),
                "   ".repeat(10), "   ".repeat(8),
                "   ".repeat(10), "   ".repeat(8),
                " * ".repeat(12), "   ".repeat(8),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20));

        assertEquals(expected, turtle.displayBoard());
    }
}
