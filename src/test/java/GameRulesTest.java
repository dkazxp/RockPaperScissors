import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameRulesTest {

    private static final Result WIN = Result.WIN;
    private static final Result LOSE = Result.LOSE;
    private static final Result DRAW = Result.DRAW;

    private Paper paper = new Paper();
    private Rock rock = new Rock() ;
    private Scissors scissors = new Scissors();


    @Test
    public void testGameWins(){
        assertEquals(WIN, paper.beats(rock));
        assertEquals(WIN, rock.beats(scissors));
        assertEquals(WIN, scissors.beats(paper));
    }

    @Test
    public void testGameLosses(){
        assertEquals(LOSE, paper.beats(scissors));
        assertEquals(LOSE, rock.beats(paper));
        assertEquals(LOSE, scissors.beats(rock));
    }

    @Test
    public void testGameDraws(){
        assertEquals(DRAW, paper.beats(paper));
        assertEquals(DRAW, rock.beats(rock));
        assertEquals(DRAW, scissors.beats(scissors));
    }

}
