package listener_lab;


import entity.Account;
import org.hibernate.HibernateException;
import org.hibernate.event.def.DefaultSaveOrUpdateEventListener;
import org.hibernate.event.spi.SaveOrUpdateEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class AccountListener extends DefaultSaveOrUpdateEventListener {

    @Override
    public void onSaveOrUpdate(org.hibernate.event.SaveOrUpdateEvent event) {
        if (event.getObject() instanceof Account){
            Account account=(Account) event.getObject();
             System.out.println("User Entity is "+account.getFullName());
             account.setFullName("shima");
             event.getSession().saveOrUpdate(account);
        /*for(int i=0;i<propertyNames.length;i++){
            String name=propertyNames[i];
            if(name.equals("fullName"))
                state[i]="shosho";
        }
*/
           System.out.println("User Entity is "+account.getFullName());

} 
    }


}