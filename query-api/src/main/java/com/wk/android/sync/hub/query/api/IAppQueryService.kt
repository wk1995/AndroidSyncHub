package com.wk.android.sync.hub.query.api

import android.health.connect.datatypes.AppInfo

interface IAppQueryService {

    /**
     * 获取最新的应用信息
     * */
    fun getLatestAppInfo(appId:String): AppInfo?

    /**
     * 获取所有应用信息列表
     * */
    fun getAllAppInfoList(): List<List<AppInfo>>

}