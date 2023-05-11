package Lab.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * JPA Entity intended to model a grocery store.
 *
 * For the sake of brevity, Lombok is also used to automatically generate boilerplate code.
 */
@Entity
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Store {
    @Id
    private long id;
    private String name;
    private String address;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
