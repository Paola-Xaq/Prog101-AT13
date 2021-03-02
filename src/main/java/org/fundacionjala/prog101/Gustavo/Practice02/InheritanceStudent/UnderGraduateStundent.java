package InheritanceStudent;
//import Student
public class UnderGraduateStundent extends Student{
    @Override
    public String computeCourseGrade(){
        int sum=0;
        for (int i : test) {
            sum+=i;
        }
        if(sum/test.length>50){
            this.courseGrade="Approved";
        }else{
            this.courseGrade="Reprobate";
        }
        return courseGrade;
    }
}