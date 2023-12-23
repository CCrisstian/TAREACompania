public class Cliente extends Persona{
    /*----------ATRIBUTOS----------*/
    private int clienteId;
    private static int UltimoClienteId;
    /*----------ATRIBUTOS----------*/


    /*----------GETTER-SETTER----------*/
    public int getClienteId() {
        return clienteId;
    }
    /*----------GETTER-SETTER----------*/


    /*----------CONSTRUCTOR----------*/
    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++UltimoClienteId;
    }
    /*----------CONSTRUCTOR----------*/


    /*----------MÉTODO----------*/
    @Override
    public String toString() {
        return super.toString() +
                "\nCliente Id: "+ this.clienteId;
    }
    /*----------MÉTODO----------*/

}
