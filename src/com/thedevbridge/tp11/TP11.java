/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.tp11;


import java.util.ArrayList;


/**
 *
 * @author florent
 */
public class TP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String t[]={"bonjour","bienvenue","test","api"};
        Trigenerique<String> trietab=new Trigenerique(t);
        trietab.affiche(trietab.trie());
        
    }
    
}
class Trigenerique<T extends Comparable>{
    private T[] tab;

    public Trigenerique(T[] tab) {
        this.tab = tab;
    }

    public T[] getTab() {
        return tab;
    }

    public void setTab(T[] tab) {
        this.tab = tab;
    }
    
    public ArrayList<T> trie(){
        ArrayList<T> t=new ArrayList<T>();
        ArrayList<T> d=new ArrayList<T>();
        for(int i=0;i<tab.length;i++){
            d.add(tab[i]);
        }          
        int f=0;
        while (f< tab.length){
             int e=1; T max1=d.get(0);
             while(e<d.size()){
                 
                    if(max1.compareTo(d.get(e))<0){
                      max1=max1;
                    }
                    else{ max1=d.get(e); 
                    }
                e++;
             } 
             t.add(max1);
             int o=0;
             while(o< d.size()){
                 if(max1==d.get(o)){
                     d.remove(o);
                     break;
                 }
                 o++;
             }
             
           f++;
        }
        
      return t;  
    }
    public void affiche(ArrayList<T> t){
      System.out.print("le nouveau contenu du tableau est: ");
       
        for(T o:t){
            
            System.out.print(" "+o);
           
        }
    }
    
    
}

