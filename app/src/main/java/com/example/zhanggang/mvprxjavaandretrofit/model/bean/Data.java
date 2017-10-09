package com.example.zhanggang.mvprxjavaandretrofit.model.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by zhanggang on 2017/10/9.
 */

public class Data {

    /**
     * error : false
     * results : [{"_id":"59db041a421aa94e07d18486","content":"<p><img alt=\"\" src=\"https://ws1.sinaimg.cn/large/610dc034ly1fjxu5qqdjoj20qo0xc0wk.jpg\" /><\/p>\r\n\r\n<h3>Android<\/h3>\r\n\r\n<ul>\r\n\t<li><a href=\"http://rkhcy.github.io/2017/09/27/TransitionNote2/\" target=\"_blank\">Transition学习笔记<\/a>&nbsp;(HuYounger)\r\n\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n\t<li><a href=\"https://github.com/jaychang0917/SimpleApiClient\" target=\"_blank\">A retrofit extension written in kotlin<\/a>&nbsp;(Jay)\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n\t<li><a href=\"https://github.com/zhihu/zhihu-rxjava-meetup\" target=\"_blank\">知乎 x RxJava Meetup 活动 PPT。<\/a>&nbsp;(代码家)\r\n\t<ul>\r\n\t\t<li><a href=\"https://github.com/zhihu/zhihu-rxjava-meetup\" target=\"_blank\"><img src=\"http://img.gank.io/404c29df-df48-4c43-aaec-b60fa1256388?imageView2/2/w/460\" title=\"知乎 x RxJava Meetup 活动 PPT。\" /><\/a><\/li>\r\n\t<\/ul>\r\n\t<\/li>\r\n\t<li><a href=\"https://blog.mindorks.com/what-are-coroutines-in-kotlin-bf4fecd476e9\" target=\"_blank\">What are Coroutines in Kotlin?<\/a>&nbsp;(AMIT SHEKHAR)\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n<\/ul>\r\n\r\n<h3>前端<\/h3>\r\n\r\n<ul>\r\n\t<li><a href=\"https://zhuanlan.zhihu.com/p/29446347\" target=\"_blank\">前端每周清单第 31 期: iOS 11 Viewport 解析，Preact PWA 性能优化案例，JS 内存泄露分析<\/a>&nbsp;(王下邀月熊(Chevalier))\r\n\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n\t<li><a href=\"https://ziaochina.github.io/mk-docs/\" target=\"_blank\">挺有意思的基于react、redux的框架<\/a>&nbsp;(liujian zhang)\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n<\/ul>\r\n\r\n<h3>拓展资源<\/h3>\r\n\r\n<ul>\r\n\t<li><a href=\"https://github.com/staltz/rxmarbles\" target=\"_blank\">Interactive diagrams of Rx Observables&nbsp;<\/a>(lxxself)\r\n\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n\t<li><a href=\"https://mp.weixin.qq.com/s?__biz=MzIwMzYwMTk1NA==&amp;mid=2247487208&amp;idx=1&amp;sn=649d54250b4532e79776e43b72687a95&amp;chksm=96cdafa5a1ba26b3036e01a05871fb915148cdef8705bef90d2150309993d05c598dabce2308&amp;mpshare=1&amp;scene=1&amp;srcid=1009sRmNkuS4uPEgIHCZUNux&amp;key=e6d796a385338d0eb43548dac3484adf38c2c8b046bcefea95e8c438f9c5d1978f7977167f4d0d97645e4c849a184cc4749a22cbfd78a5542ca95adb57822c61876038b619d744b47fdbb282e2c364ab&amp;ascene=0&amp;uin=MjI2ODA0ODAzNg%3D%3D&amp;devicetype=iMac+MacBookPro12%2C1+OSX+OSX+10.12.6+build(16G29)&amp;version=12020110&amp;nettype=WIFI&amp;fontScale=100&amp;pass_ticket=7r%2BLB6OQp%2FdECaTrYb7zxvfeWbnM217683SVq7VsscBuoeMuQP6uDdb4xxXbnLe%2F\" target=\"_blank\">他们说学历不重要，可怜你深信不疑<\/a>&nbsp;(陈宇明)\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n<\/ul>\r\n\r\n<h3>休息视频<\/h3>\r\n\r\n<ul>\r\n\t<li><a href=\"http://www.bilibili.com/video/av14551595/\" target=\"_blank\">细读经典 11: 这么多年过去，它依然是韩国电影的NO.1<\/a>&nbsp;(LHF)\r\n\r\n\t<ul>\r\n\t<\/ul>\r\n\t<\/li>\r\n<\/ul>\r\n\r\n<p>感谢所有默默付出的编辑们，愿大家有美好一天。<\/p>\r\n","created_at":"2017-10-09T13:07:38.474Z","publishedAt":"2017-10-09T13:07:00.0Z","rand_id":"dc895a0f-555e-4fc2-887a-ae3301b3dde3","title":"放假归来，安心上班。","updated_at":"2017-10-09T13:07:38.474Z"}]
     */

