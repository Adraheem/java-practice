package practice.turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleGraphicsTest {
    private TurtleGraphics turtle;

    @BeforeEach
    void setup(){
        turtle = new TurtleGraphics();
    }

    @Test
    void turtleExistsTest(){
        assertNotNull(turtle);
    }

    @Test
    void turtleHasPenTest(){
        assertNotNull(turtle.getPen());
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
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());

        turtle.turnRight();

        assertEquals(Direction.SOUTH,
                turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingSouthTest(){
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.SOUTH,
                turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.WEST,
                turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingWestTest(){
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.SOUTH,
                turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.WEST,
                turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.NORTH,
                turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingNorthTest(){
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.SOUTH,
                turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.WEST,
                turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.NORTH,
                turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingEastTest(){
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(Direction.NORTH,
                turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingNorthTest(){
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(Direction.NORTH,
                turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(Direction.WEST,
                turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingWestTest(){
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(Direction.NORTH,
                turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(Direction.WEST,
                turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(Direction.SOUTH,
                turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingSouthTest(){
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(Direction.NORTH,
                turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(Direction.WEST,
                turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(Direction.SOUTH,
                turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveWhileFacingEastTest(){
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());
        assertEquals(new Position(0, 0),
                turtle.getCurrentPosition());
        turtle.move(10);
        assertEquals(new Position(0, 9),
                turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveWhileFacingSouthTest(){
        turtle.turnRight();
        assertEquals(Direction.SOUTH,
                turtle.getCurrentDirection());
        assertEquals(new Position(0, 0),
                turtle.getCurrentPosition());
        turtle.move(10);
        assertEquals(new Position(9,0),
                turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveWhileFacingWestTest(){
        turtle.move(10);
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.WEST,
                turtle.getCurrentDirection());
        assertEquals(new Position(0, 9),
                turtle.getCurrentPosition());
        turtle.move(5);
        assertEquals(new Position(0, 5),
                turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveWhileFacingNorthTest(){
        turtle.turnRight();
        turtle.move(10);
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.NORTH,
                turtle.getCurrentDirection());
        assertEquals(new Position(9, 0),
                turtle.getCurrentPosition());
        turtle.move(5);
        assertEquals(new Position(5, 0),
                turtle.getCurrentPosition());
    }

    @Test
    void turtleHasSketchPadTest(){
        assertNotNull(turtle.getSketchPad());
    }

    @Test
    void turtleCanDrawWhileMovingAcrossEastTest(){
        turtle.penDown();
        turtle.move(10);
        assertEquals(Direction.EAST,
                turtle.getCurrentDirection());
        assertEquals(new Position(0,9),
                turtle.getCurrentPosition());

        String expected = String.format("""
                %s%s
                %s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s
                %s%n%s%n%s%n%s%n%s%n%s%n%s%n%s
                """,
                " * ".repeat(10), "   ".repeat(10),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20)
        );
        assertEquals(expected, turtle.displaySketchPad());
    }

    @Test
    void turtleCanDrawWhileMovingAcrossSouthTest(){
        turtle.turnRight();
        turtle.penDown();
        turtle.move(5);
        assertEquals(Direction.SOUTH,
                turtle.getCurrentDirection());
        assertFalse(turtle.isPenUp());
        assertEquals(new Position(4,0),
                turtle.getCurrentPosition());

        String expected = String.format("""
                 * %s%n * %s%n * %s%n * %s%n * %s
                %s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s
                %s%n%s%n%s%n%s%n%s%n%s
                """, "   ".repeat(19), "   ".repeat(19),
                "   ".repeat(19), "   ".repeat(19), "   ".repeat(19),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20)
        );
        assertEquals(expected, turtle.displaySketchPad());
    }

    @Test
    void turtleCanDrawWhileMovingAcrossWestTest(){
        turtle.move(10);
        assertEquals(new Position(0,9),
                turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.turnRight();
        turtle.penDown();
        turtle.move(10);

        assertEquals(Direction.WEST,
                turtle.getCurrentDirection());
        assertFalse(turtle.isPenUp());
        assertEquals(new Position(0,0),
                turtle.getCurrentPosition());

        String expected = String.format("""
                %s%s
                %s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s
                %s%n%s%n%s%n%s%n%s%n%s%n%s%n%s
                """,
                " * ".repeat(10), "   ".repeat(10),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20)
        );
        assertEquals(expected, turtle.displaySketchPad());
    }

    @Test
    void turtleCanDrawWhileMovingAcrossNorthTest(){
        turtle.turnRight();
        assertEquals(Direction.SOUTH,
                turtle.getCurrentDirection());
        turtle.move(5);
        assertEquals(new Position(4, 0),
                turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.turnRight();
        turtle.penDown();
        turtle.move(5);
        assertEquals(new Position(0, 0),
                turtle.getCurrentPosition());
        assertFalse(turtle.isPenUp());
        assertEquals(Direction.NORTH,
                turtle.getCurrentDirection());

        String expected = String.format("""
                 * %s%n * %s%n * %s%n * %s%n * %s
                %s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s
                %s%n%s%n%s%n%s%n%s%n%s
                """, "   ".repeat(19), "   ".repeat(19),
                "   ".repeat(19), "   ".repeat(19), "   ".repeat(19),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20),
                "   ".repeat(20), "   ".repeat(20), "   ".repeat(20)
        );
        assertEquals(expected, turtle.displaySketchPad());
    }

}