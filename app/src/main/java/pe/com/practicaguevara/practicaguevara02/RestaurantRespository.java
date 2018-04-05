package pe.com.practicaguevara.practicaguevara02;

import java.util.ArrayList;
import java.util.List;
import pe.com.practicaguevara.practicaguevara02.Restaurant;
/**
 * Created by Alumno on 5/04/2018.
 */

public class RestaurantRespository {
    private static List<Restaurant> Restaurant = new ArrayList<>();

    static{
        Restaurant.add(new Restaurant(1, "norkys", "muy bueno"));
        Restaurant.add(new Restaurant(2, "Tres gatos", "buena calidad"));
    }

    public static List<Restaurant> getList(){
        return Restaurant;
    }

}