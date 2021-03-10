package Utils;

import java.util.ArrayList;
import java.util.List;

public class Assistant {

    public int idasit;
    public String nameasis;

    List<Order> ordersgener;

    public Assistant(String nameasis) {
        this.idasit = (int)(Math.random()*(3000-1000+1)+1000);
        this.nameasis = nameasis;

        this.ordersgener = new ArrayList<Order>();
    }

    public void crear_orden(Client client){
        Order order= new Order(client, this, client.carrito);
        client.agg_order(order);
        client.vaciar_carrito();
    }
    
    public void imprimir_ordenes(){
        for (Order s: this.ordersgener) {
            s.imprimir_orden();
        }
    }

}
