package flow;

import flow.context.FlowContext;
import flow.node.Node;

public interface Handler {
    Object doFlow(FlowContext flowContext);
}