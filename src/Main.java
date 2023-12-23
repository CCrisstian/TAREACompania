public class Main {
    public static void main(String[] args) {

        Gerente NuevoGerente = new Gerente("Cristian","Cristaldo","12345","Calle 123");

        Gerente NuevoGerente2 = new Gerente("GERENTE","2","5678","CALLE 456",3000000D);

        Cliente cliente = new Cliente("Cliente","de Prueba","91011","Calle 8910");

        System.out.println(NuevoGerente.toString());
        System.out.println();
        System.out.println(NuevoGerente2);

        NuevoGerente.setPresupuesto(2000000D);
        NuevoGerente.setRemuneracion(NuevoGerente.AumentarRemuneracion(50));


        System.out.println("\n======================================\n");

        System.out.println(NuevoGerente.toString());
        System.out.println();
        System.out.println(NuevoGerente2);
        System.out.println();
        System.out.println(cliente);

    }
}