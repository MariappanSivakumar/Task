
class WordSearchInTwodiamentionalArray {
  public void getString()throws java.io.IOException
  {
    return ((new java.io.BufferedReader(java.io.InputStreamReader(System.in).readLine());
  }
  public void getData(){
    System.out.println("Enter the Row");
    int row = Integer.parseInt(getString());
    System.out.println("Enter the Cloumn");
    int column = Integer.parseInt(getString());
    int letters[][] = new int[row][column];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<column;j++)
      {
        letters[i][j] = Integer.parseInt(getString());
      }
    }
    String word = getString();
    exist(letters, word)
  }
               
  public static void main(String ar[])throws java.io.IOException
  {
    new WordSearchInTwodiamentionalArray().getData();
  }
    public void wordSearch( String word, char[][] letters, int i, int j, int index) {  

        int n = letters[i].length;
        int n1 = letters.length;


        if( word.length() == index )return;

        char c = word.charAt(index);
        System.out.println(c);

        letters[i][j] = ' ';
        
        if( !(i-1<0) && letters[i-1][j] == c ) wordSearch(word, letters, i-1, j, index+1);
        
        if( !(j-1<0) && letters[i][j-1] == c ) wordSearch(word, letters, i, j-1, index+1);

        if( i+1 < n1 && letters[i+1][j] == c ) wordSearch(word, letters, i+1, j, index+1);
        
        if( j+1<n  && letters[i][j+1] == c ) wordSearch(word, letters, i, j+1, index+1);
        
        letters[i][j] = c;
        return;
    }
    public void exist(char[][] board, String word) {

        int boardXlength = board.length;
        int boardYlength = board[i].length;
        int c = word.charAt(0);
        for( int i=0;i<boardXlength;i++)
        {
            for(int j=0;j<boardYlength;j++)
            {
                if(board[i][j] != c)  continue;
                else  wordSearch( word, board, i, j, 1);
            }
        }
    }
}
