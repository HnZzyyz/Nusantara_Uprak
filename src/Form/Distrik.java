/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author Panda
 */
public class Distrik {
    int id ,regerency_id;
    String name;

    public Distrik() {
    }

    public Distrik(int id, int regerency_id, String name) {
        this.id = id;
        this.regerency_id = regerency_id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegerency_id() {
        return regerency_id;
    }

    public void setRegerency_id(int regerency_id) {
        this.regerency_id = regerency_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
