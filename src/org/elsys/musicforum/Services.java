package org.elsys.musicforum;

import org.elsys.musicforum.services.PostService;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Services {
	private static PostService postService;
	private static EntityManagerFactory entityManagerFactory;
	
	public synchronized static PostService getPostService(){
		if(postService == null){
			postService = new PostService();
		}
		return postService;
	}
	
	static void setPostService(PostService postService){
		Services.postService = postService;
	}
	
	public synchronized static EntityManagerFactory getEntityManagerFactory(){
		if(entityManagerFactory == null){
			try {
				Class.forName("org.apache.derby.jdbc.ClientDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				throw new IllegalStateException("No driver", e);
			}
			entityManagerFactory = Persistence.createEntityManagerFactory("MusicForum");
		}
		return entityManagerFactory;
		
	}
}
