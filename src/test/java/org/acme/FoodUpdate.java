package org.acme;


import java.util.List;

public class FoodUpdate {

  List<String> fields;

  public FoodUpdate(List<String> fields) {
    this.fields = fields;
  }

  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }
}