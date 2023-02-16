package ru.nsu.sidey383.examples;

import com.google.common.graph.ImmutableValueGraph;
import com.google.common.graph.ValueGraphBuilder;

import java.util.List;

public class GraphDirector {

    private final ValueGraphBuilder builder;

    public GraphDirector(ValueGraphBuilder builder) {
        this.builder = builder;
    }

    public ImmutableValueGraph<Integer, Integer> getMultipleGraph(List<Integer> nodes) {
        ImmutableValueGraph.Builder builder = this.builder.allowsSelfLoops(true).immutable();
        for (Integer node : nodes)
            builder.addNode(node);
        for (Integer i : nodes) {
            for (Integer j : nodes) {
                if (i < j)
                    builder.putEdgeValue(i, j, -i*j);
                else
                    builder.putEdgeValue(i, j, i*j);
            }
        }
        return builder.build();
    }

}
