package nyc.c4q.recipe.network;

import nyc.c4q.recipe.models.ChickenRecipe;
import nyc.c4q.recipe.models.PorkRecipe;
import nyc.c4q.recipe.models.SeafoodRecipe;
import nyc.c4q.recipe.models.SteakRecipe;
import nyc.c4q.recipe.models.VegetarianRecipe;
import nyc.c4q.recipe.models.WinePairing;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RecipeApiService {

    public static final String BASE_URL = "https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/";

//    //Chicken
//    @GET("recipes/findByIngredients?fillIngredients=false&ingredients=chicken&limitLicense=false&number=10&ranking=1")
//    Call<ChickenRecipe> getChicken(@Path());
//
//    //Pork
//    @GET("recipes/findByIngredients?fillIngredients=false&ingredients=pork&limitLicense=false&number=10&ranking=1")
//    Call<PorkRecipe> getPork(@Path());
//
//    //Steak
//    @GET("recipes/findByIngredients?fillIngredients=false&ingredients=steak&limitLicense=false&number=10&ranking=1")
//    Call<SteakRecipe> getSteak(@Path());
//
//    //Seafood
//    @GET("recipes/findByIngredients?fillIngredients=false&ingredients=seafood&limitLicense=false&number=10&ranking=1")
//    Call<SeafoodRecipe> getSeafood(@Path());
//
//    //Vegetarian
//    @GET("recipes/findByIngredients?fillIngredients=false&ingredients=vegetarian&limitLicense=false&number=10&ranking=1")
//    Call<VegetarianRecipe> getVegetarian(@Path());
//
//    //Wine Pairing
//    @GET("food/wine/pairing?food=steak&maxPrice=50")
//    Call<WinePairing> getWine(@Path());
}
