package InheritanceStudent;

public class Student {
    public int NUM_OF_TESTS;
    protected String name;
    protected int test[];
    protected String courseGrade;
    private int INDICE=0;
    public Student() {
        test=new int[NUM_OF_TESTS];
    }

    public Student(String name) {
        this.name = name;
        test=new int[NUM_OF_TESTS];
    }

    public String getCourseGrade(){
        return courseGrade;
    }

    public String getName(){
        return name;
    }

    public int getTestScore(int indice){
        return test[indice];
    }

    public void setName(String name){
        this.name=name;
    }

    public void setTestScore(int Score){
        if (INDICE<test.length){
            test[INDICE]=Score;
            INDICE++;
        }
    }

    public String computeCourseGrade(){
        return courseGrade;
    }

}
