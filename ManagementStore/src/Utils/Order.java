package Utils;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public int idorder;
    public double desc;
    public double subtotal;
    public double total;
    public double impuesto;

    public Client clientoprder;
    public Assistant assistantorder;
    List<Article> products;

    public Order(Client clientoprder, Assistant assistantorder, List<Article> products) {
        this.idorder = (int)(Math.random()*(3000-1000+1)+1000);
        this.clientoprder = clientoprder;
        this.assistantorder = assistantorder;
        this.products = new ArrayList<Article>();
        this.products.addAll(products);
        this.calcular_totales();
    }

    public void calcular_totales(){
        double porc_desc = this.clientoprder.vip ? 0.2 : 0.0;
        double acumulador=0.0;

        for (Article a: this.clientoprder.carrito) {
            acumulador= a.priceart * a.quantity;
        }

        this.subtotal =acumulador;
        this.desc = acumulador * porc_desc;
        this.impuesto = (this.subtotal- this.desc)*0.15;
        this.total = this.subtotal - this.desc - this.desc;
    }

    public void actualizarcarrito(List<Article> products){
        this.products.removeAll(this.products);
        this.products.addAll(products);
        this.calcular_totales();
    }

    public void imprimir_orden(){
        System.out.println("ORDEN # \t\t\t"+String.valueOf(this.idorder));
        System.out.println("CLIENTE ID: \t\t\t"+String.valueOf(this.clientoprder.idclient));
        System.out.println("NOMBRE CLIENTE: \t\t\t"+this.clientoprder.nameclient);
        System.out.println("ATENDIDO POR: \t\t\t"+String.valueOf(this.assistantorder.idasit)+" - "+this.assistantorder.nameasis);

        System.out.println("ID \t\t\t\t PRODUCT \t\t\t\t DESCRIPTION \t\t\t\t QUANTITY \t\t\t\t COST \t\t\t\t TOTAL");
        for(Article a: this.products){
            a.imprimir_linea();
        }

        System.out.println("SUBTOTAL: \t\t\t"+String.valueOf(this.subtotal));
        System.out.println("IMPUESTO: \t\t\t"+String.valueOf(this.impuesto));
        System.out.println("DESCUENTO: \t\t\t"+String.valueOf(this.desc));
        System.out.println("TOTAL: \t\t\t"+String.valueOf(this.total));
        System.out.println("\n");
    }
}
