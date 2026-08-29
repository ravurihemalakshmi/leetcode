class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        boolean[] leftrow=new boolean[n];
        boolean[] lowerleftdiagnol=new boolean[2*n-1];
        boolean[] upperleftdiagnol=new boolean[2*n-1];
        solve(0,n,board,leftrow,lowerleftdiagnol,upperleftdiagnol,ans);
        return ans; 
    }
    public void solve(int col,int n,char[][]board,boolean[]leftrow,boolean[]lowerleftdiagnol,boolean[] upperleftdiagnol,List<List<String>>ans){
        if(col==n){
            List<String>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;

        }
        for(int row=0;row<n;row++){
            if(leftrow[row]||lowerleftdiagnol[row+col]||upperleftdiagnol[n-1+row-col]){
                continue;
            }
            board[row][col]='Q';
            leftrow[row]=true;
            lowerleftdiagnol[row+col]=true;
            upperleftdiagnol[n-1+row-col]=true;
            solve(col+1,n,board,leftrow,lowerleftdiagnol,upperleftdiagnol,ans);
            board[row][col]='.';
            leftrow[row]=false;
            lowerleftdiagnol[row+col]=false;
            upperleftdiagnol[n-1+row-col]=false;

        }

    }
    
    

}