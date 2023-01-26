package org.example;

public class Main {
    public static void main(String[] args) {

        //EN EL MAIN LLAMO A MIS CLASES
        //EN EL MAIN CREO LOS OBJETOS DE MIS CLASES
        //EN EL MAIN CREO UNA INSTANCIA DE MI CLASE
        //EN EL MAIN LE SACO COPIA A MIS CLASES Y CREO OBJETOs
        Invitado objetoDeClaseInvitado=new Invitado();
        Invitado objeto2=new Invitado(33,true,"Juan",10000);

        //OBTENER EL VALOR DE LOS ATRIBUTOS
        System.out.println(objetoDeClaseInvitado.nombre);
        System.out.println(objeto2.nombre);
    }
}