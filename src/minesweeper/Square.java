package minesweeper;

public class Square {
  private int xCoordinate;
  private int yCoordinate;
  boolean hasMine;
  boolean flagged;
  boolean isOpen;
  int numberOfNeighbours;

  public Square(int xCoordinate, int yCoordinate, boolean hasMine) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
    this.hasMine = hasMine;
  }
}
