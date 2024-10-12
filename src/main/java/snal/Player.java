package snal;

import lombok.Getter;

@Getter
public class Player {
    private String id;
    private int currentPosition;
   public Player (String id){
        this.currentPosition=0;
        this.id=id;
    }
    public  void resetPlayerPosition(){
       this.currentPosition=0;
    }
    public void setPosition(int position){
       this.currentPosition=position;
    }
}
