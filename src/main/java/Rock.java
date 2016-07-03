/**
 * Created by dkaczmar on 03/07/16.
 */
public class Rock {
    public Result beats(Scissors aScissors) {
        return Result.WIN;
    }

    public Result beats(Paper paper) {
        return Result.LOSE;
    }

    public Result beats(Rock rock) {
        return Result.DRAW;
    }
}
