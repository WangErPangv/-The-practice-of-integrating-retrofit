package wby.laowang.threetest.model;

public interface GoodsListener {

    void goodsSuccess(String json);
    void goodsError(String error);
}
