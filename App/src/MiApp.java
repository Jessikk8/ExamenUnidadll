
/**
 *
 * @author Jess
 */
public class MiApp {

    private String nombre;
    private String matricula;
    private String correo;

    public void Jessica59640() {
        nombre = "Jessica Alejandra Zuvieta Tejeda";
        matricula = "59640";
        correo = "al59640@uacam.mx";

        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Correo electrónico: " + correo);
    }


    public static void main(String[] args) {
       MiApp miApp = new MiApp();
       miApp.Jessica59640()
               ;
    }
}