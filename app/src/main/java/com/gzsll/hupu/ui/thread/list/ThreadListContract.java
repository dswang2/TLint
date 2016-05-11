package com.gzsll.hupu.ui.thread.list;

import com.gzsll.hupu.bean.Thread;
import com.gzsll.hupu.db.Forum;
import com.gzsll.hupu.ui.BasePresenter;
import com.gzsll.hupu.ui.BaseView;

import java.util.List;

/**
 * Created by sll on 2016/5/11.
 */
public interface ThreadListContract {
    interface View extends BaseView {
        void showLoading();

        void hideLoading();

        void renderThreadInfo(Forum forum);

        void renderThreads(List<Thread> threads);

        void onLoadCompleted(boolean hasMore);

        void onRefreshCompleted();

        void attendStatus(boolean isAttention);

        void onError(String error);

        void onEmpty();

        void onScrollToTop();

        void onFloatingVisibility(int visibility);
    }

    interface Presenter extends BasePresenter<View> {
        void onThreadReceive(String fid, String type, List<String> list);

        void onStartSearch(String key, int page);

        void addAttention();

        void delAttention();

        void onRefresh();

        void onReload();

        void onLoadMore();


    }
}