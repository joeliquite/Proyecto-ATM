/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yoel
 */
public class Cuenta {
       private int numeroCuenta;
    private int nip;
    private double saldoDisponible; // disponible para retirar
    private double saldoTotal; // disponible mas depositos
    
    //Constructor
    public Cuenta(int numeroCuenta, int nip, double saldoDisponible, double saldoTotal) {
        this.numeroCuenta = numeroCuenta;
        this.nip = nip;
        this.saldoDisponible = saldoDisponible;
        this.saldoTotal = saldoTotal;
    }
    
    // Validar NIP
    public boolean validarNIP( int nipUsuario ){
         if(nipUsuario == nip){
             return true;
         }else{
             return false;
         }
     }
    
    // metodos
    public boolean validarNip(){
        return true;
    }
    
    public double obtenerSaldoDisponible(){
        return saldoDisponible;
    }
    
    public double obtenerSaldoTotal(){
        return saldoTotal;
    }
    
    
    public void abonar(double monto){
        saldoTotal += monto;
    }
    
    public void cargar(double monto){
        saldoDisponible -= monto;
        saldoTotal -= monto; 
    }
    
    public int obtenerNumeroCuenta(){
        return numeroCuenta;
    }
    
}
