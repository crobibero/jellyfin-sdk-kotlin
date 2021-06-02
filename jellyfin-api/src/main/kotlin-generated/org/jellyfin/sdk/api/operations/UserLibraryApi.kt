// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import org.jellyfin.sdk.api.client.KtorClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.model.api.BaseItemDto
import org.jellyfin.sdk.model.api.BaseItemDtoQueryResult
import org.jellyfin.sdk.model.api.BaseItemKind
import org.jellyfin.sdk.model.api.ImageType
import org.jellyfin.sdk.model.api.ItemFields
import org.jellyfin.sdk.model.api.UserItemDataDto

public class UserLibraryApi(
	private val api: KtorClient
) {
	/**
	 * Deletes a user's saved personal rating for an item.
	 *
	 * @param userId User id.
	 * @param itemId Item id.
	 */
	public suspend fun deleteUserItemRating(userId: UUID, itemId: UUID): Response<UserItemDataDto> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.delete<UserItemDataDto>("/Users/{userId}/Items/{itemId}/Rating",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets intros to play before the main media item plays.
	 *
	 * @param userId User id.
	 * @param itemId Item id.
	 */
	public suspend fun getIntros(userId: UUID, itemId: UUID): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Users/{userId}/Items/{itemId}/Intros",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets an item from a user's library.
	 *
	 * @param userId User id.
	 * @param itemId Item id.
	 */
	public suspend fun getItem(userId: UUID, itemId: UUID): Response<BaseItemDto> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<BaseItemDto>("/Users/{userId}/Items/{itemId}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets latest media.
	 *
	 * @param userId User id.
	 * @param parentId Specify this to localize the search to a specific item or folder. Omit to use
	 * the root.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param includeItemTypes Optional. If specified, results will be filtered based on item type.
	 * This allows multiple, comma delimited.
	 * @param isPlayed Filter by items that are played, or not.
	 * @param enableImages Optional. include image information in output.
	 * @param imageTypeLimit Optional. the max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 * @param enableUserData Optional. include user data.
	 * @param limit Return item limit.
	 * @param groupItems Whether or not to group items into a parent container.
	 */
	public suspend fun getLatestMedia(
		userId: UUID,
		parentId: UUID? = null,
		fields: List<ItemFields>? = emptyList(),
		includeItemTypes: List<BaseItemKind>? = emptyList(),
		isPlayed: Boolean? = null,
		enableImages: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList(),
		enableUserData: Boolean? = null,
		limit: Int? = 20,
		groupItems: Boolean? = true
	): Response<List<BaseItemDto>> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["parentId"] = parentId
		queryParameters["fields"] = fields
		queryParameters["includeItemTypes"] = includeItemTypes
		queryParameters["isPlayed"] = isPlayed
		queryParameters["enableImages"] = enableImages
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		queryParameters["enableUserData"] = enableUserData
		queryParameters["limit"] = limit
		queryParameters["groupItems"] = groupItems
		val data = null
		val response = api.`get`<List<BaseItemDto>>("/Users/{userId}/Items/Latest", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets local trailers for an item.
	 *
	 * @param userId User id.
	 * @param itemId Item id.
	 */
	public suspend fun getLocalTrailers(userId: UUID, itemId: UUID): Response<List<BaseItemDto>> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<BaseItemDto>>("/Users/{userId}/Items/{itemId}/LocalTrailers",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets the root folder from a user's library.
	 *
	 * @param userId User id.
	 */
	public suspend fun getRootFolder(userId: UUID): Response<BaseItemDto> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<BaseItemDto>("/Users/{userId}/Items/Root", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets special features for an item.
	 *
	 * @param userId User id.
	 * @param itemId Item id.
	 */
	public suspend fun getSpecialFeatures(userId: UUID, itemId: UUID): Response<List<BaseItemDto>> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<BaseItemDto>>("/Users/{userId}/Items/{itemId}/SpecialFeatures",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Marks an item as a favorite.
	 *
	 * @param userId User id.
	 * @param itemId Item id.
	 */
	public suspend fun markFavoriteItem(userId: UUID, itemId: UUID): Response<UserItemDataDto> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<UserItemDataDto>("/Users/{userId}/FavoriteItems/{itemId}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Unmarks item as a favorite.
	 *
	 * @param userId User id.
	 * @param itemId Item id.
	 */
	public suspend fun unmarkFavoriteItem(userId: UUID, itemId: UUID): Response<UserItemDataDto> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.delete<UserItemDataDto>("/Users/{userId}/FavoriteItems/{itemId}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Updates a user's rating for an item.
	 *
	 * @param userId User id.
	 * @param itemId Item id.
	 * @param likes Whether this
	 * M:Jellyfin.Api.Controllers.UserLibraryController.UpdateUserItemRating(System.Guid,System.Guid,System.Nullable{System.Boolean})
	 * is likes.
	 */
	public suspend fun updateUserItemRating(
		userId: UUID,
		itemId: UUID,
		likes: Boolean? = null
	): Response<UserItemDataDto> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["likes"] = likes
		val data = null
		val response = api.post<UserItemDataDto>("/Users/{userId}/Items/{itemId}/Rating", pathParameters,
				queryParameters, data)
		return response
	}
}
