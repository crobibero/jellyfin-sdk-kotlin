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
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.BaseItemDtoQueryResult

class SuggestionsApi(
	private val api: KtorClient
) {
	/**
	 * Gets suggestions.
	 *
	 * @param userId The user id.
	 * @param mediaType The media types.
	 * @param type The type.
	 * @param startIndex Optional. The start index.
	 * @param limit Optional. The limit.
	 * @param enableTotalRecordCount Whether to enable the total record count.
	 */
	suspend fun getSuggestions(
		userId: UUID,
		mediaType: String? = null,
		type: String? = null,
		startIndex: Int? = null,
		limit: Int? = null,
		enableTotalRecordCount: Boolean
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["mediaType"] = mediaType
		queryParameters["type"] = type
		queryParameters["startIndex"] = startIndex
		queryParameters["limit"] = limit
		queryParameters["enableTotalRecordCount"] = enableTotalRecordCount
		val data = null
		val response = api.get<BaseItemDtoQueryResult>("/Users/{userId}/Suggestions", pathParameters,
				queryParameters, data)
		return response
	}
}
