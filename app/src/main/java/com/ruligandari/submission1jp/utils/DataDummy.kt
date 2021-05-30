package com.ruligandari.submission1jp.utils

import com.ruligandari.submission1jp.R
import com.ruligandari.submission1jp.model.MoviesEntity
import com.ruligandari.submission1jp.model.TvEntity

object DataDummy {
    fun generateMoviesDummy(): ArrayList<MoviesEntity>{
        val movies = ArrayList<MoviesEntity>()

        movies.add(
            MoviesEntity(R.drawable.poster_a_start_is_born,
        "A Start is Born",
        "2018 (US)",
        "7,5",
        "2h 16m",
        "Action, Science Fiction, Adventure",
        "- Bradley Cooper (Director)\n"+
                "- Will Fetters (Screenplay)\n"+
                "- Eric Roth (Screenplay)\n"+
                "- Robert Carson (Story)",
        "- Bradley Cooper \n" +
                "- Lady Gaga \n" +
                "- Sam Elliott \n" +
                "- etc.",
            "\t\t\tSeasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons."
        ))
        movies.add(
            MoviesEntity(R.drawable.poster_alita,
            "Alita: Battle Angel",
            "2019 (US)",
            "7,7",
            "2h 2m",
            "Action, Science Fiction, Adventure",
            "- Robert Rodriguez (Director)\n" +
                    "- Laeta Kalogridis (Screenplay)\n"+
                    "- James Cameron (Screenplay)",
            "- Rosa Salazar \n- Christoph Waltz\n- Jennifer Connelly, etc.",
                "\t\t\tWhen Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past."
            )
        )

        movies.add(
            MoviesEntity(R.drawable.poster_aquaman,
        "Aquman",
            "2018 (US)",
            "7,2",
            "2h 23m",
            "Action, Adbenture, Fantasy",
            "- James Wan (Director)\n" +
                    "- Will Beall (Screenplay)\n"+
                    "- David Leslie (Screenplay)\n"+
                    "- Mort Weisinger (Characters)",
                "- Jason Mamoa \n- Amber Heard \n- Willem Dafoe \n- Patrick Wilson, etc.",
                "\t\t\tOnce home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne."
            )
        )
        movies.add(
            MoviesEntity(R.drawable.poster_infinity_war,
                "Avengers: Infinity War",
                "2018 (US)",
                "8,3",
                "2h 29m",
                "Action, Science Fiction, Adventure",
                "- Joe Russo (Director)\n"+
                        "- Anthony Russo (Director)\n"+
                        "- Christopher Markus (Screenplay)\n"+
                        "- Stephen McFeely (Screenplay)\n",
                "- Robert Downey Jr \n- Chris Hemsworth \n- Crish Evans \n- Scarlet Johansson, etc.",
                "\t\t\tAs the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."
            )
        )
        movies.add(
            MoviesEntity(R.drawable.poster_bohemian,
                "Bohemian Rhapsody",
                "2018 (US)",
                "8,2",
                "2h 15m",
                "Music, Drama, History",
                "- Brian Singer (Director)\n" +
                        "- Anthony McCarten (Screenplay)\n"+
                        "- Peter Morgan (Story)",
                "- Rami Malek \n- Gwilym Lee \n- Ben Hardy, etc.",
                "\t\t\tSinger Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."
            )
        )
        movies.add(
            MoviesEntity(R.drawable.poster_cold_persuit,
                "Cold Pursuit",
                "2019 (US)",
                "6,2",
                "1h 44m",
                "Action, Comedy, Crime",
                "- Hans Petter Moland (Director)\n" +
                        "- Frank Baldwin (Screenplay)\n"+
                        "- Kim Fupz Aakeson (Writer)",
                "- Liam Neeson \n- Laura Dern \n- C Micheál Richardson, etc.",
                "\t\t\tA grieving snowplow driver seeks out revenge against the drug dealers who killed his son.")
        )
        movies.add(
            MoviesEntity(R.drawable.poster_creed,
                "Creed II",
                "2018 (US)",
                "7,1",
                "2h 10m",
                "Drama, Sport",
                "- Steven Caple Jr. (Director)\n" +
                        "- Juel Taylor (Screenplay)\n"+
                        "- Sylvester Stallone  (Screenplay)",
                "- Michael B. Jordan \n- Sylvester Stallone \n- Tessa Thompson, etc.",
                "\t\t\tAs Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."
            )
        )
        movies.add(
        MoviesEntity(R.drawable.poster_crimes,
            "Fantastic Beasts: The Crimes of Grindelwald",
            "2018 (US)",
            "6,5",
            "2h 14m",
            "Adventure, Family, Fantasy",
            "-  David Yates (Director)\n" +
                    "- J.K. Rowling, (Writer)\n",
            "- Eddie Redmayne \n- Katherine Waterston \n- Foglern, etc.",
            "\t\t\tThe second installment of the \"Fantastic Beasts\" series featuring the adventures of Magizoologist Newt Scamander.")
        )
        movies.add(
            MoviesEntity(R.drawable.poster_glass,
                "Glass",
                "2019 (US)",
                "6,8",
                "2h 9m",
                "Thriller, Drama, Science Fiction",
                "- M. Night Shyamalan (Director)\n" +
                        "- M. Night Shyamalan (Screenplay)",
                "- James McAvoy \n- Bruce Willis \n- Anya Taylor-Joy, etc.",
                "\t\t\tIn a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men."
            )
        )
        movies.add(
            MoviesEntity(R.drawable.poster_how_to_train,
                "How To Train Your Dragon",
                "2019 (US)",
                "7,9",
                "1h 44m",
                "Animation, Family, Adventure",
                "- Dean DeBlois (Director)\n" +
                        "- Cressida Cowell (Novel)\n"+
                        "- Dean DeBlois (Screenplay)",
                "- Jay Baruchel \n- Gerard Butler \n- Craig Ferguson, etc.",
                "\t\t\tAs Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."
            )
        )


        return movies
    }

