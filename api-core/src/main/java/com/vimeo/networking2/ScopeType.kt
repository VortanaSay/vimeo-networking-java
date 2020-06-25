package com.vimeo.networking2

import com.vimeo.networking2.enums.StringValue

/**
 * All scopes that can be passed to the API. They determine what information you
 * could get and your permissions in the Vimeo API. Here is more info on all the
 * supported scopes @see https://developer.vimeo.com/api/authentication#scopes.
 */
enum class ScopeType(override val value: String) : StringValue {
    PRIVATE("private"),
    PUBLIC("public"),
    PURCHASED("purchased"),
    PURCHASE("purchase"),
    CREATE("create"),
    EDIT("edit"),
    DELETE("delete"),
    INTERACT("interact"),
    UPLOAD("upload"),
    PROMO_CODES("promo_codes"),
    VIDEO_FILES("video_files"),
    STATS("stats")
}
