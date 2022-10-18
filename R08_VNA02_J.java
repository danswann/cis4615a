/*
   Rule 08 VNA02-J
   Ensure that compound operations on shared variables are atomic
*/

final class Flag {
  private boolean flag = true;
 
  public synchronized void toggle() {
    flag ^= true; // Same as flag = !flag;
  }
 
  public synchronized boolean getFlag() {
    return flag;
  }
}