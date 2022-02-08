
package guiproject;


public class Players {
    private String name;
  
    private String sex;
    private int id;
   
    
    public Players() {
        
    
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  



    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     @Override
    public String toString() {
          return String.format("Player: %s%nID: %d%nSex: %s", name,id,sex);
    }
    
    

}
