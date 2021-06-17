package Lecture_Annotation_Task1;

public class Demo {

    public static void main(String[] args) throws Exception {
        var annotatedClass = new AnnotatedClass();
        var generatedValue = new GenerateIntValueAnnotationProcess();
        generatedValue.analyze(annotatedClass);
        System.out.println(annotatedClass);
    }
}
