/**
 * Created by dkaczmar on 03/07/16.
 */
public class Paper {
    public Result beats(Rock aRock) {
        return Result.WIN;
    }

    public Result beats(Scissors scissors) {
        return Result.LOSE;
    }

    public Result beats(Paper paper) {
        return Result.DRAW;
    }
}
