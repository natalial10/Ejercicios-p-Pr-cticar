package com.evi.producto;

public class Perecedero extends Producto{

    private int dias_a_caducar;
    
    public Perecedero (int dias_a_caducar, String nombre, double precio) {
        super(nombre,precio);
        this.dias_a_caducar= dias_a_caducar;
        
    }

    public int getDias_a_caducar() {
        return dias_a_caducar;
    }

    public void setDias_a_caducar(int dias_a_caducar) {
        this.dias_a_caducar = dias_a_caducar;
    }

    @Override
    public String toString() {
        return "Perecedero [dias_a_caducar=" + dias_a_caducar + "]";
    }
    
    public double calcular(int cantidad) {
        
        double precioF=super.calcular(cantidad);
        switch (dias_a_caducar) {
            case 1:
                precioF /=4;
                break;
            case 2: 
                precioF /=3;
                break;
            case 3:
                precioF /=2;
             
                
        }
        return precioF;
        
    }        
    

    
}
