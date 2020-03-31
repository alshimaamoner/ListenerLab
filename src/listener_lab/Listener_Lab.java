/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener_lab;

import entity.Account;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author DELL
 */
public class Listener_Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
cfg.setListener("save",new AccountListener());
cfg.configure();
SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();
 Account account = new Account();
        account.setUserName("skk");
        account.setFullName("skkk");
        account.setPhone("0235355637");
        account.setPassword("1223");
        account.setBirthday(new Date());
        session.beginTransaction();
        session.save(account);
        session.getTransaction().commit();
    }
    
}
