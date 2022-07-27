package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class FoodResourceTest {

  @Test
  public void testpatch() {
    given().when().contentType(ContentType.JSON).body(new FoodUpdate(List.of("A"))).patch("/foods/1");

    Object fieldsWithA = given().when().get("/foods/1").jsonPath().get("fields");
    Assertions.assertEquals(fieldsWithA, List.of("A"));


    given().when().contentType(ContentType.JSON).body(new FoodUpdate(List.of())).patch("/foods/1");
    Object emptyFields = given().when().get("/foods/1").jsonPath().get("fields");
    Assertions.assertEquals(emptyFields, List.of());
  }

}