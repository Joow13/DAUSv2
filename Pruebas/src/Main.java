
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main<nom_colors> {
    Map<Integer,String> map_colors = new HashMap<>();



 map_colors.put(0,"Negre");
 map_colors.put(1,"Vermell");
 map_colors.put(2,"Groc");
 map_colors.put(3,"Verd");
 map_colors.put(4,"Verd");
map_colors.put(3,"Blanc");



    nom_colors = map_colors.values();



for(Llapis s : nom_colors) System.out.println(s);

}
