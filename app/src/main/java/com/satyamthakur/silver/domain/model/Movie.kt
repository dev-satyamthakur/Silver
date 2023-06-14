package com.satyamthakur.silver.domain.model

import android.os.Bundle
import com.google.gson.Gson
import com.google.gson.annotations.JsonAdapter
import com.satyamthakur.silver.utility.JsonNavType
import java.io.Serializable

data class Movie(
    val adult: Boolean,
    val backdropPath: String,
    val genresID: List<Int>,
    val id: Int,
    val originalLanguage: String,
    val originalTitle: String,
    val overview: String,
    val popularity: Double,
    val posterPath: String,
    val releaseDate: String,
    val title: String,
    val video: Boolean,
    val voteAverage: Double,
    val voteCount: Int
) : Serializable

class MovieArgumentType: JsonNavType<Movie>(){
    override fun fromJsonParse(value: String): Movie = Gson().fromJson(value, Movie::class.java)

    override fun Movie.getJsonParse(): String = Gson().toJson(this)

}

val PopularMovies: List<Movie> = listOf(
    Movie(
        adult = false,
        backdropPath = "/fgw4rFs4XMWdJTWp1eMacHKQqbZ.jpg",
        genresID = listOf(
            28,
            53,
            80
        ),
        id = 603692,
        originalLanguage = "en",
        originalTitle = "John Wick: Chapter 4",
        overview = "With the price on his head ever increasing, John Wick uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes.",
        popularity = 5688.839,
        posterPath = "/vZloFAK7NmvMGKE7VkF5UHaz0I.jpg",
        releaseDate = "2023-03-22",
        title = "John Wick: Chapter 4",
        video = false,
        voteAverage = 8.toDouble(),
        voteCount = 2480
    ),
    Movie(
        adult = false,
        backdropPath = "/2klQ1z1fcHGgQPevbEQdkCnzyuS.jpg",
        genresID = listOf(16, 10751, 12, 14, 35),
        id = 502356,
        originalLanguage = "en",
        originalTitle = "The Super Mario Bros. Movie",
        overview = "While working underground to fix a water main, Brooklyn plumbers—and brothers—Mario and Luigi are transported down a mysterious pipe and wander into a magical new world. But when the brothers are separated, Mario embarks on an epic quest to find Luigi.",
        popularity = 3859.926,
        posterPath = "/qNBAXBIQlnOThrVvA6mA2B5ggV6.jpg",
        releaseDate = "2023-04-05",
        title = "The Super Mario Bros. Movie",
        video = false,
        voteAverage = 7.8,
        voteCount = 3982
    ),
    Movie(
        adult = false,
        backdropPath = "/4t0oBFrJyweYPt0hocW6RUa0b6H.jpg",
        genresID = listOf(28, 80, 53),
        id = 385687,
        originalLanguage = "en",
        originalTitle = "Fast X",
        overview = "Over many missions and against impossible odds, Dom Toretto and his family have outsmarted, out-nerved and outdriven every foe in their path. Now, they confront the most lethal opponent they've ever faced: A terrifying threat emerging from the shadows of the past who's fueled by blood revenge, and who is determined to shatter this family and destroy everything—and everyone—that Dom loves, forever.",
        popularity = 2649.217,
        posterPath = "/1E5baAaEse26fej7uHcjOgEE2t2.jpg",
        releaseDate = "2023-05-17",
        title = "Fast X",
        video = false,
        voteAverage = 7.toDouble(),
        voteCount = 729
    ),
    Movie(
        adult = false,
        backdropPath = "/2I5eBh98Q4aPq8WdQrHdTC8ARhY.jpg",
        genresID = listOf(12, 10751, 14, 10749),
        id = 447277,
        originalLanguage = "en",
        originalTitle = "The Little Mermaid",
        overview = "The youngest of King Triton’s daughters, and the most defiant, Ariel longs to find out more about the world beyond the sea, and while visiting the surface, falls for the dashing Prince Eric. With mermaids forbidden to interact with humans, Ariel makes a deal with the evil sea witch, Ursula, which gives her a chance to experience life on land, but ultimately places her life – and her father’s crown – in jeopardy.",
        popularity = 1877.361,
        posterPath = "/ym1dxyOk4jFcSl4Q2zmRrA5BEEN.jpg",
        releaseDate = "2023-05-18",
        title = "The Little Mermaid",
        video = false,
        voteAverage = 6.toDouble(),
        voteCount = 395
    ),
    Movie(
        adult = false,
        backdropPath = "/1IM8i8HiomFC4y6NRyBuDrHJWg3.jpg",
        genresID = listOf(28, 12, 878),
        id = 640146,
        originalLanguage = "en",
        originalTitle = "Ant-Man and the Wasp: Quantumania",
        overview = "Super-Hero partners Scott Lang and Hope van Dyne, along with with Hope's parents Janet van Dyne and Hank Pym, and Scott's daughter Cassie Lang, find themselves exploring the Quantum Realm, interacting with strange new creatures and embarking on an adventure that will push them beyond the limits of what they thought possible.",
        popularity = 1365.483,
        posterPath = "/qnqGbB22YJ7dSs4o6M7exTpNxPz.jpg",
        releaseDate = "2023-02-15",
        title = "Ant-Man and the Wasp: Quantumania",
        video = false,
        voteAverage = 6.5,
        voteCount = 3086
    ),
    Movie(
        adult = false,
        backdropPath = "/aAgGrfBwna1nO4M2USxwFgK5O0t.jpg",
        genresID = listOf(28, 10752),
        id = 840326,
        originalLanguage = "fi",
        originalTitle = "Sisu",
        overview = "Deep in the wilderness of Lapland, Aatami Korpi is searching for gold but after he stumbles upon Nazi patrol, a breathtaking and gold-hungry chase through the destroyed and mined Lapland wilderness begins.",
        popularity = 1619.855,
        posterPath = "/ygO9lowFMXWymATCrhoQXd6gCEh.jpg",
        releaseDate = "2023-01-27",
        title = "Sisu",
        video = false,
        voteAverage = 7.4,
        voteCount = 542
    ),
    Movie(
        adult = false,
        backdropPath = "/94TIUEhuwv8PhdIADEvSuwPljS5.jpg",
        genresID = listOf(28, 12, 16, 878),
        id = 569094,
        originalLanguage = "en",
        originalTitle = "Spider-Man: Across the Spider-Verse",
        overview = "After reuniting with Gwen Stacy, Brooklyn’s full-time, friendly neighborhood Spider-Man is catapulted across the Multiverse, where he encounters the Spider Society, a team of Spider-People charged with protecting the Multiverse’s very existence. But when the heroes clash on how to handle a new threat, Miles finds himself pitted against the other Spiders and must set out on his own to save those he loves most.",
        popularity = 1402.307,
        posterPath = "/8Vt6mWEReuy4Of61Lnj5Xj704m8.jpg",
        releaseDate = "2023-05-31",
        title = "Spider-Man: Across the Spider-Verse",
        video = false,
        voteAverage = 8.8,
        voteCount = 189
    ),
    Movie(
        adult = false,
        backdropPath = "/m8JTwHFwX7I7JY5fPe4SjqejWag.jpg",
        genresID = listOf(53, 27),
        id = 713704,
        originalLanguage = "en",
        originalTitle = "Evil Dead Rise",
        overview = "Three siblings find an ancient vinyl that gives birth to bloodthirsty demons that run amok in a Los Angeles apartment building and thrusts them into a primal battle for survival as they face the most nightmarish version of family imaginable.",
        popularity = 1389.476,
        posterPath = "/5ik4ATKmNtmJU6AYD0bLm56BCVM.jpg",
        releaseDate = "2023-04-12",
        title = "Evil Dead Rise",
        video = false,
        voteAverage = 7.1,
        voteCount = 1465
    ),
    Movie(
        adult = false,
        backdropPath = "/5YZbUmjbMa3ClvSW1Wj3D6XGolb.jpg",
        genresID = listOf(878, 12, 28),
        id = 76600,
        originalLanguage = "en",
        originalTitle = "Avatar: The Way of Water",
        overview = "Set more than a decade after the events of the first film, learn the story of the Sully family (Jake, Neytiri, and their kids), the trouble that follows them, the lengths they go to keep each other safe, the battles they fight to stay alive, and the tragedies they endure.",
        popularity = 1118.815,
        posterPath = "/t6HIqrRAclMCA60NsSmeqe9RmNV.jpg",
        releaseDate = "2022-12-14",
        title = "Avatar: The Way of Water",
        video = false,
        voteAverage = 7.7,
        voteCount = 8287
    )
)
