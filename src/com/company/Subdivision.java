package com.company;

/**
 * Этот класс предназначен для работы с 2 сущностью Subdivision
 * ID предназначен для храниения ID номера
 * designation предназначен для хранения названия подразделения
 */
public class Subdivision {

    private int ID;
    private String designation;
    public
/**
 * Конструктор для этого класса с параметрами
 */
    Subdivision(String t, int id_subd)
    {
        designation = t;
        ID = id_subd;
    }

    /**
     * Метод для получения ID 2 сущности
     * @return - возвращает номер id
     */
    public int getId() { return ID; }

    /**
     * Метод для получения названия подразделения 2 сущности
     * @return - возвращает название подразделения
     */
    public String getDesignation() { return this.designation; }

}