package OOP;

public class Main {
    public static void main(String[] args){

        Employee e1 = new Employee(); // Employee=(class)  e1 = (creating new object)  Employee() = Contructor

        //! วิธีที่ 1 กำหนดค่า object ผ่าน attribute โดยตรง !!แต่จะไม่ปลอดภัยดพราะไฟล์นี้คนอื่นเข้าถึงได้
        // e1.id="1";  //* object.attribut (assign value to the object)
        // e1.name="Tong";  
        // e1.salary=30000;  
        // System.out.println("ID = " +e1.id);
        // System.out.println("NAME = " +e1.name);
        // System.out.println("SALARY = " +e1.salary);


        //! วิธีที่ 2 กำหนดค่า object ผ่าน method ในไฟล์ Employee.java
        e1.setID("1");   //*  object.method (assign value to the object)
        e1.setName("Tong");
        e1.setSalary(30000);
        e1.displayEmployee();
        System.out.println("using getter: Salary = " +e1.getSalary());

        Employee e2 = new Employee();
        e2.setID("2");   
        e2.setName("Tar");
        e2.setSalary(50000);




        //* Default Constructor */ --> ทำงานเลยเมื่อสร้าง object เสร็จ
        Employee e3 = new Employee();

        //* Custom Constructor */
        Employee e4 = new Employee("4", "Tanny", 80000);
        e4.displayEmployee();
        Employee e5 = new Employee("5", "Khla");  //* ถึงไม่มี salary ก็ยังทำงานได้ */
        e5.displayEmployee();
        




    }
    
}
