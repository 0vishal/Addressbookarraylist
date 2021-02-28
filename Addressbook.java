import java.util.ArrayList;
import java.util.Scanner;

class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, String city , String state,String zip, String phoneNumber, String email){

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhonenumber() {
        return phoneNumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phoneNumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Empname " + firstName + " Lastname" + lastName + " address" + address + " city " + state + " zip " + zip +
                " phonenumber" + phoneNumber + " email" + email;

    }

}




public class Addressbook {

    static ArrayList<Contact> list = new ArrayList<Contact>();
    static Scanner sc = new Scanner(System.in);

    private void AddContact() {
        System.out.println("Enter FirstName");
        String firstName = sc.next();
        System.out.println("Enter LastName");
        String lastName = sc.next();
        System.out.println("Enter Address");
        String area = sc.next();
        System.out.println("Enter CityName");
        String city = sc.next();
        System.out.println("Enter StateName");
        String state = sc.next();
        System.out.println("Enter ZipCode");
        String zip = sc.next();
        System.out.println("Enter PhoneNumber");
        String phoneNumber = sc.next();
        System.out.println("Enter Email");
        String email = sc.next();

        list.add(new Contact(firstName, lastName, area, city, state, zip, phoneNumber, email));
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Problem\n");

        Addressbook info = new Addressbook();

        info.AddContact();
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        
    }

}
