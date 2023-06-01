/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yoel
 */
public class BaseDatosBanco {
    
       
    private Cuenta cuentas[];
    
    
   
    
    public BaseDatosBanco(){
        cuentas = new Cuenta[2];
        // se pasan los atributos como parate de cada cuenta por eso se crea una referencia para cada uno 
        cuentas[ 0 ] = new Cuenta( 12345, 54321, 1000.0, 1200.0 );
        cuentas[ 1 ] = new Cuenta( 98765, 56789, 200.0, 200.0 );
    }
    
    // metodos
    
    private Cuenta obtenerCuenta(int numeroCuenta){
        // tipo, variable arreglo
        for(Cuenta cuentaActual: cuentas){
            if(cuentaActual.obtenerNumeroCuenta() == numeroCuenta){
                return cuentaActual;
            }
            
        }
        return null; // si no encuentra la cuenta solamente retorna null 
    }
    
    public boolean autenticarUsuario(int numeroCuentaUsuario, int nipUsuario){
        Cuenta cuentaUsuario = obtenerCuenta(numeroCuentaUsuario);
        
        if(cuentaUsuario != null)
            return cuentaUsuario.validarNIP( nipUsuario );
        else
            return false;
    }
    
    
    public double obtenerSaldoDisponible(int numeroCuentaUsuario){
        
        return obtenerCuenta( numeroCuentaUsuario ).obtenerSaldoDisponible();
    }
    
    
    public double obtenerSaldoTotal(int numeroCuentaUsuario){
        
        return obtenerCuenta( numeroCuentaUsuario ).obtenerSaldoTotal();
    }
    
    public void abonar(int numeroCuentaUsuario, double monto){
        obtenerCuenta( numeroCuentaUsuario ).abonar( monto );
    }
    
    public void cargar(int numeroCuentaUsuario, double monto){
        obtenerCuenta( numeroCuentaUsuario ).cargar( monto );
    }
    
    
}
