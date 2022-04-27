package hm5.ver2;

public class Main {

    public static void main (String[] args) {

        Wokers testWokers = new Wokers("Тест Тестович Тестов", "Стажер", "test@test.tt", "123456789", 55555, 25);

        System.out.println("Еще не сотрудник");
        testWokers.infoWoker();

        Wokers[] emArr = new Wokers[5];
        emArr[0] = new Wokers("Иванов Иван Иванович", "Директор", "11@11.11", "1111111", 99999999, 60);
        emArr[1] = new Wokers("Петров Петр Петрович", "Зам. директора", "22@22.22", "2222222", 88888888, 50);
        emArr[2] = new Wokers("Антонова Антонина Антоновна", "Бухгалтер", "33@33.33", "3333333", 7777777, 30);
        emArr[3] = new Wokers("Светланова Светлана", "Секретарь", "44@44.44", "4444444", 6666666, 20);
        emArr[4] = new Wokers("Сидоров Сидор Сидорович", "Рабочий", "55@55.55", "5555555", 12345, 45);

        System.out.println("Сотрудники старше сорока лет:");
        for (int i=0; i<emArr.length; i++) {
            if (emArr[i].getAge()>40) {
                emArr[i].infoWoker();
            }
        }
    }
}
