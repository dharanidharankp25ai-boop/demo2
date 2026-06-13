public class day8 {
    record CourseRecord(String department, String section){
    }

    static void main() {
        CourseRecord courseRecord=new CourseRecord("AI","S-1");
        System.out.println(courseRecord.department);
        System.out.println(courseRecord.section);

    }
}