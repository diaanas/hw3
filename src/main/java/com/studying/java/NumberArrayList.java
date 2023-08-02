package com.studying.java;

import java.util.ArrayList;
import java.util.List;

public class NumberArrayList {
  List list = new ArrayList<>();

  void addValue(Object value) {
    list.add(value);
  }

  boolean validate() {
    for (Object o : list) {
      if (o instanceof String) {
        return false;
      }
    }
    return true;
  }

}
