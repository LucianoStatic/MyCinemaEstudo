package br.com.entrypoint.mycinemalistyt.data.remote

import br.com.entrypoint.mycinemalistyt.data.response.PopularMovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesAPI {

    @GET("3/movie/popular")
    fun getPopularMovies(
        @Query("api_key") api_key: String = API_KEY): Call<PopularMovieResponse>

    companion object {
        val BASE_URL = "https://api.themoviedb.org/"
        val API_KEY = "853d1ab670ddf2e1742e2ba494ba7a8d"
    }


}