    fun generateTvShowsDummy(): ArrayList<TvEntity>{
        val tvShows = ArrayList<TvEntity>()

        tvShows.add(
            TvEntity(R.drawable.poster_arrow,
                "Arrow",
                "2012",
                "8,2",
                "42minutes",
                "Crime, Drama, Mistery, Action and Adventure",
                "- Greg Berlanti\n"+
                        "- Marc Guggenheim\n"+
                        "- Andrew Kreisberg",
                "- Stephen Amell \n" +
                        "- David Ramsey\n" +
                        "- Emily Bett Rickards, etc.",
                "\t\t\tSpoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
            )
        )
        tvShows.add(
            TvEntity(R.drawable.poster_dragon_ball,
                "Dragon Ball",
                "1986",
                "8,4",
                "25minutes",
                "Animation, Action & Adventure, Sci-Fi",
                "Akira Toriyama",
                "- Masako Nozawa \n"+
                        "- Mayumi Tanaka\n"+
                        "- Hiromi Tsuru, etc.",
                "\t\t\tLong ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
            )
        )
        tvShows.add(
            TvEntity(R.drawable.poster_family_guy,
                "Family Guy",
                "1999",
                "8,2",
                "22minutes",
                "Animation, Comedy",
                "Seth MacFarlane",
                "- Mike Henry \n" +
                        "- Patrick Warburton\n" +
                        "- Adam West, etc.",
                "\t\t\tSick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
            )
        )
        tvShows.add(
            TvEntity(R.drawable.poster_flash,
                "The Flash",
                "2014",
                "8,2",
                "44minutes",
                "Drama, Sci-Fi, Fantasy",
                "- Greg Berlanti\n"+
                        "- Geoff Johns\n"+
                        "- Andrew Kreisberg",
                "- Series Grant Gustin\n" +
                        "- Carlos Valdes\n" +
                        "- Danielle Panabaker, etc.",
                "\t\t\tSick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
            )
        )
        tvShows.add(
            TvEntity(R.drawable.poster_gotham,
                "Gotham",
                "2014",
                "8,2",
                "43minutes",
                "Drama, Sci-Fi, Fantasy",
                "Bruno Heller",
                "- Ben McKenzie\n" +
                        "- Donal Logue\n" +
                        "- David Mazouz, etc.",
                "\t\t\tEveryone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
            )
        )
        tvShows.add(
            TvEntity(R.drawable.poster_hanna,
                "Hanna",
                "2019",
                "8,0",
                "50minutes",
                "Action & Adventure, Drama",
                "David Farr",
                "- Esme Creed-Miles\n" +
                        "- Mireille Enos\n" +
                        "- Noah Taylor, etc.",
                "\t\t\tThis thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
            )
        )
        tvShows.add(
            TvEntity(R.drawable.poster_doom_patrol,
                "Doom Patrol",
                "2019",
                "8,0",
                "50minutes",
                "Action & Adventure, Comedy",
                "Jeremy Carver",
                "- Diane Guerrero\n" +
                        "- April Bowlby\n" +
                        "- Matt Bomer, etc.",
                "\t\t\tThe adventures of an idealistic mad scientist and his field team of superpowered outcasts."
            )
        )
        tvShows.add(
            TvEntity(R.drawable.poster_fairytail,
                "Fairy Tail",
                "2009",
                "8,0",
                "24minutes",
                "Action & Adventure, Animation",
                "- Hiro Mashima\n"+
                        "- Masashi Sogo",
                "- Cherami Leigh\n" +
                        "- Todd Haberkorn\n" +
                        "- Tia Lynn Ballard etc.",
                "\t\t\tLucy, an aspiring Celestial Wizard, becomes a friend and ally to powerful wizards Natsu, Gray, and Erza, who are part of the (in)famous wizard guild, Fairy Tail."
            )
        )
        tvShows.add(
            TvEntity(R.drawable.poster_god,
                "Game Of Thrones",
                "2011",
                "9,3",
                "57minutes",
                "Action & Adventure, Drama",
                "- David Benioff\n"+
                        "- D.B. Weiss",
                "-  Emilia Clarke\n" +
                        "- Peter Dinklage\n" +
                        "- Kit Harington  etc.",
                "\t\t\tNine noble families fight for control over the lands of Westeros, while an ancient enemy returns after being dormant for millennia."
            )
        )
        tvShows.add(
            TvEntity(R.drawable.poster_grey_anatomy,
                "Grey's Anatomi",
                "2011",
                "7,5",
                "41minutes",
                "Drama, Romance",
                "Shonda Rhimes",
                "-  Chandra Wilson\n" +
                        "- James Pickens Jr.\n" +
                        "- Ellen Pompeo   etc.",
                "\t\t\tA drama centered on the personal and professional lives of five surgical interns and their supervisors."
            )
        )
        return tvShows
    }
}