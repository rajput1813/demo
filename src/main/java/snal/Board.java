package snal;

import lombok.Getter;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
@Getter
public class Board {
    private Map<Integer,Cell>board;
    public Board(){
        this.board=new HashMap<>();
        for(int i=1;i<=100;i++){
            this.board.put(i,new Cell(i,CellType.NORMAL,i));
        }
    }


    public int getPosition(int newPosition) {
        return board.get(newPosition).getDestination();
    }
}
