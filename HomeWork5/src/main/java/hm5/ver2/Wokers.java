package hm5.ver2;

public class Wokers {

    private String fullName;
    private String post;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Wokers(String fullName, String post, String email, String tel, int salary, int age){
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void infoWoker() {

        System.out.println("ФИО: " + fullName + "\n" + "Должность: " + post + "\n" +
                "Почта: " + email + "\n" + "Телефон: " + tel + "\n" +
                "Зарплата: " + salary + "\n" + "Возраст: " + age+ "\n");

    }

}
