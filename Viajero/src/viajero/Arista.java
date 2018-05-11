/*
 * Esta clase arista será únicamente para representar la trayectoria después del DFS.
 */
package viajero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emmanuel
 */
public class Arista {
    Vertice v1;
    Vertice v2;
    
    public Arista(){}
    
    public Arista(Vertice vert1, Vertice vert2){
        v1 = vert1;
        v2 = vert2;
    }
    
    @Override
    public String toString(){
        return "("+v1+","+v2+")";
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Arista){
            Arista ob = (Arista)o;
            return (v1==ob.v1 && v2==ob.v2) || (v1==ob.v2 && v2==ob.v1);
        }
        return false;
    }
    
}
