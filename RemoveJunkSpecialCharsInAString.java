public class RemoveJunkSpecialCharsInAString {
    public static void main(String[] args){
        String s1 = "%$#%$$%$%#$ Correct String 365454564564";
        //Remve the characters from the string
        String s = s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s); //CorrectString365454564564
       //Remove numbers and characters from a string
        String sa = s1.replaceAll("[^a-zA-Z]","");
        System.out.println(sa);//CorrectString
    }
}
