package wby.laowang.threetest.view;

import java.util.List;

import wby.laowang.threetest.model.ListGoodsBean;

public interface IMain {

    void showGoods(List<ListGoodsBean.DataBean> data);

    int pscid();
}
