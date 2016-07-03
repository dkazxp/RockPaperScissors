/**
 * Created by dkaczmar on 03/07/16.
 */
public class Scissors {
    public Result beats(Paper aPaper) {
        return Result.WIN;
    }

    public Result beats(Rock rock) {
        return Result.LOSE;
    }

    public Result beats(Scissors scissors) {
        return Result.DRAW;
    }
}
