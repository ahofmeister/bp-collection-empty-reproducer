package org.acme;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Food {

  @Id
  @GeneratedValue
  private Long id;

  @ElementCollection
  private List<String> fields;

}
