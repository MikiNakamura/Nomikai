/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author macbookair
 */
@Stateless
public class RestaurantFacade extends AbstractFacade<Restaurant> {

    @PersistenceContext(unitName = "nomikai")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RestaurantFacade() {
        super(Restaurant.class);
    }
    
}
