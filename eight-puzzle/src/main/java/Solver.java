import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public final class Solver {

  private final Board initial;

  public Solver(Board initial) {
    this.initial = checkNotNull(initial, "initial == null.");
  }

  public boolean isSolvable() {
    throw new UnsupportedOperationException("not implemented.");
  }

  public int moves() {
    throw new UnsupportedOperationException("not implemented.");
  }

  public Iterable<Board> solution() {
    throw new UnsupportedOperationException("not implemented.");
  }

  private static <T> T checkNotNull(T object, String message) {
    if (object == null) {
      throw new NullPointerException(message);
    }
    return object;
  }

  public static void main(String[] args) {
    // create initial board from file
    In in = new In(args[0]);
    int n = in.readInt();
    int[][] blocks = new int[n][n];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        blocks[i][j] = in.readInt();
    Board initial = new Board(blocks);

    // solve the puzzle
    Solver solver = new Solver(initial);

    // print solution to standard output
    if (!solver.isSolvable()) {
      StdOut.println("No solution possible");
    } else {
      StdOut.println("Minimum number of moves = " + solver.moves());
      for (Board board : solver.solution())
        StdOut.println(board);
    }
  }
}
