package com.wk.android.sync.hub.query.api

/**
 * @param appTypeString 应用类型 android
 * @param appName 应用名称
 * @param appVersion 应用版本号
 * @param appBuildCode 应用版本号
 * @param installUrl 安装包地址
 * @param changeLog 变更日志
 * @param appSize 应用大小
 * */
data class AppInfo(
    val appTypeString: String,
    val appName: String,
    val appVersion:String,
    val appBuildCode:Int,
    val installUrl:String,
    val changeLog:String,
    val appSize:Long,
)
