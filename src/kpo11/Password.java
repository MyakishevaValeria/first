/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo11;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Password {
    private String password = "pass0978";
    private String pass;
    Scanner scanner = new Scanner(System.in);


    void getPassword() {   //метод для ввода пароля
        System.out.print("Введите ваше пароль: ");
        pass=scanner.next();
    }
    
    void passResult() {
        if (password.equals(pass))  //сравниваем значение и выводим результат
            System.out.print("Пароль введен верно");
        else
            System.out.print("Пароль введен неправильно");
}

    
}
