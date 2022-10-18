/*
   Rule 03 NUM03-J
   Use integer types that can fully represent the range of unsigned data
*/

public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
}