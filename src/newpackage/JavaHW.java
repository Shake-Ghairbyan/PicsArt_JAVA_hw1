package newpackage;

public class JavaHW {
    public static void main(String[] args) {
        // byte a = 133; does not allow due to typical spec./
        byte a = 43; /*b = a*2 I tried to declare both in the same line,
        but as far as I could get it is not allowed in java, right?*/
        int n = 144;
        float nF = 6.7777F;
        boolean booly = false;
        char smth ='D';
        String str = "First Commit";
        System.out.print(n + " is integer type.");
        System.out.println( " while " + nF + " represents floating type");
        System.out.println("Boolean type of variable can either have " + booly + " value or true value.");
        System.out.println("Remember that char type is written with single quotes and for single characteristic, like " + smth + ", while String type uses double quotes and is for representing sequence of char values. Example: " + str );
    }
}
