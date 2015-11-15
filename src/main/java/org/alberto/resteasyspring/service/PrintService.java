package org.alberto.resteasyspring.service;

import org.alberto.resteasyspring.model.ModelManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * PrintService
 *
 * @author <a href="mailto:nobuj_000@gmail.com">nobuj_000</a>
 * @version $Id$
 * @since Nov 14, 2015
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Component
@Path("/customer")
public class PrintService {

    @Autowired
    ModelManager manager;

    @GET
    @Path("/print")
    public Response printMessage() {

	final String result = manager.getMessage();
	return Response.status(200).entity(result).build();

    }

}
