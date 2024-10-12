package snal;

public class Ludo {
    public static void main(String[] args) {
        Board board = new Board();
        LudoService ludoService= new LudoService(board);
        ludoService.addPlayer(new Player("1"));
        ludoService.addPlayer(new Player("2"));
        ludoService.addPlayer(new Player("3"));
        ludoService.addPlayer(new Player("4"));
        ludoService.addPlayersToGame("1");
        ludoService.addPlayersToGame("2");
        ludoService.addPlayersToGame("3");
        ludoService.addPlayersToGame("4");
        board.getBoard().get(58).addSnake(40);
        board.getBoard().get(97).addSnake(15);
        board.getBoard().get(63).addSnake(17);
        board.getBoard().get(47).addSnake(4);
        board.getBoard().get(52).addSnake(11);


        board.getBoard().get(21).addLadder(82);
        board.getBoard().get(36).addLadder(57);
        board.getBoard().get(61).addLadder(99);
        board.getBoard().get(51).addLadder(91);
        board.getBoard().get(54).addLadder(88);
        ludoService.startGame();
    }
}
