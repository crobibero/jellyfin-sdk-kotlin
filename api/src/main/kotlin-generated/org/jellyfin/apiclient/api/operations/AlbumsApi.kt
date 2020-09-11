// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Int
import kotlin.String
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.BaseItemDtoQueryResult

class AlbumsApi(
	private val api: KtorClient
) {
	/**
	 * Finds albums similar to a given album.
	 *
	 * @param albumId The album id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param excludeArtistIds Optional. Ids of artists to exclude.
	 * @param limit Optional. The maximum number of records to return.
	 */
	suspend fun getSimilarAlbums(
		albumId: String,
		userId: UUID? = null,
		excludeArtistIds: String? = null,
		limit: Int? = null
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["albumId"] = albumId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["excludeArtistIds"] = excludeArtistIds
		queryParameters["limit"] = limit
		val data = null
		val response = api.get<BaseItemDtoQueryResult>("/Albums/{albumId}/Similar", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Finds artists similar to a given artist.
	 *
	 * @param artistId The artist id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param excludeArtistIds Optional. Ids of artists to exclude.
	 * @param limit Optional. The maximum number of records to return.
	 */
	suspend fun getSimilarArtists(
		artistId: String,
		userId: UUID? = null,
		excludeArtistIds: String? = null,
		limit: Int? = null
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["artistId"] = artistId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["excludeArtistIds"] = excludeArtistIds
		queryParameters["limit"] = limit
		val data = null
		val response = api.get<BaseItemDtoQueryResult>("/Artists/{artistId}/Similar", pathParameters,
				queryParameters, data)
		return response
	}
}
