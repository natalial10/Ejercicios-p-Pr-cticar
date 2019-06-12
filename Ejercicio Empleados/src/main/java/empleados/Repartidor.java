package empleados;

public class Repartidor extends Empleado {
    
    private String zona;
    
    public Repartidor (String zona, String nombre,int edad, double salario) {
    super(nombre,edad,salario);
    this.zona=zona;

}

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Repartidor [zona=" + zona + "]";
    }
    
    
    public boolean plus() {
        if (super.getEdad()<25 && this.zona.equalsIgnoreCase("zona 3")){
            double nuevoSalario=super.getSalario()+ super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Empleado Repartidor se aplico PLUS:" +super.getNombre() + " el salario es:" +nuevoSalario);
            return true;
        }
        return false;
    }
    
}



    
