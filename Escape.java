public class Escape{
    public static void main(String []args){
        try{
            System.out.print("John said\" \"I am hungry\" \n"); //mekta pavichi karala thyenee escape sequenceveha thiyene eka code eka ganan gan na
        // C:\Windows\System32\cmd.exe meka print karamu
        System.out.println("C:\\Windows\\System32\\cmd.exe"); // escape sequence hamathissema enne "me deka athle mathka thiya ganna"
        System.out.print("John said\" \r\"I am hungry\" \n");// \r walata <- kalin thiyena dewal dika hide karala penane | john said kiyana kala na
        System.out.println("My Name is Akeen \t My age is 24 \t My school SACK"); // \t kiyanne tab space ekek thiyanna kiyala
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This Lesson is Escape sequence");
        }
    }
}