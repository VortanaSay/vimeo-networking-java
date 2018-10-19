package com.vimeo.networking2

import com.vimeo.networking2.common.Followable
import com.vimeo.networking2.enums.AccountType
import com.vimeo.networking2.enums.AccountType.UNKNOWN
import com.vimeo.networking2.enums.ContentFilterType
import java.util.*

/**
 * User information.
 */
data class User(

    /**
     * The user's account type
     */
    val account: AccountType = UNKNOWN,

    /**
     * Information about the user's badge.
     *
     * Requires [CapabilitiesType.CAPABILITY_VIEW_USER_BADGE].
     */
    val badge: UserBadge? = null,

    /**
     * The user's bio.
     */
    val bio: String? = null,

    /**
     * The user's content filters:
     */
    val contentFilter: List<ContentFilterType>? = null,

    /**
     * The time in ISO 8601 format when the user account was created.
     */
    val createdTime: Date? = null,

    /**
     * The user's email address.
     */
    val email: String? = null,

    /**
     * An array of alternate emails for the user.
     */
    val emails: List<String>? = null,

    /**
     * The absolute URL of this user's profile page.
     */
    val link: String? = null,

    /**
     * Information about the user's live streaming quota.
     */
    val liveQuota: LiveQuota? = null,

    /**
     * The user's location.
     */
    val location: String? = null,

    /**
     * The user's metadata.
     */
    override val metadata: Metadata<UserConnections, UserInteractions>? = null,

    /**
     * The user's display name.
     */
    val name: String? = null,

    /**
     * The user's stored payment information.
     */
    val payment: Payment? = null,

    /**
     * The active portrait of this user.
     */
    val pictures: PictureCollection? = null,

    /**
     * User's preferences.
     */
    val preferences: Preferences? = null,

    /**
     * The user's resource key string.
     */
    val resourceKey: String? = null,

    /**
     * Appears only when the user has upload access and is looking at their own user record.
     */
    val uploadQuota: UploadQuota? = null,

    /**
     * The user's canonical relative URI.
     */
    val uri: String? = null,

    /**
     * The user's email verification status.
     *
     * Requires [CapabilitiesType.CAPABILITY_API_APP_MANAGEMENT].
     */
    val verified: Boolean? = null,

    /**
     * The user's websites.
     */
    val websites: List<Website>? = null

): Followable
