package Utils;

import java.util.List;

public class Article {

    public int idart;
    public String nameart;
    public String descripart;
    public int quantity;
    public double priceart;

    public Article( String nameart, String descripart, int quantity, double priceart) {
        this.idart = (int)(Math.random()*(3000-1000+1)+1000);
        this.nameart = nameart;
        this.descripart = descripart;
        this.quantity = quantity;
        this.priceart = priceart;
    }

    public void imprimir_linea(){
        System.out.println( String.valueOf(this.idart) + " \t\t\t\t " + this.nameart + " \t\t\t\t " + this.descripart + " \t\t\t\t " + String.valueOf(this.quantity) + " \t\t\t\t " + String.valueOf(this.priceart)+ " \t\t\t\t " + String.valueOf(this.priceart*this.quantity));
    }
}
