package sherly.jwork_android;

/**
 * CLass Recruiter, untuk recruiter jwork, dan untuk membuat objek recruiter
 * @author Sherly
 * @version 28-06-2021
 */
public class Recruiter {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Konstruktor dari class Recruiter
     * @param id dari recruiter
     * @param name dari recruiter
     * @param email dari recruiter
     * @param phoneNumber dari recruiter
     * @param location dari recruiter
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location){
        this.id = id;
        this.name = name;
        this.email = email ;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
     * Untuk mendapatkan id
     * @return id
     */
    public int getId(){
        return id;
    }

    /**
     * Untuk mendapatkan nama
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Untuk mendapatkan email
     * @return email
     */
    public String getEmail(){
        return email;
    }

    /**
     * Untuk mendapatkan phone number
     * @return phoneNumber
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * Untuk mendapatkan lokasi
     * @return location
     */
    public Location getLocation(){
        return location;
    }

    /**
     * Untuk set id
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * Untuk set nama
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Untuk set email
     * @param email
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * Untuk set phone number
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    /**
     * Untuk set lokasi
     * @param location
     */
    public void setLocation(Location location){
        this.location = location;
    }
}