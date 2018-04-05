package pe.com.practicaguevara.practicaguevara02;

/**
 * Created by Alumno on 5/04/2018.
 */

public class Restaurant {
    private Integer id;
    private String fullname;
    private String descripcion;

    public Restaurant(){

    }
    public Restaurant(Integer id, String fullname, String descripcion){
        this.id = id;
        this.fullname = fullname;
        this.descripcion = descripcion;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String email) {
        this.descripcion = email;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

}