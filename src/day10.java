import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
public class day10 {
    public static void main(){
        students.add("kumar");
        students.add("devil");
        students.add("Kavin");
        students.add("Ram");
        students.add("Arun");
        System.out.println("Student List:");
        for (String s : students) {
            System.out.println(s);
        }
        students.remove("Ram");
        System.out.println("\nAfter Removing Ram:");


        for (String s : students) {
            System.out.println(s);
        }
    }
}

 */
public class day10 {
    static void main() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("kumar");
        list.add("ravi");
        list.add("kiran");
        list.add("bharanii");
        list.add("ram");
        while(!list.isEmpty()) {
            process(list);
        }
    }
    static void process(LinkedList<String> list){
        String removed=list.removeFirst();
        System.out.println("Removed:"+removed);

    }
}

