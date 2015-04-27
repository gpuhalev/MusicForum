package org.elsys.musicforum.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.elsys.musicforum.model.Post;
import org.elsys.musicforum.model.User;
import org.elsys.musicforum.services.PostService;
import org.elsys.musicforum.Services;


@Path("posts")
public class PostRest {
	private final PostService postService;
	private final User defaultAuthor;
	public PostRest() {
		postService = Services.getPostService();
		
		// TODO should be get from session
		defaultAuthor = new User();
		defaultAuthor.setEmail("hello@world");
		defaultAuthor.setPassword("secret");
	}
	@POST
	@Path("/")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Post> getPosts() {
		return postService.getPosts();
	}
	
	@GET
	@Path("/{postId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	
	public Post getPost(@PathParam("postId") long postId){
		return postService.getPost(postId);
	}
	
	public Post createPost(Post post) {
		post.setCreatedBy(defaultAuthor);
		return postService.createPost(post);
	}
	public Post updatePost(long postId, Post post) {
		final Post fromDb = getPost(postId);
		fromDb.setBody(post.getBody());
		fromDb.setTitle(post.getTitle());
		fromDb.setCity(post.getCity());
		fromDb.setLooking(post.getIsLooking());
		return fromDb;
	}
	
	@DELETE
	@Path("/{postId}")
	public void deletePost(@PathParam("postId") long postId) {
		postService.deletePost(postId);
	}
}
