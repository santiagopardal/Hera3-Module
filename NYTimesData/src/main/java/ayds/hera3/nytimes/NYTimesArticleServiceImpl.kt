package ayds.hera3.nytimes

import ayds.hera3.nytimes.entities.Article

internal class NYTimesArticleServiceImpl(
    private val nytArticleAPI: NYTimesAPI,
    private val jsonToArticleResolver: NYTToArticleResolver
) : NYTimesArticleService {

    override fun getArticle(artistName: String): Article {
        val response = nytArticleAPI.getArtistInfo(artistName).execute()

        return jsonToArticleResolver.getFromExternalData(response.body())
    }
}