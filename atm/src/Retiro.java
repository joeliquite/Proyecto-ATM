/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yoel
 */
public class Retiro extendes Transaccion {
 public Retiro(int numeroCuentaUsuario,BaseDatosBanco baseDatosBancoATM  ){
     super( numeroCuentaUsuario, baseDatosBancoATM );   
    }
    
    // metodos
    @Override
     public void ejecutar(){
        System.out.println("Se retiro dinero");
    }
   
}
