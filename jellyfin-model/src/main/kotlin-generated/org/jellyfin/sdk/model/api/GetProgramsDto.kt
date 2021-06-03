// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(
	UUIDSerializer::class,
	LocalDateTimeSerializer::class
)

package org.jellyfin.sdk.model.api

import java.time.LocalDateTime
import java.util.UUID
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.serializer.LocalDateTimeSerializer
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Get programs dto.
 */
@Serializable
public data class GetProgramsDto(
	/**
	 * Gets or sets the channels to return guide information for.
	 */
	@SerialName("ChannelIds")
	public val channelIds: List<UUID>,
	/**
	 * Gets or sets optional. Filter by user id.
	 */
	@SerialName("UserId")
	public val userId: UUID,
	/**
	 * Gets or sets the minimum premiere start date.
	 * Optional.
	 */
	@SerialName("MinStartDate")
	public val minStartDate: LocalDateTime? = null,
	/**
	 * Gets or sets filter by programs that have completed airing, or not.
	 * Optional.
	 */
	@SerialName("HasAired")
	public val hasAired: Boolean? = null,
	/**
	 * Gets or sets filter by programs that are currently airing, or not.
	 * Optional.
	 */
	@SerialName("IsAiring")
	public val isAiring: Boolean? = null,
	/**
	 * Gets or sets the maximum premiere start date.
	 * Optional.
	 */
	@SerialName("MaxStartDate")
	public val maxStartDate: LocalDateTime? = null,
	/**
	 * Gets or sets the minimum premiere end date.
	 * Optional.
	 */
	@SerialName("MinEndDate")
	public val minEndDate: LocalDateTime? = null,
	/**
	 * Gets or sets the maximum premiere end date.
	 * Optional.
	 */
	@SerialName("MaxEndDate")
	public val maxEndDate: LocalDateTime? = null,
	/**
	 * Gets or sets filter for movies.
	 * Optional.
	 */
	@SerialName("IsMovie")
	public val isMovie: Boolean? = null,
	/**
	 * Gets or sets filter for series.
	 * Optional.
	 */
	@SerialName("IsSeries")
	public val isSeries: Boolean? = null,
	/**
	 * Gets or sets filter for news.
	 * Optional.
	 */
	@SerialName("IsNews")
	public val isNews: Boolean? = null,
	/**
	 * Gets or sets filter for kids.
	 * Optional.
	 */
	@SerialName("IsKids")
	public val isKids: Boolean? = null,
	/**
	 * Gets or sets filter for sports.
	 * Optional.
	 */
	@SerialName("IsSports")
	public val isSports: Boolean? = null,
	/**
	 * Gets or sets the record index to start at. All items with a lower index will be dropped from the
	 * results.
	 * Optional.
	 */
	@SerialName("StartIndex")
	public val startIndex: Int? = null,
	/**
	 * Gets or sets the maximum number of records to return.
	 * Optional.
	 */
	@SerialName("Limit")
	public val limit: Int? = null,
	/**
	 * Gets or sets specify one or more sort orders, comma delimited. Options: Name, StartDate.
	 * Optional.
	 */
	@SerialName("SortBy")
	public val sortBy: List<String>,
	/**
	 * Gets or sets sort Order - Ascending,Descending.
	 */
	@SerialName("SortOrder")
	public val sortOrder: List<SortOrder>,
	/**
	 * Gets or sets the genres to return guide information for.
	 */
	@SerialName("Genres")
	public val genres: List<String>,
	/**
	 * Gets or sets the genre ids to return guide information for.
	 */
	@SerialName("GenreIds")
	public val genreIds: List<UUID>,
	/**
	 * Gets or sets include image information in output.
	 * Optional.
	 */
	@SerialName("EnableImages")
	public val enableImages: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether retrieve total record count.
	 */
	@SerialName("EnableTotalRecordCount")
	public val enableTotalRecordCount: Boolean,
	/**
	 * Gets or sets the max number of images to return, per image type.
	 * Optional.
	 */
	@SerialName("ImageTypeLimit")
	public val imageTypeLimit: Int? = null,
	/**
	 * Gets or sets the image types to include in the output.
	 * Optional.
	 */
	@SerialName("EnableImageTypes")
	public val enableImageTypes: List<ImageType>,
	/**
	 * Gets or sets include user data.
	 * Optional.
	 */
	@SerialName("EnableUserData")
	public val enableUserData: Boolean? = null,
	/**
	 * Gets or sets filter by series timer id.
	 * Optional.
	 */
	@SerialName("SeriesTimerId")
	public val seriesTimerId: String? = null,
	/**
	 * Gets or sets filter by library series id.
	 * Optional.
	 */
	@SerialName("LibrarySeriesId")
	public val librarySeriesId: UUID,
	/**
	 * Gets or sets specify additional fields of information to return in the output. This allows
	 * multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl,
	 * IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio,
	 * Revenue, SortName, Studios, Taglines.
	 * Optional.
	 */
	@SerialName("Fields")
	public val fields: List<ItemFields>
)
