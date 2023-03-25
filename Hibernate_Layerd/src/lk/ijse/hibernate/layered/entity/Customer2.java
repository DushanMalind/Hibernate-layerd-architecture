package lk.ijse.hibernate.layered.entity;/*
package lk.ijse.hiberanate.entity;

import lk.ijse.hiberanate.embedded.CusName;
import lk.ijse.hiberanate.embedded.MobilNumber;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


//@Entity
//@Entity(name="Customer")
//@Table(name="Customer")
//public class Customer {
//    @Id
//    @Column(name = "Customer_id")
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private long id;
////    @Column(name = "Customer_name")
//    private CusName name;
//    @Column(name = "Customer_address")
//    private String address;
//    @Column(name = "Customer_salary")
//    private double salary;
//
//    @Column(name ="Customer_age",columnDefinition = "SMALLINT")
//    private int age;
//
//    @ElementCollection
//    @CollectionTable(name = "Customer_mobil_nos",joinColumns = @JoinColumn(name = "Customer_id"))
//    private List<MobilNumber> phoneNumbers=new ArrayList<>();
//
//    @Transient
//    private String dob;
//
//    @CreationTimestamp
//    private Date createDate;
//    @CreationTimestamp
    private Time time;

    public Customer() {
    }

    public Customer(long id, CusName name, String address, double salary, int age, List<MobilNumber> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public Customer(long id, CusName name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<MobilNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<MobilNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CusName getName() {
        return name;
    }

    public void setName(CusName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
*/
