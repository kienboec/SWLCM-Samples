package swlcm.sample1;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api/sample")
public class SampleController {

    public static int myCounter = 0;

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String GetSample(){
        // return "<html><head><title>Sample</title></head>" +
        //         "<body>This is my sample</body></html>";
        System.out.println("request received (GET)");
        myCounter++;
        return "counter: " + myCounter;
    }

    @POST
    @Path("/{delta}")
    @Produces(MediaType.TEXT_PLAIN)
    public String PostSample(@PathParam("delta") int delta){
        System.out.println("request received (POST)");
        myCounter = myCounter + delta;
        return "counter: " + myCounter;
    }
}
