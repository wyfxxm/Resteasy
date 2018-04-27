package org.jboss.resteasy.test.rx.rxjava2.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.test.rx.resource.TRACE;
import org.jboss.resteasy.test.rx.resource.Thing;

import io.reactivex.Single;

@Path("")
public interface Rx2SingleResource {

   @GET
   @Path("get/string")
   @Produces(MediaType.TEXT_PLAIN)
   public Single<String> get();

   @GET
   @Path("get/thing")
   @Produces(MediaType.APPLICATION_JSON)
   public Single<Thing> getThing();

   @GET
   @Path("get/thing/list")
   @Produces(MediaType.APPLICATION_JSON)
   public Single<List<Thing>> getThingList();

   @PUT
   @Path("put/string")
   @Consumes(MediaType.TEXT_PLAIN)
   @Produces(MediaType.TEXT_PLAIN)
   public Single<String> put(String s);

   @PUT
   @Path("put/thing")
   @Consumes(MediaType.TEXT_PLAIN)
   @Produces(MediaType.APPLICATION_JSON)
   public Single<Thing> putThing(String s);

   @PUT
   @Path("put/thing/list")
   @Consumes(MediaType.TEXT_PLAIN)
   @Produces(MediaType.APPLICATION_JSON)
   public Single<List<Thing>> putThingList(String s);

   @POST
   @Path("post/string")
   @Consumes(MediaType.TEXT_PLAIN)
   @Produces(MediaType.TEXT_PLAIN)
   public Single<String> post(String s);

   @POST
   @Path("post/thing")
   @Consumes(MediaType.TEXT_PLAIN)
   @Produces(MediaType.APPLICATION_JSON)
   public Single<Thing> postThing(String s);

   @POST
   @Path("post/thing/list")
   @Consumes(MediaType.TEXT_PLAIN)
   @Produces(MediaType.APPLICATION_JSON)
   public Single<List<Thing>> postThingList(String s);

   @DELETE
   @Path("delete/string")
   @Produces(MediaType.TEXT_PLAIN)
   public Single<String> delete();

   @DELETE
   @Path("delete/thing")
   @Produces(MediaType.APPLICATION_JSON)
   public Single<Thing> deleteThing();

   @DELETE
   @Path("delete/thing/list")
   @Produces(MediaType.APPLICATION_JSON)
   public Single<List<Thing>> deleteThingList();

   @HEAD
   @Path("head/string")
   @Produces(MediaType.TEXT_PLAIN)
   public Single<String> head();

   @OPTIONS
   @Path("options/string")
   @Produces(MediaType.TEXT_PLAIN)
   public Single<String> options();

   @OPTIONS
   @Path("options/thing")
   @Produces(MediaType.APPLICATION_JSON)
   public Single<Thing> optionsThing();

   @OPTIONS
   @Path("options/thing/list")
   @Produces(MediaType.APPLICATION_JSON)
   public Single<List<Thing>> optionsThingList();

   @TRACE
   @Path("trace/string")
   @Produces(MediaType.TEXT_PLAIN)
   public Single<String> trace();

   @TRACE
   @Path("trace/thing")
   @Produces(MediaType.APPLICATION_JSON)
   public Single<Thing> traceThing();

   @TRACE
   @Path("trace/thing/list")
   @Produces(MediaType.APPLICATION_JSON)
   public Single<List<Thing>> traceThingList();
   
   @GET
   @Path("exception/unhandled")
   public Single<Thing> exceptionUnhandled() throws Exception;

   @GET
   @Path("exception/handled")
   public Single<Thing> exceptionHandled() throws Exception;
}
