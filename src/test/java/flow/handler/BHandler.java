package flow.handler;

import org.springframework.stereotype.Component;

import flow.DefaultHandler;
import flow.Handler;
import flow.context.FlowContext;
import flow.node.Node;

@Component("bHandler")
public class BHandler extends DefaultHandler {

	@Override
	public Object doFlow(FlowContext flowContext) {
		System.out.println("B");
		return getNext().doFlow(flowContext);
	}

}
