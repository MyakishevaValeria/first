/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo11;

/**
 *
 * @author Admin
 */
public class Kpo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Password password= new Password();   //создаем объект класса
    password.getPassword();     //используем метод для ввода пароля
    password.passResult();   //используем метод для вывода результата сравнения

    }
    
}
