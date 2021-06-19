package LECTURE_Stream_API_And_Lambdas.Task4Part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product{

    private String name;
    private Double price;
    private Double discount;
}
