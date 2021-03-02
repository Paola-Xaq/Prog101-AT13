public class Student {
    static final int NUM_OF_TESTS = 5;
    protected String name;
    protected int[] test;
    protected String courseGrade;
    public Student() { }
    public Student(String name) {
        this.name = name;
    }
    public String getCourseGrade() {
        return this.courseGrade;
    }

    public String getName() {
        return this.name;
    }

    public int getTestScore(int testId) {
        int score = 0;
        for (int i = 0; i < NUM_OF_TESTS - 1; i++) {
            if (i == testId) {
                score = this.test[i];
            }
        }
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(int score, int testId) {
        for (int i = 0; i < (NUM_OF_TESTS - 1); i++) {
            if (i == testId) {
                this.test[i] = score;
            } else {
                System.out.println("Invalid test ID");
            }
        }
    }

    public String computeCourseGrade() {
        int sum = 0;
        for (int i = 0; i < (NUM_OF_TESTS - 1); i++) {
            sum += this.test[i];
        }
        if ((sum/NUM_OF_TESTS) > 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
