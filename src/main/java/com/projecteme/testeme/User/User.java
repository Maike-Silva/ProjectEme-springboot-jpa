package com.projecteme.testeme.User;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements java.io.Serializable {



    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User entities = (User) o;
        return Objects.equals(id, entities.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
