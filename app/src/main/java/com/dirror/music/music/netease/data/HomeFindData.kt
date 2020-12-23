package com.dirror.music.music.netease.data

/**
 * 首页发现数据
 */
data class HomeFindData(
    val code: Int,
    val data: DataData
) {
    data class DataData(
        val blocks: ArrayList<BlocksData>
    ) {
        data class BlocksData(
            val blockCode: String,
            val extInfo: ArrayList<BannerData>?,
            // val uiElement:
        )
    }
}
