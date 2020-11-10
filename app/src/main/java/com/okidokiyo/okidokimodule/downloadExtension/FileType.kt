package com.okidokiyo.okidokimodule.downloadExtension

/**
 *
 * @author Ethan on 2020-11-10
 */
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