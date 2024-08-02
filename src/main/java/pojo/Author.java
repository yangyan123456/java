package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private Long id;
    private String name;
    private int age;
    private String intro;
    private List<Book> books;
}
