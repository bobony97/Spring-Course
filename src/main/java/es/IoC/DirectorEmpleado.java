package es.IoC;

public class DirectorEmpleado implements Empleado {
    //Creacion de campo tipo creacionInforme (interfaz)
    private CreacionInforme informeNuevo;

    //Creacion de constructor donde se inyecta la dependencia
    public DirectorEmpleado(CreacionInforme informeNuevo) {

        this.informeNuevo = informeNuevo;
    }

    @Override
    public String getTareas() {
        return "Gestionar la plantilla de la empresa";
    }

    @Override
    public String getInforme() {
        return "Informe creado por el Director: " + informeNuevo.getInforme();
    }
}
