package challenge;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class RecipeController {

	@Autowired
	private RecipeService service;

	@PostMapping("/recipe")
	public Recipe save(@RequestBody Recipe recipe) {
		return service.save(recipe);
	}

	@PutMapping("/recipe/{id}")
	public void update(@PathVariable String id, @RequestBody Recipe recipe) {
		service.update(id, recipe);
	}

	public void delete() {
		service.delete(null);
	}

	@GetMapping("/recipe/{id}")
	public Recipe get(@PathVariable String id) {
		return service.get(id);
	}

	public List<Recipe> listByIngredient() {
		return service.listByIngredient(null);
	}

	public List<Recipe> search() {
		return service.search(null);
	}

	public void like() {
		service.like(null, null);
	}

	public void unlike() {
		service.unlike(null, null);
	}

	public RecipeComment addComment() {
		return service.addComment(null, null);
	}

	public void updateComment() {
		service.updateComment(null, null, null);
	}

	public void deleteComment() {
		service.deleteComment(null, null);
	}

}