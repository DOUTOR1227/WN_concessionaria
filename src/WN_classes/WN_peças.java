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
public class WN_peças {
    
public int wn_estoque;
public double wn_preço;
public String wn_usada;
public int wn_tempodeuso;
public String wn_modelo;

public void setwn_estoque(int wnestoque){
this.wn_estoque=wnestoque;
}

public int getwn_estoque(){
return this.wn_estoque;
}

public void setwn_preço(double wnpreço){
this.wn_preço=wnpreço;
}

public double getwn_preço(){
return this.wn_preço;
}

public void setwn_usada(String wnusada){
this.wn_usada=wnusada;
}

public String getwn_usada(){
 return this.wn_usada;   
}

public void setwn_tempodeuso(int wntempodeuso){
    this.wn_tempodeuso=wntempodeuso;
}

public int getwn_tempodeuso(){
return this.wn_tempodeuso;
}

public void setwn_modelo(String wnmodelo){
this.wn_modelo=wnmodelo;
}

public String getwn_modelo(){
return this.wn_modelo;
}
















}
