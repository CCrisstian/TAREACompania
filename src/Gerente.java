public class Gerente extends Empleado{
    /*----------ATRIBUTOS----------*/
    private Double presupuesto;
    /*----------ATRIBUTOS----------*/


    /*----------GETTER-SETTER----------*/
    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }
    /*----------GETTER-SETTER----------*/


    /*----------CONSTRUCTOR----------*/
    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.presupuesto = 1000000D;
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, Double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.presupuesto = presupuesto;
    }
    /*----------CONSTRUCTOR----------*/


    /*----------MÉTODO----------*/
    @Override
    public Double AumentarRemuneracion(int porcentaje){
        return super.AumentarRemuneracion(porcentaje);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPresupuesto: " + presupuesto;
    }
    /*----------MÉTODO----------*/



}
