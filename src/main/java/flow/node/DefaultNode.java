package flow.node;

import flow.Handler;
import flow.context.FlowContext;

public class DefaultNode implements Node{

	private Handler handler;
	private Node next;
	

	@Override
	public Object doNext(FlowContext flowContext) {
		if(handler != null) {
			return handler.doFlow(flowContext);
		}
		return null;
	}
	
	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
