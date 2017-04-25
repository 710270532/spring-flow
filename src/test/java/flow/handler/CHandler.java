package flow.handler;

import org.springframework.stereotype.Component;

import flow.DefaultHandler;
import flow.Handler;
import flow.context.FlowContext;
import flow.node.Node;

@Component("cHandler")
public class CHandler extends DefaultHandler {

	@Override
	public Object doFlow(FlowContext flowContext) {
		System.out.println("C");
		return null;
	}

}
