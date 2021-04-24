import java.util.Objects;

public class Animal {

        private Integer age;
        private String name;
        private Integer weight;

    public Animal() {
    }

    public Animal(Integer age, String name, Integer weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    protected void eat() {
        System.out.println("The animal is eating.");
    }
    protected void sleep() {
        System.out.println("The animal is sleeping.");
    }


    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(age, animal.age) && Objects.equals(name, animal.name) && Objects.equals(weight, animal.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
