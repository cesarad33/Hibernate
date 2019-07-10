/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebahiber;

import com.mycompany.dominio.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Cesar
 */
public class Principal {
    public static void main(String[] args){
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("myconnectionDB");
       EntityManager em= emf.createEntityManager();
       Persona p = em.find(Persona.class, 2);
       System.out.println(p);
       em.close();
       emf.close();
       
    }
    
}
