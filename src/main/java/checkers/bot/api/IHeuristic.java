package checkers.bot.api;

public interface IHeuristic {
    public int estimate(int original[][], int state[][]);
}
