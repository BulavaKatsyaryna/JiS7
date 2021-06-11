package Exercises.AnnotationAndReflectionAPI;

import java.lang.reflect.Method;

public class Meta {

    @MyAnnotation(str = "Line", val = 100)

    public static void myMeth() {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.str() + " " + annotation.val());
        } catch (NoSuchMethodException exception) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
