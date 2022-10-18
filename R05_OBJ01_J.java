/*
   Rule 05 OBJ01-J
   Limit accessibility of fields
*/

public class Widget {
  private int total; // Number of elements
  
  public int getTotal() {
	  return total;
  }
 
  void add() {
    if (total < Integer.MAX_VALUE) {     
      total++;
      // ...
    } else {
      throw new ArithmeticException("Overflow");
    }
  }
 
  void remove() { 
    if (total > 0) {     
      total--;
      // ...
    } else {
      throw new ArithmeticException("Overflow");
    }
  }
}