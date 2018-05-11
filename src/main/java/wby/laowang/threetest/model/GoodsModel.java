package wby.laowang.threetest.model;

import java.util.Map;

import wby.laowang.threetest.util.HttpUtils;


public class GoodsModel implements IModel {
    @Override
    public void getGoods(String url, Map<String, String> map, final GoodsListener goodsListener) {

        HttpUtils httpUtils = HttpUtils.getHttpUtils();
        httpUtils.okPost(url,map);
        httpUtils.setOkLoadListener(new HttpUtils.OkLoadListener() {
            @Override
            public void okLoadSuccess(String json) {
                goodsListener.goodsSuccess(json);
            }

            @Override
            public void okLoadError(String error) {
                goodsListener.goodsError(error);
            }
        });
    }
}
