package org.acme;

import com.blazebit.persistence.integration.jaxrs.EntityViewId;
import com.blazebit.persistence.view.EntityViewManager;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/foods")
public class ExampleResource {

  @Inject
  EntityViewManager entityViewManager;

  @Inject
  EntityManager entityManager;

  @PATCH
  @Path("/{id}")
  @Transactional
  public void update(@PathParam("id") String id, @EntityViewId("id") FoodUpdateView foodUpdate) {
    entityViewManager.save(entityManager, foodUpdate);
  }

  @GET
  @Path("/{id}")
  @Transactional
  public FoodUpdateView get(@PathParam("id") Long id) {
   return entityViewManager.find(entityManager, FoodUpdateView.class, id);
  }
}