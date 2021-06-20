/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buscas;

import estrutura.VetorOrdenadoAdjacente;
import grafocidades.Cidade;
import grafocidades.Mapa;

/**
 *
 * @author antonio
 */
public class CustoUniforme {
    private VetorOrdenadoAdjacente fronteira;
    private Cidade objetivo;
    private boolean achou;
    
    public CustoUniforme(Cidade objetivo){      
            this.objetivo = objetivo;
            achou = false;       
    }

    public void buscar(Cidade atual){
        System.out.println("\nAtual:"+ atual.getNome());
        atual.setVisitado(true);
        
        if(atual == objetivo){
            achou = true;
        }else{
            fronteira = new VetorOrdenadoAdjacente(20);
        }
        
    }
    
    
    public static void main(String[] args) {
   
        System.out.println("Aqui");
        
        Mapa m = new Mapa();
        CustoUniforme c = new CustoUniforme(m.getBuscharest());         
        c.buscar(m.getArad());
    }
    
}
