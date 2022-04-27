package br.com.entrypoint.mycinemalistyt.data.response

import com.google.gson.annotations.SerializedName
import br.com.entrypoint.mycinemalistyt.data.dto.PopularMovieDto

data class PopularMovieResponse(
    @SerializedName("results")
    val popularMovie:List<PopularMovieDto>
)
