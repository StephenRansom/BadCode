import java.util.Random;

/**
 * The code that inspired it all
 */
public class AlphabeticalSort {
    public static void main(String args[]){
        String s = "typewriter";

        for(int i = 0; i < Integer.MAX_VALUE; i++){
            s = randomSort(s);

            if(s.equals("eeiprrttwy")){
                System.out.println(s);
                break;
            }

            if(i == Integer.MAX_VALUE-1){
                i=0;
            }
        }
    }



    private static String randomSort(String s){
        char[] temp = s.toCharArray();
        Random r = new Random();

        //sort array
        for(int i = 0; i < 320489; i+=2){
            int first  = r.nextInt(10);
            int second = r.nextInt(10);

            char t1 = temp[first];
            temp[first]=temp[second];
            temp[second]=t1;
        }

        return s;
    }



}
