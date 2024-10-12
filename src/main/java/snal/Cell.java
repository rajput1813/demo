package snal;

import lombok.Getter;

@Getter
public class Cell {
    private int src;
    private CellType cellType;
    private int destination;

    public Cell(int i, CellType cellType, int destination) {
        this.cellType=cellType;
        this.src=i;
        this.destination=destination;
    }
    public void  addSnake(int destination){
        this.cellType=CellType.SNAKE;
        this.destination=destination;
    }
    public void  addLadder(int destination){
        this.cellType=CellType.LADDER;
        this.destination=destination;
    }
}
