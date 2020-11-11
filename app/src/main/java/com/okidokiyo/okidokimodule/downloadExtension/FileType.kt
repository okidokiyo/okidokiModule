package com.okidokiyo.okidokimodule.downloadExtension

enum class FileType(
    val mimeType: String
) {
    AUDIO("audio/*"),
    IMAGE("image/*"),
    PDF("application/pdf"),
    TEXT("text/*"),
    VIDEO("video/*"),
    XML("application/xml");
}