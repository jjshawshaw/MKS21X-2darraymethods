public class ArrayMethods{
  /*
   *PART 1
   */
   public static int rowSum(int[][] ary, int x){
    //returns the sum of the elements in Row x of ary
    int out = 0;
    int rowNum = ary.length;
    if (x >= rowNum) return out;
    int colNum = ary[x].length;
    for (int i = 0; i < colNum; i++){
      out += ary[x][i];
    }
    return out;
  }
    //When x is past the last row count it as a zero. (NO indexOutOfBounds should ever occur)

   public static int columnSum(int[][] ary, int x){
    //returns the sum of the elements in Column x of ary (careful with rows of different lengths!).
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
    int out = 0;
    int rowNum = ary.length;
    int maxCol = 0;
    for (int i = 0; i < ary.length; i++) {
      if (ary[i].length > maxCol) maxCol = ary[i].length;
    }
    if (x >= maxCol) return out;
    for (int i = 0; i < rowNum; i++){
      if (ary[i].length > x) out += ary[i][x];    }
    return out;
  }
   /*
   *PART 2 - use prior methods where appropriate
   */
   public static int[] allRowSums(int[][] ary){
     int[] out = new int[ary.length];
     for (int i = 0; i < ary.length; i++) {
       out[i] += rowSum(ary, i);
     }
     return out;
   }
    //returns an array of the row sums for each row of ary.
    //Index i of the return array contains the sum of elements in row i.

    public static int[] allColSums(int[][] ary){
      int[] out = new int[ary.length];
      int maxCol = 0;
      for (int i = 0; i < ary.length; i++) {
        if (ary[i].length > maxCol) maxCol = ary[i].length;
      }
      for (int i = 0; i < maxCol; i++) {
        out[i] += columnSum(ary, i);
      }
      return out;
    }
    //Returns an array with the column sum of each column of ary.
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
    //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
    //The length of the returned array should be the length of the LONGEST array in ary.


   /*
   *PART 3 - use prior methods where appropriate
   */
   //public static boolean isRowMagic(int[][] ary){}
     //checks if the array is row-magic (this means that every row has the same row sum).

   //public static boolean isColumnMagic(int[][] ary){}
    //checks if the array is column-magic (this means that every column has the same column sum).

}
