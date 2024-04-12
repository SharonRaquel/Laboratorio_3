/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author User
 */
public class Client {
    
  private String id;
  private String name;
  private String phone;
  private String address;
  
  public Client(){}

    public Client(String id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
  
    public String toString(){
    String result = "CLIENT INFORMATION"
            +"\n-----------------------------------------"
            +"\nId: "+this.getId()
            +"\nName: "+this.getName()
            +"\nPhone: "+this.getPhone()
            +"\nAddress: "+this.getAddress();
    
    return result;
    }//toString
    
}
