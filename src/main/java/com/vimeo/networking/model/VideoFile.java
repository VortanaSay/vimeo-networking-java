package com.vimeo.networking.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alfredhanssen on 4/25/15.
 */
public class VideoFile implements Serializable {

    public enum MimeType {
        NONE,
        @SerializedName("video/mp4")
        MP4,
        @SerializedName("video/webm")
        WEBM, // Flash
        @SerializedName("vp6/x-video")
        VP6 // Flash
    }

    public enum VideoQuality {
        NONE,
        @SerializedName("hls")
        HLS,
        @SerializedName("hd")
        HD,
        @SerializedName("sd")
        SD,
        @SerializedName("mobile")
        MOBILE
    }

    private static final long serialVersionUID = -5256416394912086020L;

    public Date expires;
    public int width;
    public int height;
    public int size;
    public String link;
    private VideoQuality quality;
    private MimeType type;
    public VideoLog log;

    public VideoQuality getQuality() {
        return quality == null ? VideoQuality.NONE : quality;
    }

    public MimeType getType() {
        return type == null ? MimeType.NONE : type;
    }

    public boolean isVP6() {
        return getType() == MimeType.VP6;
    }
}
