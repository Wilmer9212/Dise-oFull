/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import SAICoop.Util.JPAUtil;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author wilmer
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManager em=new JPAUtil().createEntityManager("192.168.99.200","sannicolas30nov20_movimientos");
        Query query=em.createNativeQuery("SELECT nombre FROM personas limit 1");
        String nombre=(String)query.getSingleResult();
        System.out.println("Nombre:"+nombre);
        
    }
    
}
