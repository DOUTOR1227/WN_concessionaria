/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WN_classes;

/**
 *
 * @author Wallison
 */
public class WN_vendedor extends WN_funcionarios {
 
   
    
    @Override
    public double wn_h_extra() {
   return this.wn_horaextra=this.wn_saldo+(this.wn_saldo*50)/100;
    }   

WN_vendedor(String n, double s, double ht, int cpf, double hx){
this.wn_nome=n;
this.wn_saldo=s;
this.wn_HT=ht;
this.wn_cpf=cpf;
this.wn_horaextra=hx;
this.wn_FGTS=(this.wn_saldo*8)/100;



}
}