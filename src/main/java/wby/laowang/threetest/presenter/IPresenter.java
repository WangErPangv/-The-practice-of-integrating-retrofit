package wby.laowang.threetest.presenter;


import wby.laowang.threetest.model.IModel;
import wby.laowang.threetest.view.IMain;

public interface IPresenter {

    void showtoView(IModel iModel, IMain iMain);
}
