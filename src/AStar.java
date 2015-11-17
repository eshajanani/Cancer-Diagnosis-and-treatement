import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;


public class AStar<T> {

    private final GraphAStar<T> graph;

   

    public AStar (GraphAStar<T> graphAStar) {
        this.graph = graphAStar;
    }
 public AStar()
    {
        this.graph = null;
    }
    // extend comparator.
    public class NodeComparator implements Comparator<NodeData<T>> {
        public int compare(NodeData<T> nodeFirst, NodeData<T> nodeSecond) {
            if (nodeFirst.getF() > nodeSecond.getF()) return 1;
            if (nodeSecond.getF() > nodeFirst.getF()) return -1;
            return 0;
        }
    } 

    /**
     * Implements the Dallas-star algorithm and returns the path from source to destination
     * 
     * @param source        the source nodeid
     * @param destination   the destination nodeid
     * @return              the path from source to destination
     */
    public List<T> do_astar(T source, T destination) {
        /**
         * http://stackoverflow.com/questions/20344041/why-does-priority-queue-has-default-initial-capacity-of-11
         */
        final Queue<NodeData<T>> openQueue = new PriorityQueue<NodeData<T>>(11, new NodeComparator()); 

        NodeData<T> sourceNodeData = graph.getNodeData(source);
        sourceNodeData.setG(0);
        sourceNodeData.calcF(destination);
        openQueue.add(sourceNodeData);

        final Map<T, T> path = new HashMap<T, T>();
        final Set<NodeData<T>> closedList = new HashSet<NodeData<T>>();

        while (!openQueue.isEmpty()) {
            final NodeData<T> nodeData = openQueue.poll();

            if (nodeData.getNodeId().equals(destination)) { 
                return path(path, destination);
            }

            closedList.add(nodeData);

            for (java.util.Map.Entry<NodeData<T>, Double> neighborEntry : graph.edgesFrom(nodeData.getNodeId()).entrySet()) {
                NodeData<T> neighbor = neighborEntry.getKey();

                if (closedList.contains(neighbor)) continue;

                double distanceBetweenTwoNodes = neighborEntry.getValue();
                double tentativeG = distanceBetweenTwoNodes + nodeData.getG();

                if (tentativeG < neighbor.getG()) {
                    neighbor.setG(tentativeG);
                    neighbor.calcF(destination);

                    path.put(neighbor.getNodeId(), nodeData.getNodeId());
                    if (!openQueue.contains(neighbor)) {
                        openQueue.add(neighbor);
                    }
                }
            }
        }

        return null;
    }


    private List<T> path(Map<T, T> path, T destination) {
        assert path != null;
        assert destination != null;

        final List<T> pathList = new ArrayList<T>();
        pathList.add(destination);
        while (path.containsKey(destination)) {
            destination = path.get(destination);
            pathList.add(destination);
        }
        Collections.reverse(pathList);
        return pathList;
    }


