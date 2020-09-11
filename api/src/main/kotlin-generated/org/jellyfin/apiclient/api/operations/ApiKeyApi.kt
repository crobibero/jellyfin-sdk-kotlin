// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import kotlin.Any
import kotlin.String
import kotlin.Unit
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.AuthenticationInfoQueryResult

class ApiKeyApi(
	private val api: KtorClient
) {
	/**
	 * Get all keys.
	 */
	suspend fun getKeys(): Response<AuthenticationInfoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<AuthenticationInfoQueryResult>("/Auth/Keys", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Create a new api key.
	 *
	 * @param app Name of the app using the authentication key.
	 */
	suspend fun createKey(app: String): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["app"] = app
		val data = null
		val response = api.post<Unit>("/Auth/Keys", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Remove an api key.
	 *
	 * @param key The access token to delete.
	 */
	suspend fun revokeKey(key: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["key"] = key
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.delete<Unit>("/Auth/Keys/{key}", pathParameters, queryParameters, data)
		return response
	}
}
