package sample;

import common.Restaurant;
import common.RestaurantFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class RestaurantBean implements Serializable {

    @EJB
    private RestaurantFacade rf;
    
    private List<Restaurant> restaurants;
    
    public List<Restaurant> getRestaurants(){
        return restaurants;
    }
    
    public String showRestaurants() {
        // sample data
        /*Restaurant r1 = new Restaurant();
        r1.setId(1);
        r1.setName("AAA");
        rf.create(r1);
        Restaurant r2 = new Restaurant();
        r2.setId(2);
        r2.setName("BBB");
        rf.create(r2);*/
        
        restaurants = rf.findAll();
        
        return "restaurant.xhtml";
    }
}
