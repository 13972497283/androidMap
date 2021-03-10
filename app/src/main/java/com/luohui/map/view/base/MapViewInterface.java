package com.luohui.map.view.base;

/**
 * MapActivity 接口：将常用功能抽取出来，便于后面管理
 */
public interface MapViewInterface {

    /**
     * 显示Poi detail
     *
     * @param locTitle 定位标题,比如当前所在位置名称
     * @param locInfo  定位信息,比如当前在什么附近/距离当前位置多少米
     */
    void showPoiDetail(String locTitle, String locInfo);

    /**
     * 隐藏poi detail
     */
    void hidePoiDetail();

    /**
     * poi detail显示：显示地图
     */
    void showBackToMapState();

    /**
     * poi detail显示:查看详情
     */
    void showPoiDetailState();


    /**
     * poi detail折叠
     */
  //  void onPoiDetailCollapsed();




}
