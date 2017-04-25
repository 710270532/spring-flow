package flow.context;

import java.util.HashMap;
import java.util.Map;

public class FlowContext {
	
	private Map<String, Object> context = new HashMap<String, Object> ();
	
	public FlowContext(){}
	
	public FlowContext(Map<String, Object> params){
		if(params!=null && !params.isEmpty()){
			context.putAll(params);
		}
	}
	
	public Object setAttribute(String key, Object obj) {
		context.put(key, obj);
		return obj;
	}
	
	public Object getAttribute(String key) {
		return context.get(key);
	}

}
