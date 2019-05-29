package priv.dengjili.jersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import priv.dengjili.filter.MyLog;
import priv.dengjili.service.Hello;

@Path("hello")
@Component
public class JerseyResource {
	Logger logger = LoggerFactory.getLogger("JerseyResource");
	
	@Autowired
    private Hello hello;
    
	@MyLog
    @GET
    @Path("hello1")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
		logger.error("测试hello1：{}", "hello1");
        return String.format("%s: %s", 12342, hello.toMessage());
    }
    
    @GET
    @Path("hahha")
    @Produces(MediaType.TEXT_PLAIN)
    public String hahha() {
    	logger.error("测试hahha：{}", "hahha");
    	return String.format("hahha");
    }

}
