package InheritanceStudent;

public class GraduateStudent extends Student{
    @Override
    public String computeCourseGrade(){
        int sum=0;
        for (int i : test) {
            sum+=i;
        }
        if(sum/test.length>80){
            this.courseGrade="Approved";
        }else{
            this.courseGrade="Reprobate";
        }
        return courseGrade;
    }
}
