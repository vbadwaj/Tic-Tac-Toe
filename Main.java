import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        TicTacToe newgame = new TicTacToe();
        newgame.intializegrid();
        System.out.println("Let's Play!");
        do{
            System.out.println("Grid Layout:");
            newgame.printGrid();
            int row,col;
            do{
                System.out.println("PLayer: "+newgame.getPlayermark()+" Enter row and column position");
                row=scan.nextInt()-1;
                col=scan.nextInt()-1;
            }while(!newgame.markpos(row,col));
            newgame.Turn();
        }while(!newgame.win() && !newgame.isFull());
        if(newgame.isFull() && !newgame.win()){
            System.out.println("Match Drawn!");
            newgame.printGrid();
        }
        else{
            System.out.println("The Final Grid:");
            newgame.printGrid();
            newgame.Turn();
            System.out.println("The winner is Player: "+ newgame.getPlayermark());
        }
    }
}
