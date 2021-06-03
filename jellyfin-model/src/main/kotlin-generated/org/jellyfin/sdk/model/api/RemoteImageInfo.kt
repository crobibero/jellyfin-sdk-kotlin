// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Class RemoteImageInfo.
 */
@Serializable
public data class RemoteImageInfo(
	/**
	 * Gets or sets the name of the provider.
	 */
	@SerialName("ProviderName")
	public val providerName: String? = null,
	/**
	 * Gets or sets the URL.
	 */
	@SerialName("Url")
	public val url: String? = null,
	/**
	 * Gets a url used for previewing a smaller version.
	 */
	@SerialName("ThumbnailUrl")
	public val thumbnailUrl: String? = null,
	/**
	 * Gets or sets the height.
	 */
	@SerialName("Height")
	public val height: Int? = null,
	/**
	 * Gets or sets the width.
	 */
	@SerialName("Width")
	public val width: Int? = null,
	/**
	 * Gets or sets the community rating.
	 */
	@SerialName("CommunityRating")
	public val communityRating: Double? = null,
	/**
	 * Gets or sets the vote count.
	 */
	@SerialName("VoteCount")
	public val voteCount: Int? = null,
	/**
	 * Gets or sets the language.
	 */
	@SerialName("Language")
	public val language: String? = null,
	@SerialName("Type")
	public val type: ImageType,
	@SerialName("RatingType")
	public val ratingType: RatingType
)
