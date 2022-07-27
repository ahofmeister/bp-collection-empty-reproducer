package org.acme;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.blazebit.persistence.view.UpdatableEntityView;
import java.util.List;

@EntityView(Food.class)
@UpdatableEntityView
public interface FoodUpdateView {


  @IdMapping
  Long getId();

  void setFields(List<String> fields);

  List<String> getFields();

}
