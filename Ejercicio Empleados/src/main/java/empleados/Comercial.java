package empleados;

public class Comercial extends Empleado {
    
    private double comision;
    
       public Comercial (double comision, String nombre,int edad, double salario) {
        super(nombre,edad,salario);
        this.comision=comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Comercial [comision=" + comision + "]";
    }

    public boolean plus() {
        if (super.getEdad() >30 && this.comision>200) {
            double nuevosalario=super.getSalario()+ super.PLUS;
            super.setSalario(nuevosalario);
            System.out.println("Empleado Comercial se aplico PLUS:"+super.getNombre() + " el salario es:" +nuevosalario);
         return true;   
        }
        return false;
        
    }
}
