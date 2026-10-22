public class employye {
    String name;
    static int salary;

    int getsalary() {
        return salary;
    }

    void setsalary(int s) {
        salary = s;
    }

    String getname() {
        return name;
    }

    void setname(String n) {
        name = n;
    }

    public static void main(String[] args) {
        employye e = new employye();
        e.setname("syed");
        e.setsalary(100005);
        System.out.println("name is " + e.getname());
        System.out.println("salary is " + e.getsalary());

    }
}
