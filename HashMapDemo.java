import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[]args){
        HashMap<String,Integer> scores = new HashMap<String,Integer>();
        scores.put("sidharth malhotra", 90);
        scores.put("Shayaan", 100);
        scores.put("Shahid", 99);
        scores.put("Shahid",100);
        System.out.println(scores);

        if(scores.containsKey("Shahid")){
            System.out.println("Shahid is present in the map");
        }
        else{
            System.out.println("Shahid is not present in the map");
        }


    }}
