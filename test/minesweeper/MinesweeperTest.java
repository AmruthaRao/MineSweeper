package minesweeper;


import org.junit.Assert;
import org.junit.Test;

public class MinesweeperTest {
@Test
  public void shouldBeAbleToAddACellToGrid(){
  Square square = new Square(0,0,true);
  Grid grid = new Grid();
  Assert.assertTrue(grid.add(square));

}
@Test
  public void shouldBeAbleToOpenASquareInGrid() throws GameOverException, YouWonException {
  Square square = new Square(0,0,true);
  Grid grid = new Grid();
  grid.add(square);
  grid.open(square);
  Assert.assertEquals(true,grid.isOpen(square));
}
@Test
  public void shouldBeAbleToFlagAParticularSquareIfItsNotOpen() throws GameOverException {
  Square square = new Square(0,0,true);
  Grid grid = new Grid();
  grid.add(square);
  grid.flag(square);
  Assert.assertTrue(grid.isFlagged(square));
}
@Test
public void shouldBeAbleToEndTheGameIfSquareWithMineIsOpened() throws GameOverException, YouWonException {
  Square square = new Square(0,0,true);
  Grid grid = new Grid();
  grid.add(square);
  grid.open(square);
  Assert.assertFalse(grid.isAlive);
}

@Test(expected=YouWonException.class)
  public void shouldBeAbleToWinTheGameIfAllTheMineLessSquaresAreOpen() throws GameOverException, YouWonException {
  Square square1 = new Square(0, 0, false);
  Square square2 = new Square(0, 1, false);
  Square square3 = new Square(1, 2, true);
  Square square4 = new Square(1, 0, false);
  Square square5 = new Square(1, 1, true);
  Square square6 = new Square(1, 2, false);
  Square square7 = new Square(2, 0, false);
  Square square8 = new Square(2, 1, false);
  Square square9 = new Square(2, 2, false);
  Grid grid = new Grid(
      square1,
      square2,
      square3,
      square4,
      square5,
      square6,
      square7,
      square8,
      square9);
  grid.open(square1,square2,square4,square6,square7,square8,square9);


}
@Test
  public void shouldBeAbleToSetTheNumberOfNeighboursWithMineOfOpenedSquare(){
  Square square1 = new Square(0, 0, false);
  Square square2 = new Square(0, 1, false);
  Square square3 = new Square(1, 2, true);
  Square square4 = new Square(1, 0, false);
  Square square5 = new Square(1, 1, true);
  Square square6 = new Square(1, 2, false);
  Square square7 = new Square(2, 0, false);
  Square square8 = new Square(2, 1, false);
  Square square9 = new Square(2, 2, false);
  Grid grid = new Grid(
      square1,
      square2,
      square3,
      square4,
      square5,
      square6,
      square7,
      square8,
      square9);

}


}
