/*//programador: Nicolas Alfredo Jimenez
// codigo fuente :programador novato 
// fecha=23/09/2020
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palabrasp;


import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class palabraPalindrome {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog(" escribe un palindromo"); //cuadro emergente de pregunta
        int longitud=texto.length();  //tamaño del texto o cadena de caracteres
        char [] letras=new char[longitud]; // arreglo donde se guardaran las letras
        char [] letrasInv=new char[longitud];// arraglo donde se guardaran las letras invertidas para comparar arrglos
        int inverso=longitud; // contiene el tamaño de las letras
        boolean igual=true;
        for(int i=0;i<longitud;i++){
            letrasInv[i]=texto.toLowerCase().charAt(inverso-1);// comparar los caracteres de la palabra inversa
            inverso--;
            letras[i]=texto.toLowerCase().charAt(i);// texto normal  axamina cada caracter
            if(letrasInv[i]!=letras[i]){   // comparacion de las letras
                igual=false;
                break;    // si las letras son iguales rompe es ciclo 
            }
        }
        if(igual==false){
            System.out.println("errado!!"+ texto +" no es un palindromo"); // imprecion para consolola si es falso
        }
        else{
            System.out.println("Bien !!! "+ texto +" SI es un palindromo");// imprecion para consolola si es verdadero
        }
        
    }
    
}