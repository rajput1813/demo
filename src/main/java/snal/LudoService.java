package snal;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LudoService {
    private Map<String ,Player> players;
    private Board board;
    private Queue<Player>q ;
    private  Dice dice;


    public LudoService( Board board) {
        this.players = new HashMap<>();
        this.board = board;
        this.q=new LinkedList<>();
        this.dice= new Dice();
    }
    public void addPlayer(Player player){
        this.players.put(player.getId(),player);
        System.out.println("added new player: "+ player);
    }
    public void removePlayer(Player player){
        players.remove(player.getId());
        System.out.println("removed player: "+player);
    }

    public  void addPlayersToGame(String playerId){
        if(players.containsKey(playerId)){
            q.add(players.get(playerId));
        }
        else{
            System.out.println("player do not exists");
        }
    }
    public void startGame(){
        while(true){
            Player player= q.poll();
            int position = dice.roll();
            int newPosition = position+player.getCurrentPosition();
            if(newPosition>100){
                q.add(player);
                continue;
            }
            newPosition =board.getPosition( newPosition);
            player.setPosition(newPosition);
            System.out.println("current position of player :"+player.getId()+" is  "+player.getCurrentPosition());
            if(newPosition==100){
                System.out.println("player : "+player.getId()+" won the game");

                break;
            }
            q.add(player);

        }
    }

}
