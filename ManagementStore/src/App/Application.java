package App;

import Utils.Article;
import Utils.Assistant;
import Utils.Client;

public class Application {
    public static void main(String[] args) {

        //Creamos el asistente
        Client client1 = new Client("Brayan Hernandez",true);
        Client client2 = new Client("keysi Garcia",false);

        //Creamos el asistente
        Assistant assis1 = new Assistant("Juan Perez");

        //Creamos los Articulos
        Article art1 = new Article("Pantalla AOC","22 Pulgadas, Ultra HD",2,2500);
        Article art2 = new Article("Teclado ARGOM","RGB, MECANICO",1,956.36);
        Article art3 = new Article("Impresora Epson","Modelo L375, Tinta de flujo continuo con WIFI",1,5405.99);
        Article art4 = new Article("Procesador AMD RYSEN 5","8 nucleos, incluido el disipador de calor",1,8064.6);
        Article art5 = new Article("Equipo de Sonido SONY","Ultra Bass incluidos",4,5784.35);
        Article art6 = new Article("Samsung Galaxy s20","Color negro , Dual SIM",1,40000);

        //Agregamos Articulos a los Carritos de los clientes
        client1.agg_art(art3);
        client1.agg_art(art2);
        client1.agg_art(art6);
        client1.agg_art(art5);
        client2.agg_art(art1);
        client2.agg_art(art4);
        client2.agg_art(art6);
        client2.agg_art(art5);

        //Mostramos el carrito del cliente 1
        client1.print_car();
        //Quitamos un articulo del carrito del cliente 1
        client1.remover_articulo(art5);
        //Volvemos a imprimir el Carrito del cliente 1
        client1.print_car();
        //Transfromamos el carrito a orden
        assis1.crear_orden(client1);
        //Imprimimos la orden efectuada por el ASISTENTE
        client1.imprimir_ordenes();

        //Imprimimos la ordenes genradas por el asistente 1
        assis1.imprimir_ordenes();




    }
}
