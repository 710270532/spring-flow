package flow;

import flow.exception.FlowException;

public class FlowTest {

	public static void main(String[] args) {
		try {
			FlowUtil.start("test.aHandler", null);
		} catch (FlowException e) {
			e.printStackTrace();
		}
	}

}
