package hm5.ver1;

public class Employee {

    private String fullName;
    private String post;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public Employee(String fullName, String post, String email, String tel, int salary, int age){
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public static void main (String[] args) {

        Employee testEmployee = new Employee("Тест Тестович Тестов", "Стажер",
                "test@test.tt", "123456789", 55555, 25);

        System.out.println("Еще не сотрудник");
        System.out.println("ФИО: " + testEmployee.fullName + "\n" + "Должность: " + testEmployee.post + "\n" +
                "Почта: " + testEmployee.email + "\n" + "Телефон: " + testEmployee.tel + "\n" +
                "Зарплата: " + testEmployee.salary + "\n" + "Возраст: " + testEmployee.age+ "\n");

        Employee[] emArr = new Employee[5];
        emArr[0] = new Employee("Иванов Иван Иванович", "Директор", "11@11.11", "1111111", 99999999, 60);
        emArr[1] = new Employee("Петров Петр Петрович", "Зам. директора", "22@22.22", "2222222", 88888888, 50);
        emArr[2] = new Employee("Антонова Антонина Антоновна", "Бухгалтер", "33@33.33", "3333333", 7777777, 30);
        emArr[3] = new Employee("Светланова Светлана", "Секретарь", "44@44.44", "4444444", 6666666, 20);
        emArr[4] = new Employee("Сидоров Сидор Сидорович", "Рабочий", "55@55.55", "5555555", 12345, 45);

        System.out.println("Сотрудники старше сорока лет:");
        for (int i=0; i<emArr.length; i++) {
            if (emArr[i].age>40) {
                System.out.println("ФИО: " + emArr[i].fullName + "\n" + "Должность: " + emArr[i].post + "\n" +
                        "Почта: " + emArr[i].email + "\n" + "Телефон: " + emArr[i].tel + "\n" +
                        "Зарплата: " + emArr[i].salary + "\n" + "Возраст: " + emArr[i].age+ "\n");
            }
        }
    }
}
