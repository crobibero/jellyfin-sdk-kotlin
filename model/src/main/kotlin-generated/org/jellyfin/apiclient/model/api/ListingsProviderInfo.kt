// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ListingsProviderInfo(
	@SerialName("Id")
	val id: String? = null,
	@SerialName("Type")
	val type: String? = null,
	@SerialName("Username")
	val username: String? = null,
	@SerialName("Password")
	val password: String? = null,
	@SerialName("ListingsId")
	val listingsId: String? = null,
	@SerialName("ZipCode")
	val zipCode: String? = null,
	@SerialName("Country")
	val country: String? = null,
	@SerialName("Path")
	val path: String? = null,
	@SerialName("EnabledTuners")
	val enabledTuners: List<String>? = null,
	@SerialName("EnableAllTuners")
	val enableAllTuners: Boolean,
	@SerialName("NewsCategories")
	val newsCategories: List<String>? = null,
	@SerialName("SportsCategories")
	val sportsCategories: List<String>? = null,
	@SerialName("KidsCategories")
	val kidsCategories: List<String>? = null,
	@SerialName("MovieCategories")
	val movieCategories: List<String>? = null,
	@SerialName("ChannelMappings")
	val channelMappings: List<NameValuePair>? = null,
	@SerialName("MoviePrefix")
	val moviePrefix: String? = null,
	@SerialName("PreferredLanguage")
	val preferredLanguage: String? = null,
	@SerialName("UserAgent")
	val userAgent: String? = null
)