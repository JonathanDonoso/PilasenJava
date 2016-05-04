
package datosdinamicos1;

import java.util.Stack;


public class Ejercicios {
    
     Stack pila=new Stack();
     
    
      
     
    public void _1(){
    //pila.get(notas);
        
         pila.push("Mortal Kombat");
         pila.push("Diente de leche");
         pila.push("Monopoly");
         pila.push("ping-pong");
         pila.push("x.videos.com");
         pila.push("Mw3");
       
         
         System.out.println("Mostrar todo "+pila);
         System.out.println("Tamaño pila "+pila.size());
         System.out.println("Mostrar ultimo elemento "+pila.peek());
         System.out.println("Posiciones del elemento "+pila.search("amateurchileno.cl"));
         System.out.println("Eliminar último elemento "+pila.pop());
         System.out.println("Esta pila esta vacia? "+pila.empty());
    
    }
    
         public void getnotas(){
        
         
             for (int i = 0; i < 5; i++) {
             pila.push(6.3);
             pila.push(7.0);
             pila.push(2.0);
             pila.push(5.0);
             pila.push(4.0);
                 System.out.println( pila.get(i));           
             }
    }
    
    
         public void _3(){
            
             Stack otraPila = new Stack();
             otraPila.push(6.3);
             otraPila.push(7.0);
             otraPila.push(2.0);
             otraPila.push(5.0);
             otraPila.push(4.0); 
                  
                for(Object datos: otraPila){
         
                  System.out.println(datos);
                 
             }
         
         
         
         }//.....
         
        public void _4(){
            
           Stack otraPilados=new Stack();
           otraPilados.push("Papelucho empelota");
           otraPilados.push("El diario de Ana frank"); 
          
            while (!otraPilados.empty()){   //distinto de false
                System.out.println("Vaciando la pila! "+otraPilados.empty());
            }
            
        } 
         
         
}
