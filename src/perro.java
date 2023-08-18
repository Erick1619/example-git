public class perro {
    //atributos
    public String nombre;
    int edad;
    String raza;
    String color;
    boolean vacunado;
    public int numeropatas;

    //metodos
    //el parametro va en las comillas de ladrar/comer/correr
    public void ladrar(){
        System.out.println(nombre +" esta ladrando");
    }
    public void comer (String alimento){
        System.out.println(nombre +" esta comiendo"+ alimento);
    }
    public void correr (){
        System.out.println(nombre+" esta corriendo");
    }

}
