package priv.dengjili.jersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import priv.dengjili.service.Hello;

@Path("hello")
@Component
public class JerseyResource {
	
	@Autowired
    private Hello hello;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return String.format("%s: %s", 12342, hello.toMessage());
    }

}
