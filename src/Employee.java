public class Employee {

    private static int empInOrganization = 0;
    private String fio;
    private String position;
    private String email;
    private String tel;
    private float salary;
    private int age;

    private static final int MROT_SPB = 28750; // МРОТ в СПб 2025

    // Конструктор со всеми полями (и их минимальной проверкой на корректность)
    public Employee(String fio, String position, String email, String tel, float salary, int age) {
        if (checkFieldData(fio)) {
            this.fio = fio;
        } else {
            System.out.println("Ошибка: поле ФИО не может быть пустым");
            this.fio = "Не указано";
        }

        if (checkFieldData(position)) {
            this.position = position;
        } else {
            System.out.println("Ошибка: поле Должность не может быть пустым");
            this.position = "не указано";
        }

        if (checkFieldData(email)) {
            this.email = email;
        } else {
            System.out.println("Ошибка: поле Email не может быть пустым");
            this.email = "не указан";
        }

        if (checkFieldData(tel)) {
            this.tel = tel;
        } else {
            System.out.println("Ошибка: поле Телефон не может быть пустым");
            this.tel = "не указан";
        }

        if(salary >= MROT_SPB){
            this.salary = salary;
        } else {
            System.out.println("Ошибка: зарплата не может быть меньше " + MROT_SPB + "руб.");
            this.salary = MROT_SPB;
        }

        // проверяем на возраст
        if(age >= 18){
            this.age = age;
        } else {
            System.out.println("Ошибка: сотрудник должен быть старше 18 лет");
            this.age = 18;
        }

        empInOrganization++;
        System.out.println("Создан сотрудник " + this.fio + ". Сотрудников в организации: " + getEmpInOrganization());
    }

    // Метод для проверки наличия данных в поле. Если данных нет, то false
    boolean checkFieldData(String data) {
        return data != null && !data.trim().isEmpty();
    }


    public int getEmpInOrganization(){
        return empInOrganization;
    }

    public int getAge() {
        return age;
    }

    void printInfo() {
        System.out.println(
                position + " " + fio
                + ", email: " + email
                + ", тел: " + tel
                + ", зарплата: " + salary + " рублей"
                + " возраст: " + age + "."
                );
    }
}
