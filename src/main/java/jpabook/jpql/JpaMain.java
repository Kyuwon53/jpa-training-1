package jpabook.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            logic(em);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

    private static void logic(EntityManager em) {
        String username = "kim";
        Member member = new Member();
        member.setUsername(username);

        em.persist(member);
        /**
         * 실제 실행된 SQL
         * select member.name as name
         * from Member member
         * where member.name = 'kim'
         */
        String jpql = "select m " +
                "from Member as m " +
                "where m.username = 'kim'";
        List<Member> resultList = em.createQuery(jpql, Member.class).getResultList();
    }
}
