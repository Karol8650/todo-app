package com.github.karol8650.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


 /*
 w bazie danych będzie tabela, która odpowiada tej klasie.
 dzięki tej adnotacji każde pole zostanie zmapowane przez Hibernate (jest to implementacja JPA) na kolumnę w tabeli
 */
@Entity
@Table(name = "tasks") // tutaj określamy tą tabelę
public class Task {
    @Id // jedno pole musi mieć @ID
    private int id;
    /*
    można dodać @Column(name = "desc") -> wtedy mamy kolumnę w tabeli o nazwie desc
    Hibernate domyślnie mapuje to na pole, ale można też dodać to nad getterami
    (wszystko musi być na polach lub wszystko na getterach)
     */
    private String description;
    private boolean done;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
