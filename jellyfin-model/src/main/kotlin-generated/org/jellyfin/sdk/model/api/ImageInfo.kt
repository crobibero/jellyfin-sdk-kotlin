// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Class ImageInfo.
 */
@Serializable
public data class ImageInfo(
	/**
	 * Gets or sets the type of the image.
	 */
	@SerialName("ImageType")
	public val imageType: ImageType,
	/**
	 * Gets or sets the index of the image.
	 */
	@SerialName("ImageIndex")
	public val imageIndex: Int? = null,
	/**
	 * Gets or sets the image tag.
	 */
	@SerialName("ImageTag")
	public val imageTag: String? = null,
	/**
	 * Gets or sets the path.
	 */
	@SerialName("Path")
	public val path: String? = null,
	/**
	 * Gets or sets the blurhash.
	 */
	@SerialName("BlurHash")
	public val blurHash: String? = null,
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
	 * Gets or sets the size.
	 */
	@SerialName("Size")
	public val size: Long
)