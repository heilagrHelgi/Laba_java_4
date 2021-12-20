package com.company;
import java.util.Objects;
/**
 * Этот класс предназначен для работы с 1 сущностью Person
 */
public class Person {
    /**
     *
     */
    private String id;
    private String name;
    private String genderOfThePerson;
    private String salary;
    private String dateOfBirth;
    private Subdivision subd;

    public

/**
 * Конструктор для Person для ввода данных
 * @param idd - id пользователя
 * @param nm - имя пользователя
 * @param gndr - гендер
 * @param slr - зарплата
 * @param DOB - дата рождения
 * @param t - для поля 2 сущности
 * @param id_subd - для id 2 сущности
 */
    Person(String idd, String nm, String gndr, String slr, String DOB, String t, int id_subd)
    {

        this.id = idd;
        this.name = nm;
        this.genderOfThePerson = gndr;
        this.salary = slr;
        this.dateOfBirth = DOB;
        this.subd = new Subdivision(t, id_subd);
    }

    /**
     * Конструктор по умолчанию
     */
    public Person() { }

    /**
     * Метод для получения id человека
     * @return - возвращает номер id
     */
    public String getId() { return id; }

    /**
     * Метод для получения имени человека
     * @return - возвращает строку с именем
     */
    public String getName() { return name; }

    /**
     * Метод для получения пола человека
     * @return - возвращает строку с полом
     */
    public String getGender() { return genderOfThePerson; }

    /**
     * Метод для получения зарплаты человека
     * @return - возвращает строку с зарплатой
     */
    public String getSalary() { return salary; }

    /**
     * Метод для получения даты рождения человека
     * @return
     */
    public String getBirthDate() { return dateOfBirth; }

    /**
     * Метод для получения названия 2 сущности "подразделения"
     * @return - возвращает название подразделения
     */
    public String getSubdTitle() { return subd.getDesignation(); }

    /**
     * Метод для получения ID 2 сущности
     * @return - возвращает номер id
     */
    public int getSubdId() { return subd.getId(); }

    @Override
    public String toString() {
        return this.id + "; " + this.name + "; Gender: " + this.genderOfThePerson +"; division: " + this.subd.getDesignation() +"; salary: " + this.salary + "; birthdate: " + dateOfBirth + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Person human = (Person)o;
            return this.id == human.id && this.salary == human.salary && Objects.equals(this.name, human.name) && Objects.equals(this.genderOfThePerson, human.genderOfThePerson) && Objects.equals(this.dateOfBirth, human.dateOfBirth);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id.length() + this.name.length() + this.genderOfThePerson.length();
    }
}
