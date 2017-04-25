package flow;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import flow.context.FlowContext;
import flow.exception.FlowException;
import flow.node.Node;

public class FlowUtil {
	
	@SuppressWarnings("resource")
	public static Object start(String startNode, Map<String, Object> params) throws FlowException{
		if(StringUtils.isBlank(startNode)){
			throw new FlowException("start node is empty or error");
		}
		
		//加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-flow.xml"});
		
		//初始化工作流
		FlowContext flowContext = new FlowContext(params);
		Handler node = context.getBean(startNode, Handler.class);
		return node.doFlow(flowContext);
	}
	
}
