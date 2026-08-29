class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(board[row][col]==word.charAt(0)){
                    visited[row][col]=true;
                    if(solve(row,col,0,visited,board,word,n,m)){
                        return true;
                    }
                    visited[row][col]=false;
                }
            }
        }
        return false;
        
    }
    public boolean solve(int row,int col,int index,boolean[][]visited,char[][]board,String word,int n,int m){
        if(index==word.length()-1){
            return true;
        }
        if(col+1<m&&!visited[row][col+1]&&board[row][col+1]==word.charAt(index+1)){
            visited[row][col+1]=true;
            if(solve(row,col+1,index+1,visited,board,word,n,m))return true;
            visited[row][col+1]=false;
        }
        if(row+1<n&&!visited[row+1][col]&&board[row+1][col]==word.charAt(index+1)){
            visited[row+1][col]=true;
            if(solve(row+1,col,index+1,visited,board,word,n,m))return true;
            visited[row+1][col]=false;
        }
        if(row-1>=0&&!visited[row-1][col]&&board[row-1][col]==word.charAt(index+1)){
            visited[row-1][col]=true;
            if(solve(row-1,col,index+1,visited,board,word,n,m))return true;
            visited[row-1][col]=false;
        }
        if(col-1>=0&&!visited[row][col-1]&&board[row][col-1]==word.charAt(index+1)){
            visited[row][col-1]=true;
            if(solve(row,col-1,index+1,visited,board,word,n,m))return true;
            visited[row][col-1]=false;
        }
        return false;
        
    }
}