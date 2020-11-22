// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.SearchHintResult

public class SearchApi(
	private val api: KtorClient
) {
	/**
	 * Gets the search hint result.
	 *
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param userId Optional. Supply a user id to search within a user's library or omit to search
	 * all.
	 * @param searchTerm The search term to filter on.
	 * @param includeItemTypes If specified, only results with the specified item types are returned.
	 * This allows multiple, comma delimeted.
	 * @param excludeItemTypes If specified, results with these item types are filtered out. This
	 * allows multiple, comma delimeted.
	 * @param mediaTypes If specified, only results with the specified media types are returned. This
	 * allows multiple, comma delimeted.
	 * @param parentId If specified, only children of the parent are returned.
	 * @param isMovie Optional filter for movies.
	 * @param isSeries Optional filter for series.
	 * @param isNews Optional filter for news.
	 * @param isKids Optional filter for kids.
	 * @param isSports Optional filter for sports.
	 * @param includePeople Optional filter whether to include people.
	 * @param includeMedia Optional filter whether to include media.
	 * @param includeGenres Optional filter whether to include genres.
	 * @param includeStudios Optional filter whether to include studios.
	 * @param includeArtists Optional filter whether to include artists.
	 */
	public suspend fun `get`(
		startIndex: Int? = null,
		limit: Int? = null,
		userId: UUID? = null,
		searchTerm: String,
		includeItemTypes: List<String>? = emptyList(),
		excludeItemTypes: List<String>? = emptyList(),
		mediaTypes: List<String>? = emptyList(),
		parentId: String? = null,
		isMovie: Boolean? = null,
		isSeries: Boolean? = null,
		isNews: Boolean? = null,
		isKids: Boolean? = null,
		isSports: Boolean? = null,
		includePeople: Boolean = true,
		includeMedia: Boolean = true,
		includeGenres: Boolean = true,
		includeStudios: Boolean = true,
		includeArtists: Boolean = true
	): Response<SearchHintResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["startIndex"] = startIndex
		queryParameters["limit"] = limit
		queryParameters["userId"] = userId
		queryParameters["searchTerm"] = searchTerm
		queryParameters["includeItemTypes"] = includeItemTypes
		queryParameters["excludeItemTypes"] = excludeItemTypes
		queryParameters["mediaTypes"] = mediaTypes
		queryParameters["parentId"] = parentId
		queryParameters["isMovie"] = isMovie
		queryParameters["isSeries"] = isSeries
		queryParameters["isNews"] = isNews
		queryParameters["isKids"] = isKids
		queryParameters["isSports"] = isSports
		queryParameters["includePeople"] = includePeople
		queryParameters["includeMedia"] = includeMedia
		queryParameters["includeGenres"] = includeGenres
		queryParameters["includeStudios"] = includeStudios
		queryParameters["includeArtists"] = includeArtists
		val data = null
		val response = api.`get`<SearchHintResult>("/Search/Hints", pathParameters, queryParameters, data)
		return response
	}
}
