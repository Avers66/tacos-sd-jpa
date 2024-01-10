package avers66.tacocloud;


import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Taco
 *
 * @Author Tretyakov Alexandr
 */

@Data
@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date createdAt = new Date();

    @NotNull
    @Size(min = 2, message = "Название рецепта должно быть более двух символов")
    private String name;


    @Size(min = 1, message = "Нужно выбрать не менее одного ингредиента")
    @ManyToMany
    private List<Ingredient> ingredients = new ArrayList<>();


    public void addIngredient(Ingredient ingredient) {this.ingredients.add(ingredient);}
}
