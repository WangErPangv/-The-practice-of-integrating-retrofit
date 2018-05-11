package wby.laowang.threetest.presenter;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import wby.laowang.threetest.model.GoodsListener;
import wby.laowang.threetest.model.IModel;
import wby.laowang.threetest.model.ListGoodsBean;
import wby.laowang.threetest.util.ApiUtil;
import wby.laowang.threetest.view.IMain;


public class GoodsPresenter implements IPresenter {
    @Override
    public void showtoView(IModel iModel, final IMain iMain) {

        Map<String, String> gmap = new HashMap<>();
        gmap.put("pscid",String.valueOf(iMain.pscid()));

        iModel.getGoods(ApiUtil.goods_url, gmap, new GoodsListener() {
            @Override
            public void goodsSuccess(String json) {

                ListGoodsBean listGoodsBean = new Gson().fromJson(json, ListGoodsBean.class);
                List<ListGoodsBean.DataBean> data = listGoodsBean.getData();

                iMain.showGoods(data);
            }

            @Override
            public void goodsError(String error) {

            }
        });
    }
}
