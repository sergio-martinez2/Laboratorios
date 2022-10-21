/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author Administrator
 */
@Stateless
public class calcbean implements calcbeanLocal {

    
    public Integer dividirinputyoperar(String input) {
        ArrayList<String> inputARRAY = new ArrayList<String>();
        ArrayList<String> numeros = new ArrayList<String>();
        ArrayList<String> signos = new ArrayList<String>();
        String[] partes = null;
        char[] partesSigno = null;
        String Numerospuntos = null;
        String Signospuntos = null;
        int part1, part2,part3, part4,part5,part6;
        int resultado=0;
        
       
       for (int i=0;i<=input.length();i++){
           inputARRAY.add(input);
    }
       for(int i=0;i<=inputARRAY.size();i++){
       if (inputARRAY.get(i).equals("+")||inputARRAY.get(i).equals("*")||inputARRAY.get(i).equals("-")||inputARRAY.get(i).equals("/")){
       signos.add(inputARRAY.get(i));
       numeros.add(".");
       }
       else{
           numeros.add(inputARRAY.get(i));
           
       
       }
       for (int j=0;1<=numeros.size();j++){
       Numerospuntos+=numeros.get(j);
       }
       partes = Numerospuntos.split(".");
       part1 = Integer.parseInt(partes[0]); 
       part2 = Integer.parseInt(partes[1]);
       part3 = Integer.parseInt(partes[2]);
       part4 = Integer.parseInt(partes[3]);
       part5 = Integer.parseInt(partes[4]);
       part6 = Integer.parseInt(partes[5]);
       
       for (int j=0;1<=signos.size();j++){
       Signospuntos+=signos.get(j);
       }
       partesSigno = Signospuntos.toCharArray();
       
       for (int j=0;1<=signos.size();j++){
       if (j==1 && partesSigno.equals("+")){
       resultado = part1+part2;
       }
       else if (j==0 && partesSigno.equals("-")){
       resultado = part1-part2;
       }
       else if (j==0 && partesSigno.equals("*")){
       resultado = part1*part2;
       }
       else if (j==0 && partesSigno.equals("/")){
       resultado = part1/part2;
       }
      //---------------------------------------------------------//  
       if (j==1 && partesSigno.equals("+")){
       resultado = resultado+part3;
       }
       else if (j==1 && partesSigno.equals("-")){
       resultado = resultado-part3;
       }
       else if (j==1 && partesSigno.equals("*")){
       resultado = resultado*part3;
       }
       if (j==1 && partesSigno.equals("/")){
       resultado = resultado/part3;
       }
      //---------------------------------------------------------// 
       if (j==2 && partesSigno.equals("+")){
       resultado = resultado+part4;
       }
       else if (j==2 && partesSigno.equals("-")){
       resultado = resultado-part4;
       }
       else if (j==2 && partesSigno.equals("*")){
       resultado = resultado*part4;
       }
       if (j==2 && partesSigno.equals("/")){
       resultado = resultado/part4;
       }
       //---------------------------------------------------------// 
       if (j==3 && partesSigno.equals("+")){
       resultado = resultado+part5;
       }
       else if (j==3 && partesSigno.equals("-")){
       resultado = resultado-part5;
       }
       else if (j==3 && partesSigno.equals("*")){
       resultado = resultado*part5;
       }
       if (j==3 && partesSigno.equals("/")){
       resultado = resultado/part5;
       }
        //---------------------------------------------------------// 
       if (j==4 && partesSigno.equals("+")){
       resultado = resultado+part6;
       }
       else if (j==4 && partesSigno.equals("-")){
       resultado = resultado-part6;
       }
       else if (j==4 && partesSigno.equals("*")){
       resultado = resultado*part6;
       }
       if (j==4 && partesSigno.equals("/")){
       resultado = resultado/part6;
       }
       
       
        
       
    }
    
        
    }
    return (resultado);
    }

    @Override

    
    public Integer suma(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

