/**
 * <p>Title: LoggerFilter.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月29日
 * @version 1.0
 */
package priv.dengjili.filter;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import priv.dengjili.util.EventLogger;

/**
 * <p>Title: LoggerFilter</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月29日 下午6:01:07
 */
/**
 * 具体的日志处理过滤器 Created by Administrator on 2017/3/14.
 */
@MyLog // 将过滤器与自定义注解绑定
@Provider // 声明为面向切面组件
@Priority(Priorities.USER) // 声明过滤器的顺序
public class MyLogFilter implements ContainerRequestFilter, ContainerResponseFilter {
	private Logger logger = LoggerFactory.getLogger(MyLogFilter.class);
	
	//请求过滤器
	public void filter(ContainerRequestContext requestContext) throws IOException {
		//记录请求信息，例如请求时间 请求路径 请求参数
		System.out.println("请求过滤器执行了");
		EventLogger.record(logger, "test");
	}

	//响应过滤器
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		//记录相应信息 例如 响应时间 响应数据 响应状态码
		System.out.println("响应过滤器执行了");
	}
}
