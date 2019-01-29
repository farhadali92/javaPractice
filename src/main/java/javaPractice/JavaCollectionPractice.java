package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionPractice {




    public static void main(String[] args) {

        class Employee {

            int age;
            String name;
            String dep;

            public Employee(int age, String name, String dep) {
                this.age = age;
                this.name = name;
                this.dep = dep;
            }
        }

        Employee e1 = new Employee(33, "farhad", "QA");
        Employee e2 = new Employee(35, "shumail", "dev");
        Employee e3 = new Employee(40, "uzair", "ps4 player");


        List<Employee> ar = new ArrayList<Employee>();
        ar.add(e1);
        ar.add(e2);
        ar.add(e3);


//        Iterator<Employee> it = ar.iterator();
//        while(it.hasNext()) {
//            Employee employee = it.next();
//            System.out.println(employee.age);
//            System.out.println(employee.name);
//            System.out.println(employee.dep);
//        }

        for (Employee emp : ar) {
            System.out.println(emp.age);
            System.out.println(emp.name);
            System.out.println(emp.dep);
        }


    }
}