    public String  preform_Astar(String cur_loc, String dest) {
        Map<String, Map<String, Double>> hueristic = new HashMap<String, Map<String, Double>>();
        // map for Dallas    
        Map<String, Double> mapA = new HashMap<String, Double>();
        mapA.put("Dallas",  0.0);
        mapA.put("Frisco", 10.0);
        mapA.put("Plano", 20.0);
        mapA.put("Irving_Hospital", 15.0);
        mapA.put("DFW", 100.0);
        mapA.put("Addision", 110.0);
        mapA.put("McKinney_Hospital", 25.0);
        mapA.put("Allen_Hospital", 25.0);
        mapA.put("Coppell_Hospital", 105.0);

        // map for Frisco
        Map<String, Double> mapB = new HashMap<String, Double>();
        mapB.put("Dallas", 10.0);
        mapB.put("Frisco",  0.0);
        mapB.put("Plano", 10.0);
        mapB.put("Irving_Hospital", 5.0);
        mapB.put("DFW", 25.0);
        mapB.put("Addision", 40.0);
        mapB.put("McKinney_Hospital", 15.0);
        mapB.put("Allen_Hospital", 15.0);
        mapB.put("Coppell_Hospital", 25.0);

        // map for Plano
        Map<String, Double> mapC = new HashMap<String, Double>();
        mapC.put("Dallas", 20.0);
        mapC.put("Frisco", 10.0);
        mapC.put("Plano",  0.0);
        mapC.put("Irving_Hospital", 15.0);
        mapC.put("DFW", 10.0);
        mapC.put("Addision", 30.0);
        mapC.put("McKinney_Hospital", 10.0);
        mapC.put("Allen_Hospital", 5.0);
        mapC.put("Coppell_Hospital", 15.0);

        // map for Irving_Hospital
        Map<String, Double> mapD = new HashMap<String, Double>();
        mapD.put("Dallas", 15.0);
        mapD.put("Frisco", 5.0);
        mapD.put("Plano",  15.0);
        mapD.put("Irving_Hospital", 0.0);
        mapD.put("DFW", 25.0);
        mapD.put("Addision", 35.0);
        mapD.put("McKinney_Hospital", 20.0);
        mapD.put("Allen_Hospital", 25.0);
        mapD.put("Coppell_Hospital", 30.0);
        
        
        // map for DFW
        Map<String, Double> mapE = new HashMap<String, Double>();
        mapE.put("Dallas", 100.0);
        mapE.put("Frisco", 25.0);
        mapE.put("Plano", 10.0);
        mapE.put("Irving_Hospital", 25.0);
        mapE.put("DFW",  0.0);
        mapE.put("Addision", 10.0);
        mapE.put("McKinney_Hospital", 20.0);
        mapE.put("Allen_Hospital", 15.0);
        mapE.put("Coppell_Hospital", 5.0);

        // map for Addision
        Map<String, Double> mapF = new HashMap<String, Double>();
        mapF.put("Dallas", 110.0);
        mapF.put("Frisco",  40.0);
        mapF.put("Plano",  30.0);
        mapF.put("Irving_Hospital", 35.0);
        mapF.put("DFW", 10.0);
        mapF.put("Addision",  0.0);
        mapF.put("McKinney_Hospital", 40.0);
        mapF.put("Allen_Hospital", 35.0);
        mapF.put("Coppell_Hospital", 5.0);
        
        // map for McKinney_Hospital
        Map<String, Double> mapG = new HashMap<String, Double>();
        mapG.put("Dallas", 30.0);
        mapG.put("Frisco",  15.0);
        mapG.put("Plano",  10.0);
        mapG.put("Irving_Hospital", 20.0);
        mapG.put("DFW", 20.0);
        mapG.put("Addision",  30.0);
        mapG.put("McKinney_Hospital", 0.0);
        mapG.put("Allen_Hospital", 5.0);
        mapG.put("Coppell_Hospital", 25.0);
        
        // map for Allen_Hospital
        Map<String, Double> mapH = new HashMap<String, Double>();
        mapH.put("Dallas", 25.0);
        mapH.put("Frisco",  15.0);
        mapH.put("Plano",  5.0);
        mapH.put("Irving_Hospital", 25.0);
        mapH.put("DFW", 15.0);
        mapH.put("Addision",  35.0);
        mapH.put("McKinney_Hospital", 5.0);
        mapH.put("Allen_Hospital", 0.0);
        mapH.put("Coppell_Hospital", 20.0);
        
        // map for Coppell_Hospital
        Map<String, Double> mapI = new HashMap<String, Double>();
        mapI.put("Dallas", 105.0);
        mapI.put("Frisco",  25.0);
        mapI.put("Plano",  15.0);
        mapI.put("Irving_Hospital", 30.0);
        mapI.put("DFW", 5.0);
        mapI.put("Addision", 5.0);
        mapI.put("McKinney_Hospital", 25.0);
        mapI.put("Allen_Hospital", 20.0);
        mapI.put("Coppell_Hospital", 0.0);
        

        hueristic.put("Dallas", mapA);
        hueristic.put("Frisco", mapB);
        hueristic.put("Plano", mapC);
        hueristic.put("Irving_Hospital", mapD);
        hueristic.put("DFW", mapE);
        hueristic.put("Addision", mapF);
        hueristic.put("McKinney_Hospital", mapG);
        hueristic.put("Allen_Hospital", mapH);
        hueristic.put("Coppell_Hospital", mapI);

        GraphAStar<String> graph = new GraphAStar<String>(hueristic);
        graph.addNode("Dallas");
        graph.addNode("Frisco");
        graph.addNode("Plano");
        graph.addNode("Irving_Hospital");
        graph.addNode("DFW");
        graph.addNode("Addision");
        graph.addNode("McKinney_Hospital");
        graph.addNode("Allen_Hospital");
        graph.addNode("Coppell_Hospital");

        graph.addEdge("Dallas", "Frisco",  10);
        graph.addEdge("Dallas", "DFW", 100);
        graph.addEdge("Frisco", "Plano", 10);
        graph.addEdge("Plano", "DFW", 10);
        graph.addEdge("Plano", "Addision", 30);
        graph.addEdge("DFW", "Addision", 10);
        graph.addEdge("Frisco", "Irving_Hospital", 5);
        graph.addEdge("Frisco", "McKinney_Hospital", 15);
        graph.addEdge("Plano", "Allen_Hospital", 5);
        graph.addEdge("Allen_Hospital", "McKinney_Hospital", 5);
        graph.addEdge("DFW", "Coppell_Hospital", 5);
        graph.addEdge("Addision", "Coppell_Hospital", 5);

        AStar<String> aStar = new AStar<String>(graph);
        String path_take=" ";
        for (String path : aStar.do_astar(cur_loc, dest)) {
            System.out.println(path);
            path_take=path_take+path+" , ";     
        }
        return path_take;
    }
}