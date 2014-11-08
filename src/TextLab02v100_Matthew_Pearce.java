//Matthew Pearce

/*Text Lab02st.java
Student starting version of Textlab02 assigment
Resave this program as Textlab02v100 for the 80 point version
Resave this program as Textlab02v100 for the 100 point version
*/




public class TextLab02v100_Matthew_Pearce
{
   public static void main (String args[])
   {
      System.out.println("TextLab02, 100 Point Version\n");
      
      int starting_milliseconds=10000123;
      int hours=starting_milliseconds/3600000;                 //3600000 milli seconds in one hour
      int minutes=((starting_milliseconds/1000)%3600)/60;      
      int seconds=(starting_milliseconds/1000) % 36000 % 60;
      int milliseconds=(starting_milliseconds%1000)%1000;
      
      System.out.println("Starting milli-seconds:   "+starting_milliseconds);
      System.out.println("Hours:                    "+hours);
      System.out.println("Minutes:                  "+minutes);
      System.out.println("Seconds:                  "+seconds); 
      System.out.println("Milli Seconds:            " +milliseconds);
      
   }
}