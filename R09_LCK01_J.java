/*
   Rule 09 LCK01-J
   Do not synchronize on objects that may be reused
*/

private final Boolean initialized = Boolean.FALSE;
 
public void doSomething() {
  synchronized (initialized) {
    // ...
  }
}