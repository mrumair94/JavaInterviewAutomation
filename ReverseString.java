public class ReverseString {
    public static void main(String[] args){
// Q1. How will you reverse a particular stirng.
// Q2. What is difference in String and StringBuffer
// Q3. Do we have reverse function in String?
        //Imutable: In Java, "immutable" refers to an object that cannot be changed once it is created.
        //Mutable: In Java, "mutable" refers to an object that can be changed or modified after it is created
//Remember, immutability in Java promotes code simplicity, thread safety, and reduces the chances of unexpected bugs.
//Remember, mutable objects should be used with caution as they can introduce complexities in code and can lead to unexpected behavior, especially in multi-threaded environments.

        //Bydefault Strig is a immutable in java
        String s ="selenium";
      /*  //1. Using for Loop
        int len = s.length(); //8
        String rev ="";
        for(int i=len-1; i>=0; i--){
           rev = rev + String.valueOf(s.charAt(i)); //muineles
        }
        System.out.println(rev);*/

        //2. Using StringBuffer Class mutable Class
        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());

    }
}
