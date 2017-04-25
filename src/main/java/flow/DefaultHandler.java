package flow;

import flow.context.FlowContext;
import flow.node.Node;

public class DefaultHandler implements Handler {
	
	private Handler next;

	public Handler getNext() {
		return next;
	}

	public void setNext(Handler next) {
		this.next = next;
	}

	@Override
	public Object doFlow(FlowContext flowContext) {
		// TODO Auto-generated method stub
		return null;
	}

}
