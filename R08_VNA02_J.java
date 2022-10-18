/*
   Rule 08 VNA02-J
   Ensure that compound operations on shared variables are atomic
*/

final class Flag {
  private boolean flag = true;
 
  public void toggle() {  // Unsafe
    flag = !flag;
  }
 
  public boolean getFlag() { // Unsafe
    return flag;
  }
}