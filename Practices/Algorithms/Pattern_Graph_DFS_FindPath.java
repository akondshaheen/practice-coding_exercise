package Practices.Algorithms;

import java.util.*;

public class Pattern_Graph_DFS_FindPath {    private Map<String, List<String>> graph = new HashMap<>();

    // Add a node (point) to the graph
    public void addNode(String node) {
        graph.putIfAbsent(node, new ArrayList<>());
    }

    // Add an edge (connection) between two nodes
    public void addEdge(String from, String to) {
        graph.get(from).add(to);  // Connect 'from' to 'to'
        graph.get(to).add(from);  // Connect 'to' to 'from' (Undirected graph)
    }

    // Print the entire graph structure
    public void printGraph() {
        for (String node : graph.keySet()) {
            System.out.println(node + " --> " + graph.get(node));
        }
    }

    // DFS method to check if a path exists between two nodes
    public boolean hasPathDFS(String start, String end, Set<String> visited) {
        if (start.equals(end)) {
            return true; // Found the destination node
        }

        if (visited.contains(start)) {
            return false; // Avoid visiting the same node again
        }

        visited.add(start);  // Mark this node as visited

        // Explore all neighbors of the current node
        for (String neighbor : graph.get(start)) {
            if (hasPathDFS(neighbor, end, visited)) {
                return true;  // If a path is found, return true
            }
        }

        return false;  // If no path is found, return false
    }

    // Main method to test DFS
    public static void main(String[] args) {
        Pattern_Graph_DFS_FindPath graph = new Pattern_Graph_DFS_FindPath();

        // Adding nodes (points)
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        // Adding edges (connections)
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");

        // Print the graph structure
        graph.printGraph();

        // Search for a path using DFS
        Set<String> visited = new HashSet<>();
        boolean pathExists = graph.hasPathDFS("A", "D", visited);
        System.out.println("Is there a path from A to D? " + pathExists);
    }
}
