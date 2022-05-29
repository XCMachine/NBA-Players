package com.example.network.entities.models

import com.google.gson.annotations.SerializedName

data class PlayersDTO(
    val data: List<Data>,
    val meta: Meta
) {
    data class Data(
        val ikeAnigbogu: Ike,
        val ronBaker: Ron,
        val jabariBird: Jabari,
        val marShonBrooks: MarShon,
        val lorenzoBrown: Lorenzo,
        val omriCasspi: Omri,
        val alexAbrines: Alex,
        val tylerDavis: Tyler,
        val keenanEvans: Keenan,
        val marcinGortat: Marcin,
        val andrewBogut: Andrew,
        val amirJohnson: Amir,
        val malachiRichardson: Malachi,
        val zachLofton: Zach,
        val kostaKoufos: Kosta,
        val billyPreston: Billy,
        val zhouQi: Zhou,
        val zachRandolph: ZachRandolph,
        val djStephens: DJ,
        val milosTeodosic: Milos,
        val garyTrentJr: Gary,
        val michaelSmith: Michael,
        val johnMorton: John,
        val howardWright: Howard,
        val michaelAnsley: MichaelAnsley
    )

    data class Ike(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Ron(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Jabari(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class MarShon(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Lorenzo(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Omri(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Alex(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Tyler(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Keenan(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Marcin(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Andrew(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Amir(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Malachi(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Zach(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Kosta(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Billy(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Zhou(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class ZachRandolph(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class DJ(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Milos(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Gary(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Michael(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class John(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Howard(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class MichaelAnsley(
        val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        val position: String,
        val team: Team
    )

    data class Team(
        val id: Int,
        val abbreviation: String,
        val conference: String,
        val division: String,
        @SerializedName("full_name") val fullName: String,//
        val name: String
    )

    data class Meta(
        @SerializedName("total_pages") val totalPages: Int,
        @SerializedName("current_page") val currentPage: Int,
        @SerializedName("next_page") val nextPage: Int,
        @SerializedName("per_page") val perPage: Int,
        @SerializedName("total_count") val totalCount: Int
    )
}
