package family_tree.Human;

import java.time.LocalDate;
import java.util.*;
import java.io.Serializable;
import family_tree.Family_Tree.*;
import java.lang.String;

public class Human implements Serializable, Node<Human>{
    private String name;
    private LocalDate dob;
    private Gender gender;
    private Human mother,father;
    private Human spousa, spouse;
    private List<Human> children;
    private String placeOfBirth;


    public Human (String name, Gender gender, LocalDate dob , Human father, Human mother, String placeOfBirth, Human spouse, Human spousa)
    {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.father = father;
        this.mother = mother;
        this.spouse = spouse;
        this.spousa = spousa; 
        this.placeOfBirth = placeOfBirth;
        children = new ArrayList<>();
        
    }


    public boolean addChilde(Human child) 
    { 
        if (!children.contains(child))
        { 
            children.add(child); 
            return true;
        }
        return false;
    }

    public String getName()         { return name;}
    public Gender getGender()       { return gender;}
    public LocalDate getDateBirth() { return dob;}
    public String  getPlaceOfBirth(){ return placeOfBirth;}
    public Human getFather()        { return father;}
    public Human getMother()        { return mother;}
    public List<Human> getChildren(){ return children;}
    public Human getSpouse()        { return spouse;}
    public Human getSpousa()        { return spousa;}
  

    public void setName(String name)                    { this.name = name;}
    public void setGender(Gender gender)                { this.gender = gender;}
    public void setDateBirth(LocalDate dob)             { this.dob = dob;}
    public void setFatherr(Human father)                { this.father = father;}
    public void setMother(Human mother)                 { this.mother = mother;}
    public void setSpouse (Human spouse)                { this.spouse =  spouse;}
    public void setSpousa (Human spousa)                { this.spousa =  spousa;}
    public void setPlaceOfBirth (String placeOfBirth)   { this.placeOfBirth = placeOfBirth;}


    public String getData()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Имя: ");                 sb.append(name);                sb.append("; ");
        sb.append("Пол: ");                 sb.append(gender);              sb.append("; ");
        sb.append("Дата рождения: ");       sb.append(dob);                 sb.append("; ");
        sb.append("Место рождения: ");      sb.append(placeOfBirth);        sb.append("; ");
        sb.append("Отец : ");               sb.append(getFatherInfo());     sb.append("; ");
        sb.append("Мать : ");               sb.append(getMotherInfo());     sb.append("; ");
        sb.append("Дети : ");               sb.append(getChildrenInfo());   sb.append(". ");
        if(gender == Gender.Female )
        {
            sb.append("Семейное положение : ");    sb.append(getSpousaInfo()); sb.append(". ");
        } 
        else
        {
            sb.append("Семейное положение : ");    sb.append(getSpouseInfo() ); sb.append(". ");
        }

        return sb.toString();
    }

    public String getFatherInfo() 
    {
        String result = "";
        if (father != null) {result += father.getName();}
        else result += "Информации нет";
        return result;
    }

    public String getMotherInfo() 
    {
        String res = "";
        if (mother != null){res += mother.getName();}
        else res += "Информации нет";
        return res;
    }


    public String getChildrenInfo()
    {
        StringBuilder res = new StringBuilder();
        if (children.size() != 0)
        {
            res.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++) 
            {
                res.append(", ");
                res.append(children.get(i).getName());
            }
        }
        else res.append("Детей нет");
        return res.toString();
    }


    public String getSpouseInfo() 
    {
        String res = "";
        if (spousa != null){res += "супруга " + spousa.getName();}
        else res += "Не женат";
        return res;
    }

    public String getSpousaInfo() 
    {
        String res = "";
        if (spouse != null){res += "супруг " + spouse.getName();}
        else res += "Не жената";
        return res;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (!(obj instanceof Human)) return false;
        Human human = (Human) obj;
     return human.getName().equals(getName());
    }
   
}
