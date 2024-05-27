package family_tree.Family_Tree;

import java.util.List;
import java.time.LocalDate;

public interface Node<T> {
    boolean addChilde(T child) ;
    T getFather();
    T getMother();
    T getSpouse();
    T getSpousa();
    String getName();
    List<T> getChildren();
    String getPlaceOfBirth();
    LocalDate getDateBirth();
    String getData();
    String getFatherInfo(); 
    String getMotherInfo(); 
    String getChildrenInfo();
    String getSpousaInfo();
    String getSpouseInfo();
  

}