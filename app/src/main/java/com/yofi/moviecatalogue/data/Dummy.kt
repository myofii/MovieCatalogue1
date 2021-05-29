package com.yofi.moviecatalogue.data

object Dummy {
    fun getDataMovie(): ArrayList<DataEntity> {
        val list = ArrayList<DataEntity>()

        list.add(
            DataEntity(
                id = "mov1",
                type = "MOVIE",
                name = "Godzilla vs. Kong",
                year = "2021",
                genre = "Science Fiction, Action, Drama",
                rating = "6.5",
                desc = "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "mov2",
                type = "MOVIE",
                name = "The Unholy",
                year = "2021",
                genre = "Horror",
                rating = "5 .0",
                desc = "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4ryVgyGJzdBq8ejVIB0snxBqnyM.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "mov3",
                type = "MOVIE",
                name = "I Am All Girls",
                year = "2021",
                genre = "Crime, Drama, Mystery",
                rating = "5.7",
                desc = "A special crimes investigator forms an unlikely bond with a serial killer to bring down a global child sex trafficking syndic",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/m6bUeV4mczG3z2YXXr5XDKPsQzv.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "mov4",
                type = "MOVIE",
                name = "Army of the Dead",
                year = "2021",
                genre = "Action, Crime, Horror",
                rating = "5.9",
                desc = "Following a zombie outbreak in Las Vegas, a group of mercenaries take the ultimate gamble: venturing into the quarantine zone to pull off the greatest heist ever attempted.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/z8CExJekGrEThbpMXAmCFvvgoJR.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "mov5",
                type = "MOVIE",
                name = "The Virtuoso",
                year = "2021",
                genre = "Action, Crime, Thriller",
                rating = "4.9",
                desc = "A lonesome stranger with nerves of steel must track down and kill a rogue hitman to satisfy an outstanding debt. But the only information he's been given is a time and location where to find his quarry. No name. No description. Nothing.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vXHzO26mJaOt4VO7ZFiM6No5ScT.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "mov6",
                type = "MOVIE",
                name = "Monster Hunter",
                year = "2020",
                genre = "Fantasy, Action, Adventure",
                rating = "5.3",
                desc = "A portal transports Cpt. Artemis and an elite unit of soldiers to a strange world where powerful monsters rule with deadly ferocity. Faced with relentless danger, the team encounters a mysterious hunter who may be their only hope to find a way home.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1UCOF11QCw8kcqvce8LKOO6pimh.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "mov7",
                type = "MOVIE",
                name = "Wonder Woman 1984",
                year = "2020",
                genre = "Fantasy, Action, Adventure",
                rating = "5.4",
                desc = "A botched store robbery places Wonder Woman in a global battle against a powerful and mysterious ancient force that puts her powers in jeopardy.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8UlWHLMpgZm9bx6QYh0NFoq67TZ.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "mov8",
                type = "MOVIE",
                name = "Tom & Jerry",
                year = "2021",
                genre = "Comedy, Family, Animation",
                rating = "5.2",
                desc = "Tom the cat and Jerry the mouse get kicked out of their home and relocate to a fancy New York hotel, where a scrappy employee named Kayla will lose her job if she can’t evict Jerry before a high-class wedding at the hotel. Her solution? Hiring Tom to get rid of the pesky mouse.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6KErczPBROQty7QoIsaa6wJYXZi.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "mov9",
                type = "MOVIE",
                name = "Nobody",
                year = "2021",
                genre = "Action, Thriller, Crime",
                rating = "7.4",
                desc = "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \"nobody.\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "mov10",
                type = "MOVIE",
                name = "The Marksman",
                year = "2021",
                genre = "Action, Thriller, Crime",
                rating = "5.6",
                desc = "im Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6vcDalR50RWa309vBH1NLmG2rjQ.jpg"
            )
        )

        return list
    }

    fun getDataTvShow(): ArrayList<DataEntity> {
        val list = ArrayList<DataEntity>()

        list.add(
            DataEntity(
                id = "tv1",
                type = "TVSHOW",
                name = "Lucifer",
                year = "2016",
                genre = "Crime, Drama, Fantasy",
                rating = "8.1",
                desc = "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "tv2",
                type = "TVSHOW",
                name = "The Good Doctor",
                year = "2017",
                genre = "Drama",
                rating = "8.2",
                desc = "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "tv3",
                type = "TVSHOW",
                name = "The Flash",
                year = "2014",
                genre = "Drama, Sci-Fi & Fantasy",
                rating = "7.7",
                desc = "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "tv4",
                type = "TVSHOW",
                name = "Cobra Kai",
                year = "2018",
                genre = "Action, Comedy, Drama",
                rating = "8.6",
                desc = "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4CkQvdUAtoLW3qkjWi7t1MTnW7R.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "tv5",
                type = "TVSHOW",
                name = "Riverdale",
                year = "2017",
                genre = "Mystery, Drama, Crime",
                rating = "6.9",
                desc = "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "tv6",
                type = "TVSHOW",
                name = "Grey's Anatomy",
                year = "2005",
                genre = "Drama",
                rating = "7.6",
                desc = "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "tv7",
                type = "TVSHOW",
                name = "Haunted: Latin America",
                year = "2021",
                genre = "Reality",
                rating = "5.3",
                desc = "Real people's terrifying tales of the chilling, unexplained and paranormal come to life with dramatic reenactments in this reality series.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7au3qp7xw4fQ8eHEsrzWkFMVNm4.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "tv8",
                type = "TVSHOW",
                name = "Lucifer",
                year = "2016",
                genre = "Crime, Sci-Fi & Fantasy",
                rating = "8.1",
                desc = "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "tv9",
                type = "TVSHOW",
                name = "Elite",
                year = "2018",
                genre = "Crime, Drama, Thriller",
                rating = "7.5",
                desc = "When three working class kids enroll in the most exclusive school in Spain, the clash between the wealthy and the poor students leads to tragedy.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3NTAbAiao4JLzFQw6YxP1YZppM8.jpg"
            )
        )

        list.add(
            DataEntity(
                id = "tv10",
                type = "TVSHOW",
                name = "WandaVision",
                year = "2021",
                genre = "Sci-Fi & Fantasy, Mystery, Drama",
                rating = "8.1",
                desc = "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/glKDfE6btIRcVB5zrjspRIs4r52.jpg"
            )
        )

        return list
    }
}