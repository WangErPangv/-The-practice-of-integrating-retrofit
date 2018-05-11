package wby.laowang.threetest.view;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import wby.laowang.threetest.model.ListGoodsBean;

public interface IRetrofit {

    @GET("product/getProducts")
    Call<ListGoodsBean> getlistgoods(@Query("pscid") int pscid);
}
