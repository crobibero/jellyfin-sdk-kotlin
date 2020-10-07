// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(
	LocalDateTimeSerializer::class,
	UUIDSerializer::class
)

package org.jellyfin.apiclient.model.api

import java.time.LocalDateTime
import java.util.UUID
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.serializer.LocalDateTimeSerializer
import org.jellyfin.apiclient.model.serializer.UUIDSerializer

/**
 * Class BaseItem.
 */
@Serializable
data class BaseItem(
	@SerialName("Size")
	val size: Long? = null,
	@SerialName("Container")
	val container: String? = null,
	@SerialName("DateLastSaved")
	val dateLastSaved: LocalDateTime,
	/**
	 * Gets or sets the remote trailers.
	 */
	@SerialName("RemoteTrailers")
	val remoteTrailers: List<MediaUrl>? = null,
	@SerialName("IsHD")
	val isHd: Boolean,
	@SerialName("IsShortcut")
	val isShortcut: Boolean,
	@SerialName("ShortcutPath")
	val shortcutPath: String? = null,
	@SerialName("Width")
	val width: Int,
	@SerialName("Height")
	val height: Int,
	@SerialName("ExtraIds")
	val extraIds: List<UUID>? = null,
	@SerialName("SupportsExternalTransfer")
	val supportsExternalTransfer: Boolean
)