package snacks;

public class CountNumbers {
    public static int count(String string){
        String rem = string.replaceAll("\\D", "");
        System.out.println(rem);
        return rem.length();
    }
}
