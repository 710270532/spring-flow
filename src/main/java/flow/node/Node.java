package flow.node;

import flow.context.FlowContext;

public interface Node {
    Object doNext(FlowContext flowContext);
}
