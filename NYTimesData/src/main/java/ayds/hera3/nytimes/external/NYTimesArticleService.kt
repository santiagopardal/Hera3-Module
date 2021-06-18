package ayds.hera3.nytimes.external

import ayds.hera3.nytimes.entities.Article

interface NYTimesArticleService {

    fun getArticle(artistName: String): Article
}