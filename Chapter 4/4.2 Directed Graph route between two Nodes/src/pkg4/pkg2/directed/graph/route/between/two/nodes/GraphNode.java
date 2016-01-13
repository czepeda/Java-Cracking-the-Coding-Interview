/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg2.directed.graph.route.between.two.nodes;


import java.util.ArrayList;

public class GraphNode {
   public int value;
   public boolean isVisited;
   public ArrayList<GraphNode> adjacent;

    public GraphNode(int x) {
       value = x;
       isVisited  = false;
       adjacent = new ArrayList<GraphNode>();
    }
}
