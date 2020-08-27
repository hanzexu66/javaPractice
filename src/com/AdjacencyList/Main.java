package com.AdjacencyList;

public class Main {

    public static void main(String[] args) {
        graph ga=new graph();
        ga.addVnode("a");
        ga.addVnode("b");
        ga.addVnode("c");
        ga.addVnode("d");
        ga.addEnode("a","b");
        ga.addEnode("a","c");
        ga.addEnode("b","c");
        ga.addEnode("c","b");
        ga.addEnode("b","b");
        ga.addEnode("d","a");
        ga.addEnode("d","b");
        ga.printAllEdges();
    }
}
