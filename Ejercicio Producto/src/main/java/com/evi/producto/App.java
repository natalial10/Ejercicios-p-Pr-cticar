package com.evi.producto;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Producto[]  productos = new Producto[3];
        
        productos[0]= new Producto ("producto1",10);
        productos[1]= new Perecedero (1,"producto 2",20);
        productos[2]= new NoPerecedero ("tipo1","producto3",5);
        
        
        double total=0;
        for (int i=0; i < productos.length; i++) {
            total+=productos[i].calcular(5);
         
        }
        System.out.println("Importe total de la compra:"+total);
    }

}
