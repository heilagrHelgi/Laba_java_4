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
 * @param t - для названия подразделения
 * @param id_subd - для создания ID
 */
    Subdivision(String t, int id_subd)
    {
        this.designation = t;
        this.ID = id_subd;
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