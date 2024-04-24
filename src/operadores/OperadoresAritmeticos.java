/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

/**
 *
 * @author ASUS
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Operadores de asignación (=)
        int a = 16, b = 8;
        
        //Operadores aritméticos (+ , - , * , / , %)
        //Suma
        int suma;
        suma = a + b;
        System.out.println("Suma: "+suma);
        
        //Resta
        int resta;
        resta = a - b;
        System.out.println("Resta: "+resta);
        
        //Multiplicación
        int multi;
        multi = a * b;
        System.out.println("Multiplicacion: "+multi);
        
        //División
        float div;
        div = (float)a / (float)b;
        System.out.println("Division: "+div);
        
        //Modulo o residuo
        int resi;
        resi = a % b;
        System.out.println("Residuo: "+resi);
        
    }
}
