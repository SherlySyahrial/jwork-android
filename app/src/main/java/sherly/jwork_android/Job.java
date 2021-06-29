package sherly.jwork_android;

/**
 * Class Job, digunakan untuk membuat objek job dan memodifikasinya
 * @author Sherly
 * @version 28-06-2021
 */

public class Job {
    private int id;
    private String name;
    private Recruiter recruiter;
    private int fee;
    private String category;

    /**
     * Konstruktor untuk objek class job
     * @param id
     * @param name
     * @param recruiter
     * @param fee
     * @param category
     */
    public Job(int id, String name, Recruiter recruiter, int fee, String category){
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }

    /**
     * Berfungsi untuk mendapatkan nilai variable id
     * @return id
     */
    public int getId(){
        return id;
    }

    /**
     * Berfungsi untuk mendapatkan nilai variabel name
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Berfungsi untuk mendapatkan nilai variabel recruiter
     * @return recruiter
     */
    public Recruiter getRecruiter(){
        return recruiter;
    }

    /**
     * Berfungsi untuk mendapatkan nilai variabel fee
     * @return fee
     */
    public int getFee(){
        return fee;
    }

    /**
     * Berfungsi untuk mendapatkan variabel kategori
     * @return category
     */
    public String getCategory(){
        return category;
    }

    /**
     * Berfungsi untuk mengatur nilai id
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * Berfungsi untuk mengatur nama
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Berfungsi untuk mengatur recruiter
     * @param recruiter
     */
    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }

    /**
     * Berfungsi untuk mengatur nilai fee
     * @param fee
     */
    public void setFee(int fee){
        this.fee = fee;
    }

    /**
     * Berfungsi untuk mengatur kategori
     * @param category
     */
    public void setCategory(String category){
        this.category = category;
    }
}