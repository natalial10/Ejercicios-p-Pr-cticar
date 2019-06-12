package empleados;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Comercial comercial =new Comercial(300,"Maria",45,100);
        Repartidor repartidor = new Repartidor ("zona 3","Lucio",20,200);
         
        //llamamos a plus
        comercial.plus();
        repartidor.plus();
        
        
        System.out.println("comercial");
        System.out.println("repartidor");
        

    }

}
