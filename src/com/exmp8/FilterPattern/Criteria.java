package com.exmp8.FilterPattern;
import java.util.List;

public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}