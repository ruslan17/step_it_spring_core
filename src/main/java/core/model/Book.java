package core.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_author",
    joinColumns = @JoinColumn(name = "book_id",
    referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "author_id",
    referencedColumnName = "id")
    )
    @JsonManagedReference
    private Set<Author> authors;

}