package org.elsys.musicforum.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.elsys.musicforum.Services;
import org.elsys.musicforum.model.Post;

public class PostService {
	private final EntityManagerFactory emf;
	public PostService(){
		emf = Services.getEntityManagerFactory();
	}
	
	public List<Post> getPosts() {
		final EntityManager em = emf.createEntityManager();
		try{
			return em.createNamedQuery("allPosts").getResultList();
		} finally {
			em.close();
		}
	}
	public Post getPost(long postId) {
		final EntityManager em = emf.createEntityManager();
		try {
			return em.find(Post.class, postId);
		} finally {
			em.close();
		}
	}
	
	public synchronized Post createPost(Post post) {
		EntityManager em = emf.createEntityManager();
		final EntityTransaction tx = em.getTransaction();
		try{
			tx.begin();
			em.persist(post);
			tx.commit();
			return post;
		}finally{
			if(tx.isActive()){
				tx.rollback();
			}
			em.close();
		}
	}
	public Post updatePost(long postId, Post post) {
		EntityManager em = emf.createEntityManager();
		final EntityTransaction tx = em.getTransaction();
		try{
			tx.begin();
			final Post fromDb = em.find(Post.class, postId);
			if(fromDb != null){
				fromDb.setBody(post.getBody());
				fromDb.setTitle(post.getTitle());
				fromDb.setCity(post.getCity());
				fromDb.setLooking(post.getIsLooking());
				em.merge(fromDb);
			}
			tx.commit();
			return fromDb;
		}finally{
			if(tx.isActive()){
				tx.rollback();
			}
			em.close();
		}
	}
	public void deletePost(long postId) {
		EntityManager em = emf.createEntityManager();
		final EntityTransaction tx = em.getTransaction();
		try{
			tx.begin();
			final Post fromDb = em.find(Post.class, postId);
			if(fromDb != null){
				em.remove(fromDb);
			}
			tx.commit();
		}finally{
			if(tx.isActive()){
				tx.rollback();
			}
			em.close();
		}	
	}
}
