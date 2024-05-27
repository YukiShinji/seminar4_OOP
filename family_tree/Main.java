package family_tree;

import java.time.LocalDate;
import java.util.logging.FileHandler;
import family_tree.Family_Tree.Family_Tree;
import family_tree.Human.Gender;
import family_tree.Human.Human;

public class Main {
    public static void main(String[] args) {
                
       FileHandler fileHandler = new FileHandler();
       String file = "family_tree/familyTree.txt";

       Family_Tree<Human> family_tree = new Family_Tree<>();
       
      

        family_tree.add(new Human("1", Gender.Male, LocalDate.of(1,1,1), null, null, "",null,family_tree.getByName("")));

        System.out.println(family_tree.getData());

        fileHandler.save(family_tree, file);

        family_tree.sortByName();
        System.out.println(family_tree.getData());

        family_tree.sortByDob();
        System.out.println(family_tree.getData());
        
        family_tree.sortByPlaceOfBirth();
        System.out.println(family_tree.getData());
    }
}