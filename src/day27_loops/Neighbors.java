package day27_loops;

public class Neighbors {
    public static void main(String[] args) {
        String word = "jaavvaa spoonn";
        for(int i = 0;i<word.length()-1;i++){
            System.out.print(word.charAt(i));
            System.out.println(word.charAt(i+1));

            if(word.charAt(i) ==word.charAt(i+1)){
                System.out.println("Beep - "+word.charAt(i));
            }
        }
    }
}
