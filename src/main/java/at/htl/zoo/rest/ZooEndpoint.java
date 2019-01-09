package at.htl.zoo.rest;

import at.htl.zoo.model.Zoo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("zoo")
@Stateless
public class ZooEndpoint {

    @PersistenceContext
    EntityManager em;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response getDrugTreatment(@PathParam("id") long id) {
        Zoo zoo = em.find(Zoo.class, id);
        return Response
                .ok()
                .entity(zoo)
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/Name/{Name}")
    public Zoo getZooByName(@PathParam("Name") String name) {
        return em.createNamedQuery("Zoo.findByName", Zoo.class).setParameter("Name", name).getSingleResult();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/Ort/{Ort}")
    public Zoo getZooByOrt(@PathParam("Ort") int ort) {
        return em.createNamedQuery("Zoo.findByOrt", Zoo.class).setParameter("Ort", ort).getSingleResult();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/direktor/{direktor}")
    public Zoo getZooByDirektor(@PathParam("direktor") int direktor) {
        return em.createNamedQuery("Zoo.findByDirektor", Zoo.class).setParameter("direktor", direktor).getSingleResult();
    }

    @POST
    public Long putZoo(Zoo zoo) {
        em.persist(zoo);
        return zoo.getId();
    }

    @DELETE
    @Path("{id}")
    public void deleteZoo(@PathParam("id") long id) {
        Zoo c = em.find(Zoo.class, id);
        if(c != null) {
            em.remove(em.contains(c) ? c : em.merge(c));
        }
    }
}
