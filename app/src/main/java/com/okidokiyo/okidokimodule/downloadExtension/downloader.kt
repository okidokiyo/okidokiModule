package com.okidokiyo.okidokimodule.downloadExtension

import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Environment
import java.io.File

/**
 *
 * @author Ethan on 2020-11-10
 */
fun Context.simpleDownloader(
    url: String,
    filename: String,
    type: FileType
) {
    val dm = this.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
    val request = DownloadManager.Request(Uri.parse(url))
        .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
        .setAllowedOverRoaming(false)
        .setTitle(filename)
        .setMimeType(type.mimeType)
        .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
        .setDestinationInExternalPublicDir(
            Environment.DIRECTORY_DOWNLOADS,
            File.pathSeparator + filename)
    dm.enqueue(request)
}