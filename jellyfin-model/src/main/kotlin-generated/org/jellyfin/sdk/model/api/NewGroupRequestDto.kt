// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Class NewGroupRequestDto.
 */
@Serializable
public data class NewGroupRequestDto(
	/**
	 * Gets or sets the group name.
	 */
	@SerialName("GroupName")
	public val groupName: String
)
