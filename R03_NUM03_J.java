/*
   Rule 03 NUM03-J
   Use integer types that can fully represent the range of unsigned data
*/

public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}