    public boolean error;
    public List<ResultsBean> results;

    public static Data objectFromData(String str) {

        return new Gson().fromJson(str, Data.class);
    }

    public static class ResultsBean {
        /**
         * _id : 59db041a421aa94e07d18486
         * content : <p><img alt="" src="https://ws1.sinaimg.cn/large/610dc034ly1fjxu5qqdjoj20qo0xc0wk.jpg" /></p>

         <h3>Android</h3>

         <ul>
         <li><a href="http://rkhcy.github.io/2017/09/27/TransitionNote2/" target="_blank">Transition学习笔记</a>&nbsp;(HuYounger)

         <ul>
         </ul>
         </li>
         <li><a href="https://github.com/jaychang0917/SimpleApiClient" target="_blank">A retrofit extension written in kotlin</a>&nbsp;(Jay)
         <ul>
         </ul>
         </li>
         <li><a href="https://github.com/zhihu/zhihu-rxjava-meetup" target="_blank">知乎 x RxJava Meetup 活动 PPT。</a>&nbsp;(代码家)
         <ul>
         <li><a href="https://github.com/zhihu/zhihu-rxjava-meetup" target="_blank"><img src="http://img.gank.io/404c29df-df48-4c43-aaec-b60fa1256388?imageView2/2/w/460" title="知乎 x RxJava Meetup 活动 PPT。" /></a></li>
         </ul>
         </li>
         <li><a href="https://blog.mindorks.com/what-are-coroutines-in-kotlin-bf4fecd476e9" target="_blank">What are Coroutines in Kotlin?</a>&nbsp;(AMIT SHEKHAR)
         <ul>
         </ul>
         </li>
         </ul>

         <h3>前端</h3>

         <ul>
         <li><a href="https://zhuanlan.zhihu.com/p/29446347" target="_blank">前端每周清单第 31 期: iOS 11 Viewport 解析，Preact PWA 性能优化案例，JS 内存泄露分析</a>&nbsp;(王下邀月熊(Chevalier))

         <ul>
         </ul>
         </li>
         <li><a href="https://ziaochina.github.io/mk-docs/" target="_blank">挺有意思的基于react、redux的框架</a>&nbsp;(liujian zhang)
         <ul>
         </ul>
         </li>
         </ul>

         <h3>拓展资源</h3>

         <ul>
         <li><a href="https://github.com/staltz/rxmarbles" target="_blank">Interactive diagrams of Rx Observables&nbsp;</a>(lxxself)

         <ul>
         </ul>
         </li>
         <li><a href="https://mp.weixin.qq.com/s?__biz=MzIwMzYwMTk1NA==&amp;mid=2247487208&amp;idx=1&amp;sn=649d54250b4532e79776e43b72687a95&amp;chksm=96cdafa5a1ba26b3036e01a05871fb915148cdef8705bef90d2150309993d05c598dabce2308&amp;mpshare=1&amp;scene=1&amp;srcid=1009sRmNkuS4uPEgIHCZUNux&amp;key=e6d796a385338d0eb43548dac3484adf38c2c8b046bcefea95e8c438f9c5d1978f7977167f4d0d97645e4c849a184cc4749a22cbfd78a5542ca95adb57822c61876038b619d744b47fdbb282e2c364ab&amp;ascene=0&amp;uin=MjI2ODA0ODAzNg%3D%3D&amp;devicetype=iMac+MacBookPro12%2C1+OSX+OSX+10.12.6+build(16G29)&amp;version=12020110&amp;nettype=WIFI&amp;fontScale=100&amp;pass_ticket=7r%2BLB6OQp%2FdECaTrYb7zxvfeWbnM217683SVq7VsscBuoeMuQP6uDdb4xxXbnLe%2F" target="_blank">他们说学历不重要，可怜你深信不疑</a>&nbsp;(陈宇明)
         <ul>
         </ul>
         </li>
         </ul>

         <h3>休息视频</h3>

         <ul>
         <li><a href="http://www.bilibili.com/video/av14551595/" target="_blank">细读经典 11: 这么多年过去，它依然是韩国电影的NO.1</a>&nbsp;(LHF)

         <ul>
         </ul>
         </li>
         </ul>

         <p>感谢所有默默付出的编辑们，愿大家有美好一天。</p>

         * created_at : 2017-10-09T13:07:38.474Z
         * publishedAt : 2017-10-09T13:07:00.0Z
         * rand_id : dc895a0f-555e-4fc2-887a-ae3301b3dde3
         * title : 放假归来，安心上班。
         * updated_at : 2017-10-09T13:07:38.474Z
         */

        public String _id;
        public String content;
        public String created_at;
        public String publishedAt;
        public String rand_id;
        public String title;
        public String updated_at;

        public static ResultsBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultsBean.class);
        }
    }
}
