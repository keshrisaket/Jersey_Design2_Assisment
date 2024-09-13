package beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
    private String name;
    private String address;
    private float age;
    private double sal;
    private String id;



    public Employee() { }

    public Employee(String name, String address, float age, double sal, String id) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }

}
