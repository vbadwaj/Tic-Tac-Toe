public class TicTacToe {
    private char[][] grid;
    private char playermark;

    public TicTacToe(){
        grid= new char[3][3];
        playermark='x';
        intializegrid();
    }
    public void intializegrid(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                grid[i][j]='_';
            }
        }
    }
    public char getPlayermark(){
        return playermark;
    }
    public boolean isFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[i][j]=='_'){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean sim(char p1,char p2,char p3){
        if(p1!='_'&& p2!='_' && p3!='_'){
            if(p1==p2 && p2==p3)return true;
        }
        return false;
    }

    private boolean colmatch(){
        for(int i=0;i<3;i++){
            if(sim(grid[0][i],grid[1][i],grid[2][i]))return true;

        }
        return false;
    }
    private boolean rowmatch(){
        for(int i=0;i<3;i++){
            if(sim(grid[i][0],grid[i][1],grid[i][0]))return true;

        }
        return false;
    }
    private boolean diamatch(){
        for(int i=0;i<3;i++){
            if(sim(grid[0][0],grid[1][1],grid[2][2])||sim(grid[0][2],grid[1][1],grid[2][0]))return true;

        }
        return false;
    }
    public boolean win(){
        return (colmatch()||rowmatch()||diamatch());
    }
    public boolean markpos(int row,int col){
        if(row>=0 && row<3){
            if(col>=0 && col<3){
                if(grid[row][col]=='_' && grid[row][col]!='x' && grid[row][col]!='o')
                grid[row][col]=playermark;
                return true;
            }
        }
        return false;
    }
    public void Turn(){
        if(playermark=='x') playermark='o';
        else playermark='x';
    }
    public void printGrid(){
        System.out.println("-------------");
        for(int i=0;i<3;i++){
            System.out.print("| ");
            for(int j=0;j<3;j++){
                System.out.print(grid[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
