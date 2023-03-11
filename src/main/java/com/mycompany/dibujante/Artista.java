
package com.mycompany.dibujante;

public class Artista {
    String nombre;
    String apellido;
    String lugar;
    int edad;
    String sexo;
    
    public Artista(){
    }
    
    public Artista (String n, String a, String l, int e, String s){
        this.nombre=n;
        this.apellido=a;
        this.lugar=l;
        this.edad=e;
        this.sexo=s;
        
    
    } 
     public void Soy (){
       
        System.out.println("Soy!!" +nombre);
        System.out.println("Mi Apellido es:" +apellido);
        System.out.println("Vivo en: " +lugar);
        System.out.println("Tengo la edad de: " +edad);
        System.out.println("Sexo: " +sexo);
    }
     public void Pinta (){
       
        System.out.println(nombre +" Pinta : Retratos, Murales, y Rotulos publicidad ");
    
    }
      public void Piensa (String en){
       
        System.out.println(nombre +" cual sera mi siguiente obra la monalizza?"+en);
    
    } 
      public void sueño (String mi){
       
        System.out.println(nombre +" Ser famoso y inspirar a muchos es" +mi);
    
    } 
}
