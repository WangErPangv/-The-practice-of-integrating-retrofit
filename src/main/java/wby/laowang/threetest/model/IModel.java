package wby.laowang.threetest.model;

import java.util.Map;

public interface IModel {

    void getGoods(String url, Map<String, String> map, GoodsListener goodsListener);
}
