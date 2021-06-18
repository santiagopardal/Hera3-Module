package ayds.hera3.nytimes.entities

interface Article {
    val artistInfo: String
    val url: String
    var isLocallyStored: Boolean
}

data class NYTimesArticle(
    override val artistInfo: String,
    override val url: String,
    override var isLocallyStored: Boolean = false
) : Article

object EmptyArticle : Article {
    override val artistInfo: String = ""
    override val url: String = ""
    override var isLocallyStored: Boolean = false
}