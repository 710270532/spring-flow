package flow.handler;

import org.springframework.stereotype.Component;

import flow.DefaultHandler;
import flow.Handler;
import flow.context.FlowContext;
import flow.node.Node;

@Component("aHandler")
public class AHandler extends DefaultHandler {
	
	@Override
	public Object doFlow(FlowContext flowContext) {
		System.out.println("A");
		
		return getNext().doFlow(flowContext);
	}

}
