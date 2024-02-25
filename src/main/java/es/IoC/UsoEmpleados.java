package es.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

    public static void main(String[] args) {
        /*
        //CREACION DE OBJETOS DE TIPO EMPLEADO

        Empleado empleado1 = new DirectorEmpleado();


        //USO DE LOS OBJETOS CREADOS

        System.out.println(empleado1.getTareas());

        */

        //UTILIZANDO XML

        //1-Creando el contexto (cargando el xml)                                                  Nombre del xml
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2-Pedir al xml el bean u objeto a crear
        //Primer argumento el alias del objeto en el xml y como segundo el nombre de la interfaz
        Empleado Juan = contexto.getBean("miEmpleado", Empleado.class);

        //3-Utilizar el bean
        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());

        //4-Cerrar el contexto (xml) para liberar espacio
        contexto.close();
    }

}
