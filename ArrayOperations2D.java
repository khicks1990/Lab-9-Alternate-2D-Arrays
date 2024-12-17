/**
   The ArrayOperations2D class stores methods for 2D array operations.
   for the 2D Array Operations programming challenge.
*/

public class ArrayOperations2D
{
   /**
      getTotal method.
      @param array A 2D array of doubles.
      @return The total of the values stored in the
              argument array.
   */
      
   public static double getTotal(double[][] array)
   {
    
   }

   /**
      getAverage method
      @param array A 2D array of doubles.
      @return The average of the values stored in the
              argument array.
   */
   
   public static double getAverage(double[][] array)
   {
      return getTotal(array) / getElementCount(array);
   }

   /**
      getRowTotal method.
      @param array A 2D array of double.
      @param row A specified row
      @return The total of the values stored in the
              specified row of the argument array.
   */
   
   public static double getRowTotal(double[][] array, int row)
   {
      double total = 0;
      
      for (int col = 0; col < array[row].length; col++)
      {
         total += array[row][col];
      }
      
      return total;
   }

   /**
      getColumnTotal method.
      @param array A 2D array of doubles.
      @param col A specified col
      @return The total of the values stored in the
              specified column of the argument array.
   */
   
   public static double getColumnTotal(double[][] array, int col)
   {
      double total = 0;
      
      for (int row = 0; row < array.length; row++)
      {
         total += array[row][col];
      }
      
      return total;
   }

   /**
      getHighestInRow method.
      @param array A 2D array of doubles.
      @param row A specified row.
      @return The highest value stored in the
              specified row of the argument array.
   */
   
   public static double getHighestInRow(double[][] array, int row)
   {

   }

   /**
      getLowestInRow method.
      @param array A 2D array of doubles.
      @param row A specified row.
      @return The lowest value stored in the
              specified row of the argument array.
   */
   
   public static double getLowestInRow(double[][] array, int row)
   {

   }

   /**
      getElementCount method.
      @param array A 2D array of doubles.
      @return The number of elements in the
              argument array.
   */
   
   public static int getElementCount(double[][] array)
   {
      int count = 0;

      for (int row = 0; row < array.length; row++)
         count += array[row].length;
      
      return count;
   }
}