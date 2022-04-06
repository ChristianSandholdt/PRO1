package Exercise04;

public class Personer {
    // Navne
    public String firstName;
    public String surName;
    public String middleName;



    public Personer(String firstName, String middleName, String surName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.surName = surName;
    }

    public void getName(){
        System.out.println("Full name: " + firstName + " " + middleName + " " + surName);
    }
    public String getUsername() {
        return firstName.substring(0, 2).toUpperCase() + middleName.length() + surName.substring(surName.length() - 2).toLowerCase();
    }

    public String getInits() {
        return "" + firstName.charAt(0) + middleName.charAt(0) + surName.charAt(0);
    }}




