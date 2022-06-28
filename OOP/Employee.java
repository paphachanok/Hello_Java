package OOP;

class Employee {
    //* Attribute */
    //! วิธีที่ 1
    // public String id;
    // public String name;
    // public double salary;



    //! วิธีที่ 2
    private String id;  //* -> can't be assess by others, in order to protect data
    private String name;
    private double salary;

    //* Method */
    public void setID(String id){   //* สร้าง method และใช้ set เพื่อกำหนดค่า
        this.id = id;               //* this.attribute บ่งบอกว่าอ้าอิงไปถึง attribute ข้างบน, = id บ่งบอกให้รับค่าจาก Main.java
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public void displayEmployee(){
        System.out.println("ID = " +this.id);  //* this.id เพื่อเข้าถึง attribute */
        System.out.println("Name = " +this.name);
        System.out.println("Salary = " +this.salary);
    }

    //* ดึงค่ามาใช้งานโดยใช้ get */
    public double getSalary(){
        return this.salary;     //* ใช้ return เผื่อสร้าง method ที่มีต้องบวก salary + ค่า OT */
    }



    //! Default Constructor */ --> Constructor จะทำงานเลยเมื่อมีการสร้าง object 
    //* เป็น method ที่สามารถสร้างชื่อซำ้กันได้ */
    public Employee(){
        System.out.println("Create object completed!");
    }

    //! Multiple Constructor (Custom constructor) */  --> กำหนดค่าเองตอนสร้าง object
    // public Employee(){  //* สร้างไว้เผื่อตอนไม่ได้กำหนดค่าตอนสร้าง object */
        
    // }
    public Employee(String id, String name){
        this.id = id;  //* วิธีนี้จะไม่ต้องใช้ get ในการรับค่า, จะรับตอนสร้าง object เลย */
        this.name = name;
    }
    public Employee(String id, String name, double salary){
        this.id = id;  
        this.name = name;
        this.salary = salary;
    }
   
    

}
