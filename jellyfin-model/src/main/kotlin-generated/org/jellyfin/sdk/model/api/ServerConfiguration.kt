// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents the server configuration.
 */
@Serializable
public data class ServerConfiguration(
	/**
	 * Gets or sets the number of days we should retain log files.
	 */
	@SerialName("LogFileRetentionDays")
	public val logFileRetentionDays: Int,
	/**
	 * Gets or sets a value indicating whether this instance is first run.
	 */
	@SerialName("IsStartupWizardCompleted")
	public val isStartupWizardCompleted: Boolean,
	/**
	 * Gets or sets the cache path.
	 */
	@SerialName("CachePath")
	public val cachePath: String? = null,
	/**
	 * Gets or sets the last known version that was ran using the configuration.
	 */
	@SerialName("PreviousVersion")
	public val previousVersion: Version? = null,
	/**
	 * Gets or sets the stringified PreviousVersion to be stored/loaded,
	 * because System.Version itself isn't xml-serializable.
	 */
	@SerialName("PreviousVersionStr")
	public val previousVersionStr: String? = null,
	/**
	 * Gets or sets a value indicating whether to enable automatic port forwarding.
	 */
	@SerialName("EnableUPnP")
	public val enableUPnP: Boolean,
	/**
	 * Gets or sets a value indicating whether to enable prometheus metrics exporting.
	 */
	@SerialName("EnableMetrics")
	public val enableMetrics: Boolean,
	/**
	 * Gets or sets the public mapped port.
	 */
	@SerialName("PublicPort")
	public val publicPort: Int,
	/**
	 * Gets or sets a value indicating whether the http port should be mapped as part of UPnP automatic
	 * port forwarding.
	 */
	@SerialName("UPnPCreateHttpPortMap")
	public val uPnPCreateHttpPortMap: Boolean,
	/**
	 * Gets or sets client udp port range.
	 */
	@SerialName("UDPPortRange")
	public val udpPortRange: String,
	/**
	 * Gets or sets a value indicating whether IPV6 capability is enabled.
	 */
	@SerialName("EnableIPV6")
	public val enableIpv6: Boolean,
	/**
	 * Gets or sets a value indicating whether IPV4 capability is enabled.
	 */
	@SerialName("EnableIPV4")
	public val enableIpv4: Boolean,
	/**
	 * Gets or sets a value indicating whether detailed ssdp logs are sent to the console/log.
	 * "Emby.Dlna": "Debug" must be set in logging.default.json for this property to work.
	 */
	@SerialName("EnableSSDPTracing")
	public val enableSsdpTracing: Boolean,
	/**
	 * Gets or sets a value indicating whether an IP address is to be used to filter the detailed ssdp
	 * logs that are being sent to the console/log.
	 * If the setting "Emby.Dlna": "Debug" msut be set in logging.default.json for this property to
	 * work.
	 */
	@SerialName("SSDPTracingFilter")
	public val ssdpTracingFilter: String,
	/**
	 * Gets or sets the number of times SSDP UDP messages are sent.
	 */
	@SerialName("UDPSendCount")
	public val udpSendCount: Int,
	/**
	 * Gets or sets the delay between each groups of SSDP messages (in ms).
	 */
	@SerialName("UDPSendDelay")
	public val udpSendDelay: Int,
	/**
	 * Gets or sets a value indicating whether address names that match
	 * MediaBrowser.Model.Configuration.ServerConfiguration.VirtualInterfaceNames should be Ignore for the
	 * purposes of binding.
	 */
	@SerialName("IgnoreVirtualInterfaces")
	public val ignoreVirtualInterfaces: Boolean,
	/**
	 * Gets or sets a value indicating the interfaces that should be ignored. The list can be comma
	 * separated. <seealso
	 * cref="P:MediaBrowser.Model.Configuration.ServerConfiguration.IgnoreVirtualInterfaces" />.
	 */
	@SerialName("VirtualInterfaceNames")
	public val virtualInterfaceNames: String,
	/**
	 * Gets or sets the time (in seconds) between the pings of SSDP gateway monitor.
	 */
	@SerialName("GatewayMonitorPeriod")
	public val gatewayMonitorPeriod: Int,
	/**
	 * Gets a value indicating whether multi-socket binding is available.
	 */
	@SerialName("EnableMultiSocketBinding")
	public val enableMultiSocketBinding: Boolean,
	/**
	 * Gets or sets a value indicating whether all IPv6 interfaces should be treated as on the internal
	 * network.
	 * Depending on the address range implemented ULA ranges might not be used.
	 */
	@SerialName("TrustAllIP6Interfaces")
	public val trustAllIp6Interfaces: Boolean,
	/**
	 * Gets or sets the ports that HDHomerun uses.
	 */
	@SerialName("HDHomerunPortRange")
	public val hdHomerunPortRange: String,
	/**
	 * Gets or sets PublishedServerUri to advertise for specific subnets.
	 */
	@SerialName("PublishedServerUriBySubnet")
	public val publishedServerUriBySubnet: List<String>,
	/**
	 * Gets or sets a value indicating whether Autodiscovery tracing is enabled.
	 */
	@SerialName("AutoDiscoveryTracing")
	public val autoDiscoveryTracing: Boolean,
	/**
	 * Gets or sets a value indicating whether Autodiscovery is enabled.
	 */
	@SerialName("AutoDiscovery")
	public val autoDiscovery: Boolean,
	/**
	 * Gets or sets the public HTTPS port.
	 */
	@SerialName("PublicHttpsPort")
	public val publicHttpsPort: Int,
	/**
	 * Gets or sets the HTTP server port number.
	 */
	@SerialName("HttpServerPortNumber")
	public val httpServerPortNumber: Int,
	/**
	 * Gets or sets the HTTPS server port number.
	 */
	@SerialName("HttpsPortNumber")
	public val httpsPortNumber: Int,
	/**
	 * Gets or sets a value indicating whether to use HTTPS.
	 */
	@SerialName("EnableHttps")
	public val enableHttps: Boolean,
	@SerialName("EnableNormalizedItemByNameIds")
	public val enableNormalizedItemByNameIds: Boolean,
	/**
	 * Gets or sets the filesystem path of an X.509 certificate to use for SSL.
	 */
	@SerialName("CertificatePath")
	public val certificatePath: String,
	/**
	 * Gets or sets the password required to access the X.509 certificate data in the file specified by
	 * MediaBrowser.Model.Configuration.ServerConfiguration.CertificatePath.
	 */
	@SerialName("CertificatePassword")
	public val certificatePassword: String,
	/**
	 * Gets or sets a value indicating whether this instance is port authorized.
	 */
	@SerialName("IsPortAuthorized")
	public val isPortAuthorized: Boolean,
	/**
	 * Gets or sets a value indicating whether quick connect is available for use on this server.
	 */
	@SerialName("QuickConnectAvailable")
	public val quickConnectAvailable: Boolean,
	/**
	 * Gets or sets a value indicating whether access outside of the LAN is permitted.
	 */
	@SerialName("EnableRemoteAccess")
	public val enableRemoteAccess: Boolean,
	/**
	 * Gets or sets a value indicating whether [enable case sensitive item ids].
	 */
	@SerialName("EnableCaseSensitiveItemIds")
	public val enableCaseSensitiveItemIds: Boolean,
	@SerialName("DisableLiveTvChannelUserDataName")
	public val disableLiveTvChannelUserDataName: Boolean,
	/**
	 * Gets or sets the metadata path.
	 */
	@SerialName("MetadataPath")
	public val metadataPath: String,
	@SerialName("MetadataNetworkPath")
	public val metadataNetworkPath: String,
	/**
	 * Gets or sets the preferred metadata language.
	 */
	@SerialName("PreferredMetadataLanguage")
	public val preferredMetadataLanguage: String,
	/**
	 * Gets or sets the metadata country code.
	 */
	@SerialName("MetadataCountryCode")
	public val metadataCountryCode: String,
	/**
	 * Gets or sets characters to be replaced with a ' ' in strings to create a sort name.
	 */
	@SerialName("SortReplaceCharacters")
	public val sortReplaceCharacters: List<String>,
	/**
	 * Gets or sets characters to be removed from strings to create a sort name.
	 */
	@SerialName("SortRemoveCharacters")
	public val sortRemoveCharacters: List<String>,
	/**
	 * Gets or sets words to be removed from strings to create a sort name.
	 */
	@SerialName("SortRemoveWords")
	public val sortRemoveWords: List<String>,
	/**
	 * Gets or sets the minimum percentage of an item that must be played in order for playstate to be
	 * updated.
	 */
	@SerialName("MinResumePct")
	public val minResumePct: Int,
	/**
	 * Gets or sets the maximum percentage of an item that can be played while still saving playstate.
	 * If this percentage is crossed playstate will be reset to the beginning and the item will be marked
	 * watched.
	 */
	@SerialName("MaxResumePct")
	public val maxResumePct: Int,
	/**
	 * Gets or sets the minimum duration that an item must have in order to be eligible for playstate
	 * updates..
	 */
	@SerialName("MinResumeDurationSeconds")
	public val minResumeDurationSeconds: Int,
	/**
	 * Gets or sets the minimum minutes of a book that must be played in order for playstate to be
	 * updated.
	 */
	@SerialName("MinAudiobookResume")
	public val minAudiobookResume: Int,
	/**
	 * Gets or sets the remaining minutes of a book that can be played while still saving playstate. If
	 * this percentage is crossed playstate will be reset to the beginning and the item will be marked
	 * watched.
	 */
	@SerialName("MaxAudiobookResume")
	public val maxAudiobookResume: Int,
	/**
	 * Gets or sets the delay in seconds that we will wait after a file system change to try and
	 * discover what has been added/removed
	 * Some delay is necessary with some items because their creation is not atomic.  It involves the
	 * creation of several
	 * different directories and files.
	 */
	@SerialName("LibraryMonitorDelay")
	public val libraryMonitorDelay: Int,
	/**
	 * Gets or sets a value indicating whether [enable dashboard response caching].
	 * Allows potential contributors without visual studio to modify production dashboard code and test
	 * changes.
	 */
	@SerialName("EnableDashboardResponseCaching")
	public val enableDashboardResponseCaching: Boolean,
	/**
	 * Gets or sets the image saving convention.
	 */
	@SerialName("ImageSavingConvention")
	public val imageSavingConvention: ImageSavingConvention,
	@SerialName("MetadataOptions")
	public val metadataOptions: List<MetadataOptions>,
	@SerialName("SkipDeserializationForBasicTypes")
	public val skipDeserializationForBasicTypes: Boolean,
	@SerialName("ServerName")
	public val serverName: String,
	@SerialName("BaseUrl")
	public val baseUrl: String,
	@SerialName("UICulture")
	public val uiCulture: String,
	@SerialName("SaveMetadataHidden")
	public val saveMetadataHidden: Boolean,
	@SerialName("ContentTypes")
	public val contentTypes: List<NameValuePair>,
	@SerialName("RemoteClientBitrateLimit")
	public val remoteClientBitrateLimit: Int,
	@SerialName("EnableFolderView")
	public val enableFolderView: Boolean,
	@SerialName("EnableGroupingIntoCollections")
	public val enableGroupingIntoCollections: Boolean,
	@SerialName("DisplaySpecialsWithinSeasons")
	public val displaySpecialsWithinSeasons: Boolean,
	/**
	 * Gets or sets the subnets that are deemed to make up the LAN.
	 */
	@SerialName("LocalNetworkSubnets")
	public val localNetworkSubnets: List<String>,
	/**
	 * Gets or sets the interface addresses which Jellyfin will bind to. If empty, all interfaces will
	 * be used.
	 */
	@SerialName("LocalNetworkAddresses")
	public val localNetworkAddresses: List<String>,
	@SerialName("CodecsUsed")
	public val codecsUsed: List<String>,
	@SerialName("PluginRepositories")
	public val pluginRepositories: List<RepositoryInfo>,
	@SerialName("EnableExternalContentInSuggestions")
	public val enableExternalContentInSuggestions: Boolean,
	/**
	 * Gets or sets a value indicating whether the server should force connections over HTTPS.
	 */
	@SerialName("RequireHttps")
	public val requireHttps: Boolean,
	@SerialName("EnableNewOmdbSupport")
	public val enableNewOmdbSupport: Boolean,
	/**
	 * Gets or sets the filter for remote IP connectivity. Used in conjuntion with <seealso
	 * cref="P:MediaBrowser.Model.Configuration.ServerConfiguration.IsRemoteIPFilterBlacklist" />.
	 */
	@SerialName("RemoteIPFilter")
	public val remoteIpFilter: List<String>,
	/**
	 * Gets or sets a value indicating whether <seealso
	 * cref="P:MediaBrowser.Model.Configuration.ServerConfiguration.RemoteIPFilter" /> contains a
	 * blacklist or a whitelist. Default is a whitelist.
	 */
	@SerialName("IsRemoteIPFilterBlacklist")
	public val isRemoteIpFilterBlacklist: Boolean,
	@SerialName("ImageExtractionTimeoutMs")
	public val imageExtractionTimeoutMs: Int,
	@SerialName("PathSubstitutions")
	public val pathSubstitutions: List<PathSubstitution>,
	@SerialName("UninstalledPlugins")
	public val uninstalledPlugins: List<String>,
	/**
	 * Gets or sets a value indicating whether slow server responses should be logged as a warning.
	 */
	@SerialName("EnableSlowResponseWarning")
	public val enableSlowResponseWarning: Boolean,
	/**
	 * Gets or sets the threshold for the slow response time warning in ms.
	 */
	@SerialName("SlowResponseThresholdMs")
	public val slowResponseThresholdMs: Long,
	/**
	 * Gets or sets the cors hosts.
	 */
	@SerialName("CorsHosts")
	public val corsHosts: List<String>,
	/**
	 * Gets or sets the known proxies.
	 */
	@SerialName("KnownProxies")
	public val knownProxies: List<String>,
	/**
	 * Gets or sets the number of days we should retain activity logs.
	 */
	@SerialName("ActivityLogRetentionDays")
	public val activityLogRetentionDays: Int? = null,
	/**
	 * Gets or sets the how the library scan fans out.
	 */
	@SerialName("LibraryScanFanoutConcurrency")
	public val libraryScanFanoutConcurrency: Int,
	/**
	 * Gets or sets the how many metadata refreshes can run concurrently.
	 */
	@SerialName("LibraryMetadataRefreshConcurrency")
	public val libraryMetadataRefreshConcurrency: Int,
	/**
	 * Gets or sets a value indicating whether older plugins should automatically be deleted from the
	 * plugin folder.
	 */
	@SerialName("RemoveOldPlugins")
	public val removeOldPlugins: Boolean
)
