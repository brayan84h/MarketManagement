package Utils;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public String nameclient;
    public int idclient;
    public boolean vip;

    List<Article> carrito;
    List<Order> ordersclient;

    public Client(String nameclient, boolean vip) {
        this.nameclient = nameclient;
        this.idclient = (int)(Math.random()*(3000-1000+1)+1000);
        this.vip = vip;
        this.carrito = new ArrayList<Article>();
        this.ordersclient = new ArrayList<Order>();
    }

    public void agg_art(Article article){
        this.carrito.add(article);
    }

    public void remover_articulo(Article article){
        this.carrito.remove(article);
    }

    public void vaciar_carrito(){
        this.carrito.removeAll(this.carrito);
    }

    public void agg_order(Order order){
        this.ordersclient.add(order);
    }
    public void quitar_order(Order order){
        this.ordersclient.remove(order);
    }

    public void print_car(){
        System.out.println("CARRITO DE: \t\t\t\t"+String.valueOf(this.idclient)+" - "+this.nameclient);
        System.out.println("ID \t\t\t\t PRODUCT \t\t\t\t DESCRIPTION \t\t\t\t QUANTITY \t\t\t\t COST \t\t\t\t TOTAL");
        for (Article a: carrito) {
            a.imprimir_linea();
        }
        System.out.println("\n");
    }

    public void imprimir_ordenes(){
        for (Order a: this.ordersclient) {
            a.imprimir_orden();
        }
    }

}
