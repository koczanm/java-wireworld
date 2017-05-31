package model;

import java.awt.*;
import java.io.Serializable;
import java.util.HashMap;

public class Grid implements Serializable {
  private final int DEFAULT_ROW_COUNT = 29;
  private final int DEFAULT_COLUMN_COUNT = 29;

  private int rowCount;
  private int columnCount;
  private HashMap<Point, Cell> selectedCells;

  public Grid() {
    this.rowCount = DEFAULT_ROW_COUNT;
    this.columnCount = DEFAULT_COLUMN_COUNT;
    selectedCells = new HashMap<>();
  }

  public int getColumnCount() {
    return columnCount;
  }

  public void setColumnCount(int columnCount) {
    this.columnCount = columnCount;
  }

  public int getRowCount() {
    return rowCount;
  }

  public void setRowCount(int rowCount) {
    this.rowCount = rowCount;
  }

  public HashMap<Point, Cell> getSelectedCells() {
    return selectedCells;
  }

  public Color getCellState(Point point) {
    Cell cell = selectedCells.get(point);

    if (cell != null) {
      return cell.getState();
    }

    return State.EMPTY;
  }
}