package Collections;
import java.util.Map;
import java.util.HashMap;
public class HashMap1 {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();

        //put() : it is going to insert key and value;
        map.put("Somesh", "deshmukhsomesh777@gmail.com");
        map.put("kevin","kevin@gmail.com");
        map.put("anna","anna@gmail.com");

        // we are going to get the value where the key is "Somesh".
        System.out.println(map.get("Somesh"));

    }
}
