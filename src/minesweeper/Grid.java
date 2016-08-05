package minesweeper;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class Grid {
  private static Set<Square> grid =new HashSet<Square>();
  private static Set<Square> openSquares =new HashSet<Square>();
  boolean isAlive;

  Grid(){
    this.isAlive=true;
  }

  public Grid(Square...squares) {
    grid.addAll(asList(squares));
  }

  public boolean add(Square square) {
    return(grid.add(square));
  }

  public void open(Square... squares) throws GameOverException, YouWonException {
    for (Square square : squares) {

      if (this.isAlive = false)
        throw new GameOverException();

      if (grid.contains(square)) {
        square.isOpen = true;
        openSquares.add(square);
      }
      if (square.hasMine)
        this.isAlive = false;
    }
    if(openSquares.size()==getNumberOfSquaresWithoutMine()){
      throw new YouWonException();
    }
  }

  private int getNumberOfSquaresWithoutMine() {
    int count=0;
    for (Square square : grid) {
      if(square.hasMine){
        count++;
      }
    }
    return count;
  }

  public boolean isOpen(Square square) {
  return(square.isOpen);
  }

  public void flag(Square square) throws GameOverException {
    if(this.isAlive=false){
      throw new GameOverException();
    }
    if(grid.contains(square)&&(!square.isOpen)){
      square.flagged=true;
    }
  }

  public boolean isFlagged(Square square) {
  return(square.flagged);
  }
}
